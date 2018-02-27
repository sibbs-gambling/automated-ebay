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
 * 			  Renames a Selling Manager inventory folder.
 * 				This call is subject to change without notice; the deprecation process is
 * 				inapplicable to this call.
 * 			
 * 
 * <p>Java class for ReviseSellingManagerInventoryFolderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseSellingManagerInventoryFolderRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Folder" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerFolderDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseSellingManagerInventoryFolderRequestType", propOrder = {
    "folder"
})
public class ReviseSellingManagerInventoryFolderRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "Folder")
    protected SellingManagerFolderDetailsType folder;

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link SellingManagerFolderDetailsType }
     *     
     */
    public SellingManagerFolderDetailsType getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingManagerFolderDetailsType }
     *     
     */
    public void setFolder(SellingManagerFolderDetailsType value) {
        this.folder = value;
    }

}
