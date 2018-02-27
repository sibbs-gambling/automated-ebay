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
 * <p>Java class for TaxTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SalesTax"/>
 *     &lt;enumeration value="WasteRecyclingFee"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxTypeCodeType")
@XmlEnum
public enum TaxTypeCodeType {


    /**
     * 
     * 						A standard sales tax charge.
     * 					
     * 
     */
    @XmlEnumValue("SalesTax")
    SALES_TAX("SalesTax"),

    /**
     * 
     * 						A charge for an electronic waste recycling fee.
     * 					 
     * 
     */
    @XmlEnumValue("WasteRecyclingFee")
    WASTE_RECYCLING_FEE("WasteRecyclingFee"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TaxTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxTypeCodeType fromValue(String v) {
        for (TaxTypeCodeType c: TaxTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
