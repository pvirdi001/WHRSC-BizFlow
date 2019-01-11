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
 * <p>Java class for BoundCardTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BoundCardTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXT_PIV"/&gt;
 *     &lt;enumeration value="EXT_PIV_I"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BoundCardTypeCodeType")
@XmlEnum
public enum BoundCardTypeCodeType {


    /**
     * 
     *                         External PIV card issued by another federal government agency
     *                     
     * 
     */
    EXT_PIV,

    /**
     * 
     *                         External PIV interoperable card issued by a non federal government issuer
     *                     
     * 
     */
    EXT_PIV_I;

    public String value() {
        return name();
    }

    public static BoundCardTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}