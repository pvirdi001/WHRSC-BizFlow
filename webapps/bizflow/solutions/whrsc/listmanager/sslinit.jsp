<%@ page import="javax.net.ssl.*, java.io.PrintWriter" %>
<%@ page import="java.io.StringWriter" %>
<%@ page import="java.security.cert.CertificateException" %>
<%@ page import="java.security.cert.X509Certificate" %>

<%!
    public class SimpleTrustManager implements X509TrustManager {
        public SimpleTrustManager() {
            super();
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        }

        public boolean isClientTrusted(X509Certificate[] chain) {
            return true;
        }

        public boolean isServerTrusted(X509Certificate[] chain) {
            return true;
        }
    }

    void initSSL() throws Exception {

        HostnameVerifier hv = new HostnameVerifier() {
            public boolean verify(String urlHostName, SSLSession session) {
                return true;
            }
        };

        // Initialize SSL Context for HTTPS.  This must be done only once.
        SSLContext sslcontext = SSLContext.getInstance("SSL");
        // Initialize with Trust Manager.
        sslcontext.init(null, new TrustManager[]{new SimpleTrustManager()}, new java.security.SecureRandom());
        // Set Default Socket Factory for SSL.
        HttpsURLConnection.setDefaultSSLSocketFactory(sslcontext.getSocketFactory());
        // Set Default Host Name Verifier.
        HttpsURLConnection.setDefaultHostnameVerifier(hv);
    }

    void initSSLEx(HttpServletRequest request, String url) throws Exception {
        HttpSession session = request.getSession();
        String sslInited = (String) session.getServletContext().getAttribute("sslInited");
        String protocol = url.substring(0, 5);
        if (!"True".equals(sslInited) && "https".equalsIgnoreCase(protocol)) {
            initSSL();
            // Save this to application scope so that it won't be called again any more.
            session.getServletContext().setAttribute("sslInited", "True");
        }
    }

    Throwable getOriginalThrowable(Throwable e) {
        Throwable throwable2 = e.getCause();
        Throwable throwable1 = null != throwable2 ? throwable2 : e;

        while (null != throwable2) {
            throwable2 = throwable2.getCause();
            if (null != throwable2) {
                throwable1 = throwable2;
            }
        }

        return throwable1;
    }

    String exceptionToString(Throwable e) {
        StringWriter writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        e.printStackTrace(printWriter);
        return writer.toString();
    }

    String getOriginalExceptionString(Throwable e) {
        return exceptionToString(getOriginalThrowable(e));
    }

    String getOriginalExceptionMessage(Throwable e) {
        return getOriginalThrowable(e).getMessage();
    }
%>
