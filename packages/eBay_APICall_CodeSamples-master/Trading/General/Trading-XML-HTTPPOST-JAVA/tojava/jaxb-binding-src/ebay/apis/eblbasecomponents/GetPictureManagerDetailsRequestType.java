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
 * 				Requests information about folders or pictures in a Picture Manager account
 * 				or the account settings.
 * 	    
 * 
 * <p>Java class for GetPictureManagerDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPictureManagerDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PictureManagerDetailLevel" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerDetailLevelCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPictureManagerDetailsRequestType", propOrder = {
    "folderID",
    "pictureURL",
    "pictureManagerDetailLevel"
})
public class GetPictureManagerDetailsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "FolderID")
    protected Integer folderID;
    @XmlElement(name = "PictureURL")
    protected String pictureURL;
    @XmlElement(name = "PictureManagerDetailLevel")
    protected PictureManagerDetailLevelCodeType pictureManagerDetailLevel;

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderID(Integer value) {
        this.folderID = value;
    }

    /**
     * Gets the value of the pictureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureURL() {
        return pictureURL;
    }

    /**
     * Sets the value of the pictureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureURL(String value) {
        this.pictureURL = value;
    }

    /**
     * Gets the value of the pictureManagerDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PictureManagerDetailLevelCodeType }
     *     
     */
    public PictureManagerDetailLevelCodeType getPictureManagerDetailLevel() {
        return pictureManagerDetailLevel;
    }

    /**
     * Sets the value of the pictureManagerDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerDetailLevelCodeType }
     *     
     */
    public void setPictureManagerDetailLevel(PictureManagerDetailLevelCodeType value) {
        this.pictureManagerDetailLevel = value;
    }

}
