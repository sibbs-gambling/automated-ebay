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
 * 				Retrieves data that you use to construct valid "product finder" queries
 * 				(queries against multiple attributes) against catalog products or (in some cases) listed items.
 * 				The attributes describe search criteria (e.g., Manufacturer), as appropriate for the category.
 * 				Use the results in combination with GetProductFinderXSL to render the Product Finder
 * 				in a graphical user interface.<br>
 * 				<br>
 * 				GetProductFinder does not conduct the actual product or listing search.
 * 				It only returns data about what you can search on. Use the data as input to
 * 				GetProductSearchResults to conduct the actual search for product information
 * 				or as input to GetSearchResults to conduct the search for listed items.
 * 				(Please note that this call may not return valid product finder IDs for some
 * 				GetSearchResults use cases. See the Knowledge Base article referenced below for details.)<br>
 * 				<br>
 * 				To retrieve single-attribute search criteria (querying against a single attribute, like UPC),
 * 				use GetProductSearchPage instead (only applicable for catalog searches).<br>
 * 				<br>
 * 				See the eBay Web Services Guide for an overview of Pre-filled Item Information and details about
 * 				searching for catalog products and for information about searching for listed items.
 * 			
 * 
 * <p>Java class for GetProductFinderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductFinderRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductFinderID" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductFinderRequestType", propOrder = {
    "attributeSystemVersion",
    "productFinderID"
})
public class GetProductFinderRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "AttributeSystemVersion")
    protected String attributeSystemVersion;
    @XmlElement(name = "ProductFinderID", type = Integer.class)
    protected List<Integer> productFinderID;

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
     * Gets the value of the productFinderID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFinderID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFinderID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getProductFinderID() {
        if (productFinderID == null) {
            productFinderID = new ArrayList<Integer>();
        }
        return this.productFinderID;
    }

}
