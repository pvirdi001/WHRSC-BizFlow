/**
 * GetFormatted_RunDateRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart;

public class GetFormatted_RunDateRequestType  implements java.io.Serializable {
    private com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.VersionSelection versionType;

    private com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.SessionType session;

    private java.lang.String format;

    private com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.PromptAnswersType promptAnswers;

    public GetFormatted_RunDateRequestType() {
    }

    public GetFormatted_RunDateRequestType(
           com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.VersionSelection versionType,
           com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.SessionType session,
           java.lang.String format,
           com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.PromptAnswersType promptAnswers) {
           this.versionType = versionType;
           this.session = session;
           this.format = format;
           this.promptAnswers = promptAnswers;
    }


    /**
     * Gets the versionType value for this GetFormatted_RunDateRequestType.
     * 
     * @return versionType
     */
    public com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.VersionSelection getVersionType() {
        return versionType;
    }


    /**
     * Sets the versionType value for this GetFormatted_RunDateRequestType.
     * 
     * @param versionType
     */
    public void setVersionType(com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.VersionSelection versionType) {
        this.versionType = versionType;
    }


    /**
     * Gets the session value for this GetFormatted_RunDateRequestType.
     * 
     * @return session
     */
    public com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.SessionType getSession() {
        return session;
    }


    /**
     * Sets the session value for this GetFormatted_RunDateRequestType.
     * 
     * @param session
     */
    public void setSession(com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.SessionType session) {
        this.session = session;
    }


    /**
     * Gets the format value for this GetFormatted_RunDateRequestType.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this GetFormatted_RunDateRequestType.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the promptAnswers value for this GetFormatted_RunDateRequestType.
     * 
     * @return promptAnswers
     */
    public com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.PromptAnswersType getPromptAnswers() {
        return promptAnswers;
    }


    /**
     * Sets the promptAnswers value for this GetFormatted_RunDateRequestType.
     * 
     * @param promptAnswers
     */
    public void setPromptAnswers(com.cognos.developer.schemas.raas.Returns__by__Order__Method___x002d__Prompted__Chart.PromptAnswersType promptAnswers) {
        this.promptAnswers = promptAnswers;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFormatted_RunDateRequestType)) return false;
        GetFormatted_RunDateRequestType other = (GetFormatted_RunDateRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.versionType==null && other.getVersionType()==null) || 
             (this.versionType!=null &&
              this.versionType.equals(other.getVersionType()))) &&
            ((this.session==null && other.getSession()==null) || 
             (this.session!=null &&
              this.session.equals(other.getSession()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.promptAnswers==null && other.getPromptAnswers()==null) || 
             (this.promptAnswers!=null &&
              this.promptAnswers.equals(other.getPromptAnswers())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
	public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getVersionType() != null) {
            _hashCode += getVersionType().hashCode();
        }
        if (getSession() != null) {
            _hashCode += getSession().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getPromptAnswers() != null) {
            _hashCode += getPromptAnswers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFormatted_RunDateRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/raas/Returns__by__Order__Method___x002d__Prompted__Chart", "GetFormatted_RunDateRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/raas/Returns__by__Order__Method___x002d__Prompted__Chart", "versionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/raas/Returns__by__Order__Method___x002d__Prompted__Chart", "VersionSelection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/raas/Returns__by__Order__Method___x002d__Prompted__Chart", "session"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/raas/Returns__by__Order__Method___x002d__Prompted__Chart", "SessionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/raas/Returns__by__Order__Method___x002d__Prompted__Chart", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promptAnswers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/raas/Returns__by__Order__Method___x002d__Prompted__Chart", "promptAnswers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://developer.cognos.com/schemas/raas/Returns__by__Order__Method___x002d__Prompted__Chart", "PromptAnswersType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
