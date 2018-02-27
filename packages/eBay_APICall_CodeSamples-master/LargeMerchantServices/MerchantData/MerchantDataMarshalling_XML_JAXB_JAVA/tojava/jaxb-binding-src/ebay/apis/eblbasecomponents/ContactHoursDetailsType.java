//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
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
 * 			Contains the data for primary and secondary contact hours for a given eBay user.
 * 		
 * 
 * <p>Java class for ContactHoursDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactHoursDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeZoneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hours1Days" type="{urn:ebay:apis:eBLBaseComponents}DaysCodeType" minOccurs="0"/>
 *         &lt;element name="Hours1AnyTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hours1From" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Hours1To" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Hours2Days" type="{urn:ebay:apis:eBLBaseComponents}DaysCodeType" minOccurs="0"/>
 *         &lt;element name="Hours2AnyTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hours2From" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Hours2To" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactHoursDetailsType", propOrder = {
    "timeZoneID",
    "hours1Days",
    "hours1AnyTime",
    "hours1From",
    "hours1To",
    "hours2Days",
    "hours2AnyTime",
    "hours2From",
    "hours2To"
})
public class ContactHoursDetailsType {

    @XmlElement(name = "TimeZoneID")
    protected String timeZoneID;
    @XmlElement(name = "Hours1Days")
    protected DaysCodeType hours1Days;
    @XmlElement(name = "Hours1AnyTime")
    protected Boolean hours1AnyTime;
    @XmlElement(name = "Hours1From")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hours1From;
    @XmlElement(name = "Hours1To")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hours1To;
    @XmlElement(name = "Hours2Days")
    protected DaysCodeType hours2Days;
    @XmlElement(name = "Hours2AnyTime")
    protected Boolean hours2AnyTime;
    @XmlElement(name = "Hours2From")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hours2From;
    @XmlElement(name = "Hours2To")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hours2To;

    /**
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneID(String value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the hours1Days property.
     * 
     * @return
     *     possible object is
     *     {@link DaysCodeType }
     *     
     */
    public DaysCodeType getHours1Days() {
        return hours1Days;
    }

    /**
     * Sets the value of the hours1Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysCodeType }
     *     
     */
    public void setHours1Days(DaysCodeType value) {
        this.hours1Days = value;
    }

    /**
     * Gets the value of the hours1AnyTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHours1AnyTime() {
        return hours1AnyTime;
    }

    /**
     * Sets the value of the hours1AnyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHours1AnyTime(Boolean value) {
        this.hours1AnyTime = value;
    }

    /**
     * Gets the value of the hours1From property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHours1From() {
        return hours1From;
    }

    /**
     * Sets the value of the hours1From property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHours1From(XMLGregorianCalendar value) {
        this.hours1From = value;
    }

    /**
     * Gets the value of the hours1To property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHours1To() {
        return hours1To;
    }

    /**
     * Sets the value of the hours1To property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHours1To(XMLGregorianCalendar value) {
        this.hours1To = value;
    }

    /**
     * Gets the value of the hours2Days property.
     * 
     * @return
     *     possible object is
     *     {@link DaysCodeType }
     *     
     */
    public DaysCodeType getHours2Days() {
        return hours2Days;
    }

    /**
     * Sets the value of the hours2Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysCodeType }
     *     
     */
    public void setHours2Days(DaysCodeType value) {
        this.hours2Days = value;
    }

    /**
     * Gets the value of the hours2AnyTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHours2AnyTime() {
        return hours2AnyTime;
    }

    /**
     * Sets the value of the hours2AnyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHours2AnyTime(Boolean value) {
        this.hours2AnyTime = value;
    }

    /**
     * Gets the value of the hours2From property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHours2From() {
        return hours2From;
    }

    /**
     * Sets the value of the hours2From property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHours2From(XMLGregorianCalendar value) {
        this.hours2From = value;
    }

    /**
     * Gets the value of the hours2To property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHours2To() {
        return hours2To;
    }

    /**
     * Sets the value of the hours2To property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHours2To(XMLGregorianCalendar value) {
        this.hours2To = value;
    }

}
