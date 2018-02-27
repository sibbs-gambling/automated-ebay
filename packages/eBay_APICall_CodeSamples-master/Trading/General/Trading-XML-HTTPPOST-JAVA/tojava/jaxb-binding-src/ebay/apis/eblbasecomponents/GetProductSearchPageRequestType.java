//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Retrieves the attributes a seller can use to form a query when
 * 				searching for Pre-filled Item Information to use in a listing for
 * 				a category that is catalog-enabled. This call is applicable for
 * 				use cases related to listing items with Pre-filled Item
 * 				Information. Specifically, it retrieves data
 * 				that you use to construct valid "single-attribute" queries. The
 * 				attributes describe search criteria (e.g., Author) and sorting
 * 				criteria (e.g., Publication Year), as appropriate for the
 * 				category. GetProductSearchPage does not conduct the actual
 * 				product search. It only returns data about what you can search
 * 				on. Use the data as input to GetProductSearchResults to conduct
 * 				the actual search for product information. To retrieve Product
 * 				Finder search criteria (querying against multiple attributes),
 * 				use GetProductFinder instead. See the eBay Web Services guide for
 * 				an overview of Pre-filled Item Information and details about
 * 				searching for catalog products.
 * 			
 * 
 * <p>Java class for GetProductSearchPageRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductSearchPageRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeSetID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductSearchPageRequestType", propOrder = {
    "attributeSystemVersion",
    "attributeSetID"
})
public class GetProductSearchPageRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "AttributeSystemVersion")
    protected String attributeSystemVersion;
    @XmlElement(name = "AttributeSetID", type = Integer.class)
    protected List<Integer> attributeSetID;

    /**
     * Gets the value of the attributeSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeSystemVersion() {
        return attributeSystemVersion;
    }

    /**
     * Sets the value of the attributeSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeSystemVersion(String value) {
        this.attributeSystemVersion = value;
    }

    /**
     * Gets the value of the attributeSetID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeSetID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeSetID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAttributeSetID() {
        if (attributeSetID == null) {
            attributeSetID = new ArrayList<Integer>();
        }
        return this.attributeSetID;
    }

}
