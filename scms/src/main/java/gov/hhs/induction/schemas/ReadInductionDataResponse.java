//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.03 at 10:07:04 PM EDT 
//


package gov.hhs.induction.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="ResultCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Success"/&gt;
 *               &lt;enumeration value="NotFound"/&gt;
 *               &lt;enumeration value="Failed"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InductionData" type="{http://hspd12.hhs.gov/federated/enrollment/v1}InductionDataType" minOccurs="0"/&gt;
 *         &lt;element name="FacialImageTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastUpdateTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FailureDetailMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationState" type="{http://hspd12.hhs.gov/federated/enrollment/v1}RegistrationStateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RegistrarPI" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PersonIdType" minOccurs="0"/&gt;
 *         &lt;element name="IssuanceState" type="{http://hspd12.hhs.gov/federated/enrollment/v1}CardIssuanceStateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="IssuanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="IssuerPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "resultCode",
    "inductionData",
    "facialImageTimestamp",
    "lastUpdateTimestamp",
    "failureDetailMessage",
    "registrationState",
    "registrationDate",
    "registrarPI",
    "issuanceState",
    "issuanceDate",
    "issuerPI"
})
@XmlRootElement(name = "ReadInductionDataResponse")
public class ReadInductionDataResponse {

    @XmlElement(name = "ResultCode", required = true)
    protected String resultCode;
    @XmlElement(name = "InductionData")
    protected InductionDataType inductionData;
    @XmlElement(name = "FacialImageTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar facialImageTimestamp;
    @XmlElement(name = "LastUpdateTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateTimestamp;
    @XmlElement(name = "FailureDetailMessage")
    protected String failureDetailMessage;
    @XmlElement(name = "RegistrationState")
    @XmlSchemaType(name = "string")
    protected RegistrationStateCodeType registrationState;
    @XmlElement(name = "RegistrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "RegistrarPI")
    protected String registrarPI;
    @XmlElement(name = "IssuanceState")
    @XmlSchemaType(name = "string")
    protected CardIssuanceStateCodeType issuanceState;
    @XmlElement(name = "IssuanceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuanceDate;
    @XmlElement(name = "IssuerPI")
    protected String issuerPI;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the inductionData property.
     * 
     * @return
     *     possible object is
     *     {@link InductionDataType }
     *     
     */
    public InductionDataType getInductionData() {
        return inductionData;
    }

    /**
     * Sets the value of the inductionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InductionDataType }
     *     
     */
    public void setInductionData(InductionDataType value) {
        this.inductionData = value;
    }

    /**
     * Gets the value of the facialImageTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFacialImageTimestamp() {
        return facialImageTimestamp;
    }

    /**
     * Sets the value of the facialImageTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFacialImageTimestamp(XMLGregorianCalendar value) {
        this.facialImageTimestamp = value;
    }

    /**
     * Gets the value of the lastUpdateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    /**
     * Sets the value of the lastUpdateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTimestamp(XMLGregorianCalendar value) {
        this.lastUpdateTimestamp = value;
    }

    /**
     * Gets the value of the failureDetailMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureDetailMessage() {
        return failureDetailMessage;
    }

    /**
     * Sets the value of the failureDetailMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureDetailMessage(String value) {
        this.failureDetailMessage = value;
    }

    /**
     * Gets the value of the registrationState property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationStateCodeType }
     *     
     */
    public RegistrationStateCodeType getRegistrationState() {
        return registrationState;
    }

    /**
     * Sets the value of the registrationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationStateCodeType }
     *     
     */
    public void setRegistrationState(RegistrationStateCodeType value) {
        this.registrationState = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the registrarPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrarPI() {
        return registrarPI;
    }

    /**
     * Sets the value of the registrarPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrarPI(String value) {
        this.registrarPI = value;
    }

    /**
     * Gets the value of the issuanceState property.
     * 
     * @return
     *     possible object is
     *     {@link CardIssuanceStateCodeType }
     *     
     */
    public CardIssuanceStateCodeType getIssuanceState() {
        return issuanceState;
    }

    /**
     * Sets the value of the issuanceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIssuanceStateCodeType }
     *     
     */
    public void setIssuanceState(CardIssuanceStateCodeType value) {
        this.issuanceState = value;
    }

    /**
     * Gets the value of the issuanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuanceDate() {
        return issuanceDate;
    }

    /**
     * Sets the value of the issuanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuanceDate(XMLGregorianCalendar value) {
        this.issuanceDate = value;
    }

    /**
     * Gets the value of the issuerPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerPI() {
        return issuerPI;
    }

    /**
     * Sets the value of the issuerPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerPI(String value) {
        this.issuerPI = value;
    }

}