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
 * 				Creates a Selling Manager listing template that is similar to an item.
 * 				This call is subject to change without notice; the
 * 				deprecation process is inapplicable to this call.
 * 			
 * 
 * <p>Java class for SaveItemToSellingManagerTemplateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveItemToSellingManagerTemplateRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveItemToSellingManagerTemplateRequestType", propOrder = {
    "itemID",
    "productID",
    "templateName"
})
public class SaveItemToSellingManagerTemplateRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "ProductID")
    protected Long productID;
    @XmlElement(name = "TemplateName")
    protected String templateName;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductID(Long value) {
        this.productID = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

}
