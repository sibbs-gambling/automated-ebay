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
 * 				Container for a list of offers. May contain zero, one, or multiple
 * 				OfferType objects, each of which represents one offer extended by
 * 				a user on a listing.
 * 			
 * 
 * <p>Java class for CancelOfferArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelOfferArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelOffer" type="{urn:ebay:apis:eBLBaseComponents}CancelOfferType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelOfferArrayType", propOrder = {
    "cancelOffer"
})
public class CancelOfferArrayType {

    @XmlElement(name = "CancelOffer")
    protected List<CancelOfferType> cancelOffer;

    /**
     * Gets the value of the cancelOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelOfferType }
     * 
     * 
     */
    public List<CancelOfferType> getCancelOffer() {
        if (cancelOffer == null) {
            cancelOffer = new ArrayList<CancelOfferType>();
        }
        return this.cancelOffer;
    }

}
