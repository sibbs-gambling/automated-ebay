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
 * <p>Java class for SellingManagerAutoRelistOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellingManagerAutoRelistOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="RelistImmediately"/>
 *     &lt;enumeration value="RelistAfterDaysHours"/>
 *     &lt;enumeration value="RelistAtSpecificTimeOfDay"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SellingManagerAutoRelistOptionCodeType")
@XmlEnum
public enum SellingManagerAutoRelistOptionCodeType {


    /**
     * 
     * 						Relist the item immediately.
     * 					
     * 
     */
    @XmlEnumValue("RelistImmediately")
    RELIST_IMMEDIATELY("RelistImmediately"),

    /**
     * 
     * 						Relist the item after a specified number of days and hours.
     * 					
     * 
     */
    @XmlEnumValue("RelistAfterDaysHours")
    RELIST_AFTER_DAYS_HOURS("RelistAfterDaysHours"),

    /**
     * 
     * 						Relist the item at a specified time of day.
     * 					
     * 
     */
    @XmlEnumValue("RelistAtSpecificTimeOfDay")
    RELIST_AT_SPECIFIC_TIME_OF_DAY("RelistAtSpecificTimeOfDay"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellingManagerAutoRelistOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerAutoRelistOptionCodeType fromValue(String v) {
        for (SellingManagerAutoRelistOptionCodeType c: SellingManagerAutoRelistOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
