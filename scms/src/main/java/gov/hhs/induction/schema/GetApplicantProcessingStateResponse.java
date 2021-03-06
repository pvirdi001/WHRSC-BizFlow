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
 *         &lt;element name="MissingInductionData" type="{http://hspd12.hhs.gov/federated/enrollment/v1}MissingInductionDataInfoType" minOccurs="0"/&gt;
 *         &lt;element name="FailureDetailMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentState" type="{http://hspd12.hhs.gov/federated/enrollment/v1}ProcessingStateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="NextState" type="{http://hspd12.hhs.gov/federated/enrollment/v1}ProcessingStateCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InductionDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="InductorPI" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PersonIdType" minOccurs="0"/&gt;
 *         &lt;element name="SponsorDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SponsorPI" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PersonIdType" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RegistrarPI" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PersonIdType" minOccurs="0"/&gt;
 *         &lt;element name="IssuanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="IssuerPI" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PersonIdType" minOccurs="0"/&gt;
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
    "missingInductionData",
    "failureDetailMessage",
    "currentState",
    "nextState",
    "processingBlocked",
    "inductionDate",
    "inductorPI",
    "sponsorDate",
    "sponsorPI",
    "registrationDate",
    "registrarPI",
    "issuanceDate",
    "issuerPI"
})
@XmlRootElement(name = "GetApplicantProcessingStateResponse")
public class GetApplicantProcessingStateResponse {

    @XmlElement(name = "ResultCode", required = true)
    protected String resultCode;
    @XmlElement(name = "MissingInductionData")
    protected MissingInductionDataInfoType missingInductionData;
    @XmlElement(name = "FailureDetailMessage")
    protected String failureDetailMessage;
    @XmlElement(name = "CurrentState")
    @XmlSchemaType(name = "string")
    protected ProcessingStateCodeType currentState;
    @XmlElement(name = "NextState")
    @XmlSchemaType(name = "string")
    protected ProcessingStateCodeType nextState;
    @XmlElement(name = "ProcessingBlocked")
    protected Boolean processingBlocked;
    @XmlElement(name = "InductionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inductionDate;
    @XmlElement(name = "InductorPI")
    protected String inductorPI;
    @XmlElement(name = "SponsorDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sponsorDate;
    @XmlElement(name = "SponsorPI")
    protected String sponsorPI;
    @XmlElement(name = "RegistrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "RegistrarPI")
    protected String registrarPI;
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
     * Gets the value of the missingInductionData property.
     * 
     * @return
     *     possible object is
     *     {@link MissingInductionDataInfoType }
     *     
     */
    public MissingInductionDataInfoType getMissingInductionData() {
        return missingInductionData;
    }

    /**
     * Sets the value of the missingInductionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingInductionDataInfoType }
     *     
     */
    public void setMissingInductionData(MissingInductionDataInfoType value) {
        this.missingInductionData = value;
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
     * Gets the value of the currentState property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStateCodeType }
     *     
     */
    public ProcessingStateCodeType getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStateCodeType }
     *     
     */
    public void setCurrentState(ProcessingStateCodeType value) {
        this.currentState = value;
    }

    /**
     * Gets the value of the nextState property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStateCodeType }
     *     
     */
    public ProcessingStateCodeType getNextState() {
        return nextState;
    }

    /**
     * Sets the value of the nextState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStateCodeType }
     *     
     */
    public void setNextState(ProcessingStateCodeType value) {
        this.nextState = value;
    }

    /**
     * Gets the value of the processingBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessingBlocked() {
        return processingBlocked;
    }

    /**
     * Sets the value of the processingBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessingBlocked(Boolean value) {
        this.processingBlocked = value;
    }

    /**
     * Gets the value of the inductionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInductionDate() {
        return inductionDate;
    }

    /**
     * Sets the value of the inductionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInductionDate(XMLGregorianCalendar value) {
        this.inductionDate = value;
    }

    /**
     * Gets the value of the inductorPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInductorPI() {
        return inductorPI;
    }

    /**
     * Sets the value of the inductorPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInductorPI(String value) {
        this.inductorPI = value;
    }

    /**
     * Gets the value of the sponsorDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSponsorDate() {
        return sponsorDate;
    }

    /**
     * Sets the value of the sponsorDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSponsorDate(XMLGregorianCalendar value) {
        this.sponsorDate = value;
    }

    /**
     * Gets the value of the sponsorPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorPI() {
        return sponsorPI;
    }

    /**
     * Sets the value of the sponsorPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorPI(String value) {
        this.sponsorPI = value;
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
