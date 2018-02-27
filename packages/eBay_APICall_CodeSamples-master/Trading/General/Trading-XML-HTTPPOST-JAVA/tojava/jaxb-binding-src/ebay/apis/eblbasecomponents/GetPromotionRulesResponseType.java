//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns all promotion rules associated with the specified item or store category.
 * 			
 * 
 * <p>Java class for GetPromotionRulesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPromotionRulesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PromotionRuleArray" type="{urn:ebay:apis:eBLBaseComponents}PromotionRuleArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPromotionRulesResponseType", propOrder = {
    "promotionRuleArray"
})
public class GetPromotionRulesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "PromotionRuleArray")
    protected PromotionRuleArrayType promotionRuleArray;

    /**
     * Gets the value of the promotionRuleArray property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionRuleArrayType }
     *     
     */
    public PromotionRuleArrayType getPromotionRuleArray() {
        return promotionRuleArray;
    }

    /**
     * Sets the value of the promotionRuleArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionRuleArrayType }
     *     
     */
    public void setPromotionRuleArray(PromotionRuleArrayType value) {
        this.promotionRuleArray = value;
    }

}
