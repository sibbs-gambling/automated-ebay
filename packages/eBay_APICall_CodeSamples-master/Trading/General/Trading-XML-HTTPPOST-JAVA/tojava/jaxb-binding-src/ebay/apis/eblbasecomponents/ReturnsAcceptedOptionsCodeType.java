//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnsAcceptedOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnsAcceptedOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ReturnsAccepted"/>
 *     &lt;enumeration value="ReturnsNotAccepted"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnsAcceptedOptionsCodeType")
@XmlEnum
public enum ReturnsAcceptedOptionsCodeType {


    /**
     * 
     * 						The seller accepts returns, subject to other details 
     * 						specified in the policy.
     * 					
     * 
     */
    @XmlEnumValue("ReturnsAccepted")
    RETURNS_ACCEPTED("ReturnsAccepted"),

    /**
     * 
     * 						The seller does not accept returns.
     * 					
     * 
     */
    @XmlEnumValue("ReturnsNotAccepted")
    RETURNS_NOT_ACCEPTED("ReturnsNotAccepted"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ReturnsAcceptedOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnsAcceptedOptionsCodeType fromValue(String v) {
        for (ReturnsAcceptedOptionsCodeType c: ReturnsAcceptedOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}