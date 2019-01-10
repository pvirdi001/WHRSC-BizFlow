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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         		This Type defines the data items which will be used by the GetHHSID service call.
 *         	
 * 
 * <p>Java class for GetHHSIdDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHHSIdDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstName" type="{http://hspd12.hhs.gov/federated/enrollment/v1}FirstNameType" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://hspd12.hhs.gov/federated/enrollment/v1}LastNameType" minOccurs="0"/&gt;
 *         &lt;element name="HHSID" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PersonIdType" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://hspd12.hhs.gov/federated/enrollment/v1}EmailAddressType" minOccurs="0"/&gt;
 *         &lt;element name="OPDIV" type="{http://hspd12.hhs.gov/federated/enrollment/v1}OpdivCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHHSIdDataType", propOrder = {
    "firstName",
    "lastName",
    "hhsid",
    "emailAddress",
    "opdiv"
})
public class GetHHSIdDataType {

    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "HHSID")
    protected String hhsid;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "OPDIV")
    @XmlSchemaType(name = "string")
    protected OpdivCodeType opdiv;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the hhsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHHSID() {
        return hhsid;
    }

    /**
     * Sets the value of the hhsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHHSID(String value) {
        this.hhsid = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the opdiv property.
     * 
     * @return
     *     possible object is
     *     {@link OpdivCodeType }
     *     
     */
    public OpdivCodeType getOPDIV() {
        return opdiv;
    }

    /**
     * Sets the value of the opdiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpdivCodeType }
     *     
     */
    public void setOPDIV(OpdivCodeType value) {
        this.opdiv = value;
    }

}
