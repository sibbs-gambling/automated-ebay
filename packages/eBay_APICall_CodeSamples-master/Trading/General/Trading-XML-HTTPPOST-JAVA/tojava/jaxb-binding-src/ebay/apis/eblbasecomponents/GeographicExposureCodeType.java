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
 * <p>Java class for GeographicExposureCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeographicExposureCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="National"/>
 *     &lt;enumeration value="LocalOnly"/>
 *     &lt;enumeration value="LocalOptional"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeographicExposureCodeType")
@XmlEnum
public enum GeographicExposureCodeType {


    /**
     * 
     * 						Seller can not opt into local exposure. It has to be
     * 						national listing.
     * 					
     * 
     */
    @XmlEnumValue("National")
    NATIONAL("National"),

    /**
     * 
     * 						Seller can have Local listings only.
     * 					
     * 
     */
    @XmlEnumValue("LocalOnly")
    LOCAL_ONLY("LocalOnly"),

    /**
     * 
     * 						This will allow national and local listing.
     * 					
     * 
     */
    @XmlEnumValue("LocalOptional")
    LOCAL_OPTIONAL("LocalOptional"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    GeographicExposureCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeographicExposureCodeType fromValue(String v) {
        for (GeographicExposureCodeType c: GeographicExposureCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
