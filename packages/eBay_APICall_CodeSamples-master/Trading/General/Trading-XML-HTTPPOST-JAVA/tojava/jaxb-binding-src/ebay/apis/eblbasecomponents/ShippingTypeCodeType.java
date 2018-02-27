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
 * <p>Java class for ShippingTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Flat"/>
 *     &lt;enumeration value="Calculated"/>
 *     &lt;enumeration value="Freight"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="FlatDomesticCalculatedInternational"/>
 *     &lt;enumeration value="CalculatedDomesticFlatInternational"/>
 *     &lt;enumeration value="FreightFlat"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingTypeCodeType")
@XmlEnum
public enum ShippingTypeCodeType {


    /**
     * 
     * 						Flat shipping model: the seller establishes the cost
     * 						of shipping and cost of shipping insurance, regardless of
     * 						what any buyer-selected shipping service might charge the
     * 						seller.
     * 					
     * 
     */
    @XmlEnumValue("Flat")
    FLAT("Flat"),

    /**
     * 
     * 						Calculated shipping model: the cost of shipping is
     * 						determined in large part by the seller-offered and
     * 						buyer-selected shipping service. The seller might assess an
     * 						additional fee via PackagingHandlingCosts.
     * 					
     * 
     */
    @XmlEnumValue("Calculated")
    CALCULATED("Calculated"),

    /**
     * 
     * 						Freight shipping model: the cost of shipping is
     * 						determined by a third party, FreightQuote.com, based on the item
     * 						location (zip code). Currently, Freight can only be specified
     * 						on input via eBay Web site, not API.
     * 					
     * 
     */
    @XmlEnumValue("Freight")
    FREIGHT("Freight"),

    /**
     * 
     * 						Free shipping. Returned only by GetSearchResults and GetProducts.
     * 						This field is output-only so if you want to use AddItem to specify a free
     * 						Shipping Cost, specify 0 in
     * 						Item.ShippingDetails.ShippingServiceOptions.ShippingServiceCost.
     * 					
     * 
     */
    @XmlEnumValue("Free")
    FREE("Free"),

    /**
     * 
     * 						The seller did not specify the shipping type.
     * 					
     * 
     */
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),

    /**
     * 
     * 						The seller specified one or more flat domestic shipping services
     * 						and one or more calculated international shipping services.
     * 					
     * 
     */
    @XmlEnumValue("FlatDomesticCalculatedInternational")
    FLAT_DOMESTIC_CALCULATED_INTERNATIONAL("FlatDomesticCalculatedInternational"),

    /**
     * 
     * 						The seller specified one or more calculated domestic shipping services
     * 						and one or more flat international shipping services.
     * 					
     * 
     */
    @XmlEnumValue("CalculatedDomesticFlatInternational")
    CALCULATED_DOMESTIC_FLAT_INTERNATIONAL("CalculatedDomesticFlatInternational"),

    /**
     * 
     * 						Freight shipping model: freight shipping may be used when
     * 						flat or calculated shipping cannot be used due to the greater weight
     * 						of the item.  See "Specifying Freight Shipping" in the Shipping
     * 						chapter for details on freight shipping.
     * 					
     * 
     */
    @XmlEnumValue("FreightFlat")
    FREIGHT_FLAT("FreightFlat"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingTypeCodeType fromValue(String v) {
        for (ShippingTypeCodeType c: ShippingTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
