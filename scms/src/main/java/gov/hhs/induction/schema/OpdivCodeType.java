//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 11:07:08 PM EST 
//


package gov.hhs.induction.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpdivCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpdivCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="50"/&gt;
 *     &lt;enumeration value="AHRQ"/&gt;
 *     &lt;enumeration value="ACF"/&gt;
 *     &lt;enumeration value="ACL"/&gt;
 *     &lt;enumeration value="CDC"/&gt;
 *     &lt;enumeration value="FDA"/&gt;
 *     &lt;enumeration value="CMS"/&gt;
 *     &lt;enumeration value="HRSA"/&gt;
 *     &lt;enumeration value="SAMHSA"/&gt;
 *     &lt;enumeration value="OS"/&gt;
 *     &lt;enumeration value="OIG"/&gt;
 *     &lt;enumeration value="NIH"/&gt;
 *     &lt;enumeration value="IHS"/&gt;
 *     &lt;enumeration value="PSC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpdivCodeType")
@XmlEnum
public enum OpdivCodeType {


    /**
     * Agency for Healthcare Research and Quality
     * 
     */
    AHRQ,

    /**
     * Administration for Children and Families
     * 
     */
    ACF,

    /**
     * Administration for Community Living
     * 
     */
    ACL,

    /**
     * Centers for Disease Control and Prevention
     * 
     */
    CDC,

    /**
     * Food and Drug Administration
     * 
     */
    FDA,

    /**
     * Centers for Medicare & Medicaid Services
     * 
     */
    CMS,

    /**
     * Health Resources and Services Administration
     * 
     */
    HRSA,

    /**
     * Substance Abuse & Mental Health Services Administration
     * 
     */
    SAMHSA,

    /**
     * Office of the Secretary
     * 
     */
    OS,

    /**
     * Office of the Inspector General
     * 
     */
    OIG,

    /**
     * National Institutes of Health
     * 
     */
    NIH,

    /**
     * Indian Health Service
     * 
     */
    IHS,

    /**
     * Program Support Center
     * 
     */
    PSC;

    public String value() {
        return name();
    }

    public static OpdivCodeType fromValue(String v) {
        return valueOf(v);
    }

}
