//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Defines the DutchBINEnabled feature. If the field is present, the Buy It Now is
 * 				enabled in this category for Ducth (multi-item) auctions. The field is returned as an
 * 				empty element (i.e., a boolean value is not returned).
 * 				<br><br>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					As of version 619, Dutch-style (multi-item) competitive-bid auctions are deprecated.
 * 					eBay throws an error if you submit a Dutch item listing with AddItem
 * 					or VerifyAddItem. If you use RelistItem to update a Dutch auction listing,
 * 					eBay generates a warning and resets the Quantity value to 1.
 * 				</span>
 * 				<br>
 * 			
 * 
 * <p>Java class for DutchBINEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBINEnabledDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBINEnabledDefinitionType")
public class DutchBINEnabledDefinitionType {


}
