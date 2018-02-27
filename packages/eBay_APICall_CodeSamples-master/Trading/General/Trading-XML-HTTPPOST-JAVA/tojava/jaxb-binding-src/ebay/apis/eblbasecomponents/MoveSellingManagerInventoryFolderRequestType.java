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
 * 			  Moves a Selling Manager inventory folder.
 * 				<br><br>
 * 				This call is subject to change without notice; the deprecation process is
 * 				inapplicable to this call.
 * 			
 * 
 * <p>Java class for MoveSellingManagerInventoryFolderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveSellingManagerInventoryFolderRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NewParentFolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveSellingManagerInventoryFolderRequestType", propOrder = {
    "folderID",
    "newParentFolderID"
})
public class MoveSellingManagerInventoryFolderRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "FolderID")
    protected Long folderID;
    @XmlElement(name = "NewParentFolderID")
    protected Long newParentFolderID;

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderID(Long value) {
        this.folderID = value;
    }

    /**
     * Gets the value of the newParentFolderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewParentFolderID() {
        return newParentFolderID;
    }

    /**
     * Sets the value of the newParentFolderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewParentFolderID(Long value) {
        this.newParentFolderID = value;
    }

}
