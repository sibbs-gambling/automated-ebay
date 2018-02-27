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
 * <p>Java class for SellingManagerPaidStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerPaidStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="PartiallyPaid"/>
 *     &lt;enumeration value="Unpaid"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SellingManagerPaidStatusCodeType")
@XmlEnum
public enum SellingManagerPaidStatusCodeType {


    /**
     * 
     * 						The status of the order is "paid."
     * 					
     * 
     */
    @XmlEnumValue("Paid")
    PAID("Paid"),

    /**
     * 
     * 						The status of the order is "partially paid."
     * 					
     * 
     */
    @XmlEnumValue("PartiallyPaid")
    PARTIALLY_PAID("PartiallyPaid"),

    /**
     * 
     * 						The status of the order is "unpaid."
     * 					
     * 
     */
    @XmlEnumValue("Unpaid")
    UNPAID("Unpaid"),

    /**
     * 
     * 						The status of the order is "pending."
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						The status of the order is "refunded."
     * 					
     * 
     */
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerPaidStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerPaidStatusCodeType fromValue(String v) {
        for (SellingManagerPaidStatusCodeType c: SellingManagerPaidStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
