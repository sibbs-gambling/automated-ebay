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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Details relating to the forwarding of a message.
 * 			
 * 
 * <p>Java class for MyMessagesForwardDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesForwardDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserForwardDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ForwardMessageEncoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesForwardDetailsType", propOrder = {
    "userForwardDate",
    "forwardMessageEncoding"
})
public class MyMessagesForwardDetailsType {

    @XmlElement(name = "UserForwardDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userForwardDate;
    @XmlElement(name = "ForwardMessageEncoding")
    protected String forwardMessageEncoding;

    /**
     * Gets the value of the userForwardDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserForwardDate() {
        return userForwardDate;
    }

    /**
     * Sets the value of the userForwardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserForwardDate(XMLGregorianCalendar value) {
        this.userForwardDate = value;
    }

    /**
     * Gets the value of the forwardMessageEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardMessageEncoding() {
        return forwardMessageEncoding;
    }

    /**
     * Sets the value of the forwardMessageEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardMessageEncoding(String value) {
        this.forwardMessageEncoding = value;
    }

}
