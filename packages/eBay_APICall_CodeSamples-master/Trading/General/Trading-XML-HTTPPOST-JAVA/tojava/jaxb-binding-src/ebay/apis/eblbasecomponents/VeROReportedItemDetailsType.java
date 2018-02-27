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
 * 				Container for a list of reported items. Can contain zero, one, or multiple
 * 				VeROReportedItemType objects, each of which conveys the data for one item listing.
 * 			
 * 
 * <p>Java class for VeROReportedItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReportedItemDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportedItem" type="{urn:ebay:apis:eBLBaseComponents}VeROReportedItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeROReportedItemDetailsType", propOrder = {
    "reportedItem"
})
public class VeROReportedItemDetailsType {

    @XmlElement(name = "ReportedItem")
    protected List<VeROReportedItemType> reportedItem;

    /**
     * Gets the value of the reportedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VeROReportedItemType }
     * 
     * 
     */
    public List<VeROReportedItemType> getReportedItem() {
        if (reportedItem == null) {
            reportedItem = new ArrayList<VeROReportedItemType>();
        }
        return this.reportedItem;
    }

}
