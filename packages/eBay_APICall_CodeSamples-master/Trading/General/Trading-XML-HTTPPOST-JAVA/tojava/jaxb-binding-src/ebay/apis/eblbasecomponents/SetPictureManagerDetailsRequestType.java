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
 * 				<table>
 * 					<tr>
 * 						<td class="notebox">
 * 							<b>Note:</b> This call will soon be deprecated. Use accordingly.
 * 						</td>
 * 					</tr>
 * 				</table>
 * 				<br>
 * 	      Creates, updates, or deletes Picture Manager account settings, folders, or pictures.
 * 	    
 * 
 * <p>Java class for SetPictureManagerDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetPictureManagerDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PictureManagerDetails" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerDetailsType" minOccurs="0"/>
 *         &lt;element name="Action" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerActionCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetPictureManagerDetailsRequestType", propOrder = {
    "pictureManagerDetails",
    "action"
})
public class SetPictureManagerDetailsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "PictureManagerDetails")
    protected PictureManagerDetailsType pictureManagerDetails;
    @XmlElement(name = "Action")
    protected PictureManagerActionCodeType action;

    /**
     * Gets the value of the pictureManagerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PictureManagerDetailsType }
     *     
     */
    public PictureManagerDetailsType getPictureManagerDetails() {
        return pictureManagerDetails;
    }

    /**
     * Sets the value of the pictureManagerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerDetailsType }
     *     
     */
    public void setPictureManagerDetails(PictureManagerDetailsType value) {
        this.pictureManagerDetails = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link PictureManagerActionCodeType }
     *     
     */
    public PictureManagerActionCodeType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerActionCodeType }
     *     
     */
    public void setAction(PictureManagerActionCodeType value) {
        this.action = value;
    }

}
