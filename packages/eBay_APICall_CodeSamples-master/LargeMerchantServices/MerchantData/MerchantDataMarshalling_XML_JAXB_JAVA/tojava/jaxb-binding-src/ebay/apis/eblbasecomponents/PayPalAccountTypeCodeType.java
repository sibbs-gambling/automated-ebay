//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayPalAccountTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayPalAccountTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Premier"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayPalAccountTypeCodeType")
@XmlEnum
public enum PayPalAccountTypeCodeType {


    /**
     * 
     * 						Personal account.
     * 					
     * 
     */
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),

    /**
     * 
     * 						Premier account.
     * 					
     * 
     */
    @XmlEnumValue("Premier")
    PREMIER("Premier"),

    /**
     * 
     * 						Business account.
     * 					
     * 
     */
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 						 Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PayPalAccountTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayPalAccountTypeCodeType fromValue(String v) {
        for (PayPalAccountTypeCodeType c: PayPalAccountTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
