//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 11:07:08 PM EST 
//


package gov.hhs.induction.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="TransactionHeader" type="{http://hspd12.hhs.gov/federated/enrollment/v1}TransactionHeaderType"/&gt;
 *         &lt;element name="TargetOPDIV" type="{http://hspd12.hhs.gov/federated/enrollment/v1}OpdivCodeType"/&gt;
 *         &lt;element name="ApplicantDataField" type="{http://hspd12.hhs.gov/federated/enrollment/v1}SyncApplicantDataFieldsEnumType" maxOccurs="100"/&gt;
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
    "transactionHeader",
    "targetOPDIV",
    "applicantDataField"
})
@XmlRootElement(name = "SyncSetOpdivHashedFieldsRequest")
public class SyncSetOpdivHashedFieldsRequest {

    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeaderType transactionHeader;
    @XmlElement(name = "TargetOPDIV", required = true)
    @XmlSchemaType(name = "string")
    protected OpdivCodeType targetOPDIV;
    @XmlElement(name = "ApplicantDataField", required = true)
    @XmlSchemaType(name = "string")
    protected List<SyncApplicantDataFieldsEnumType> applicantDataField;

    /**
     * Gets the value of the transactionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHeaderType }
     *     
     */
    public TransactionHeaderType getTransactionHeader() {
        return transactionHeader;
    }

    /**
     * Sets the value of the transactionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHeaderType }
     *     
     */
    public void setTransactionHeader(TransactionHeaderType value) {
        this.transactionHeader = value;
    }

    /**
     * Gets the value of the targetOPDIV property.
     * 
     * @return
     *     possible object is
     *     {@link OpdivCodeType }
     *     
     */
    public OpdivCodeType getTargetOPDIV() {
        return targetOPDIV;
    }

    /**
     * Sets the value of the targetOPDIV property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpdivCodeType }
     *     
     */
    public void setTargetOPDIV(OpdivCodeType value) {
        this.targetOPDIV = value;
    }

    /**
     * Gets the value of the applicantDataField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicantDataField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicantDataField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyncApplicantDataFieldsEnumType }
     * 
     * 
     */
    public List<SyncApplicantDataFieldsEnumType> getApplicantDataField() {
        if (applicantDataField == null) {
            applicantDataField = new ArrayList<SyncApplicantDataFieldsEnumType>();
        }
        return this.applicantDataField;
    }

}
