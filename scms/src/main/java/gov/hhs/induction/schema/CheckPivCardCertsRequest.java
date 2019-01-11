//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 11:07:08 PM EST 
//


package gov.hhs.induction.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopOnFirstCertNotCheckable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PivAuthenticationCertDer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="PivDigitalSignatureCertDer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="PivKeyManagementCertDer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="PivCardAuthenticationCertDer" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stopOnFirstCertNotCheckable",
    "pivAuthenticationCertDer",
    "pivDigitalSignatureCertDer",
    "pivKeyManagementCertDer",
    "pivCardAuthenticationCertDer"
})
@XmlRootElement(name = "CheckPivCardCertsRequest", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
public class CheckPivCardCertsRequest {

    @XmlElement(name = "StopOnFirstCertNotCheckable", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected boolean stopOnFirstCertNotCheckable;
    @XmlElement(name = "PivAuthenticationCertDer", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected byte[] pivAuthenticationCertDer;
    @XmlElement(name = "PivDigitalSignatureCertDer", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected byte[] pivDigitalSignatureCertDer;
    @XmlElement(name = "PivKeyManagementCertDer", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected byte[] pivKeyManagementCertDer;
    @XmlElement(name = "PivCardAuthenticationCertDer", namespace = "http://hspd12.hhs.gov/piv/binding/v1")
    protected byte[] pivCardAuthenticationCertDer;

    /**
     * Gets the value of the stopOnFirstCertNotCheckable property.
     * 
     */
    public boolean isStopOnFirstCertNotCheckable() {
        return stopOnFirstCertNotCheckable;
    }

    /**
     * Sets the value of the stopOnFirstCertNotCheckable property.
     * 
     */
    public void setStopOnFirstCertNotCheckable(boolean value) {
        this.stopOnFirstCertNotCheckable = value;
    }

    /**
     * Gets the value of the pivAuthenticationCertDer property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPivAuthenticationCertDer() {
        return pivAuthenticationCertDer;
    }

    /**
     * Sets the value of the pivAuthenticationCertDer property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPivAuthenticationCertDer(byte[] value) {
        this.pivAuthenticationCertDer = value;
    }

    /**
     * Gets the value of the pivDigitalSignatureCertDer property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPivDigitalSignatureCertDer() {
        return pivDigitalSignatureCertDer;
    }

    /**
     * Sets the value of the pivDigitalSignatureCertDer property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPivDigitalSignatureCertDer(byte[] value) {
        this.pivDigitalSignatureCertDer = value;
    }

    /**
     * Gets the value of the pivKeyManagementCertDer property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPivKeyManagementCertDer() {
        return pivKeyManagementCertDer;
    }

    /**
     * Sets the value of the pivKeyManagementCertDer property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPivKeyManagementCertDer(byte[] value) {
        this.pivKeyManagementCertDer = value;
    }

    /**
     * Gets the value of the pivCardAuthenticationCertDer property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPivCardAuthenticationCertDer() {
        return pivCardAuthenticationCertDer;
    }

    /**
     * Sets the value of the pivCardAuthenticationCertDer property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPivCardAuthenticationCertDer(byte[] value) {
        this.pivCardAuthenticationCertDer = value;
    }

}