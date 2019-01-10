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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         		This Type defines the data elements describing the results for 
 *         		an attempt to compare the field values for two applicants.
 *         	
 * 
 * <p>Java class for SyncGetApplicantDataDiffResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncGetApplicantDataDiffResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Success-Same"/&gt;
 *               &lt;enumeration value="Success-Different"/&gt;
 *               &lt;enumeration value="NotFound"/&gt;
 *               &lt;enumeration value="Failed"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FieldDifference" type="{http://hspd12.hhs.gov/federated/enrollment/v1}ApplicantFieldDifferenceType" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="FailureDetailMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncGetApplicantDataDiffResultType", propOrder = {
    "resultCode",
    "fieldDifference",
    "failureDetailMessage"
})
public class SyncGetApplicantDataDiffResultType {

    @XmlElement(name = "ResultCode", required = true)
    protected String resultCode;
    @XmlElement(name = "FieldDifference")
    protected List<ApplicantFieldDifferenceType> fieldDifference;
    @XmlElement(name = "FailureDetailMessage")
    protected String failureDetailMessage;

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
     * Gets the value of the fieldDifference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldDifference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldDifference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicantFieldDifferenceType }
     * 
     * 
     */
    public List<ApplicantFieldDifferenceType> getFieldDifference() {
        if (fieldDifference == null) {
            fieldDifference = new ArrayList<ApplicantFieldDifferenceType>();
        }
        return this.fieldDifference;
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

}
