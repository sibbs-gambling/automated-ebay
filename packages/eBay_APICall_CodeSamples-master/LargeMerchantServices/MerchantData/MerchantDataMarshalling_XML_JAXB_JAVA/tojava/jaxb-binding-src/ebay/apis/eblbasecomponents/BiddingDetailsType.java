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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>BiddingDetails</b> container, which consists of 
 * 				information about the buyer's bidding history on a single auction item. 
 * 			
 * 
 * <p>Java class for BiddingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConvertedMaxBid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="MaxBid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="QuantityBid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantityWon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Winning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BidAssistant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddingDetailsType", propOrder = {
    "convertedMaxBid",
    "maxBid",
    "quantityBid",
    "quantityWon",
    "winning",
    "bidAssistant"
})
public class BiddingDetailsType {

    @XmlElement(name = "ConvertedMaxBid")
    protected AmountType convertedMaxBid;
    @XmlElement(name = "MaxBid")
    protected AmountType maxBid;
    @XmlElement(name = "QuantityBid")
    protected Integer quantityBid;
    @XmlElement(name = "QuantityWon")
    protected Integer quantityWon;
    @XmlElement(name = "Winning")
    protected Boolean winning;
    @XmlElement(name = "BidAssistant")
    protected Boolean bidAssistant;

    /**
     * Gets the value of the convertedMaxBid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedMaxBid() {
        return convertedMaxBid;
    }

    /**
     * Sets the value of the convertedMaxBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedMaxBid(AmountType value) {
        this.convertedMaxBid = value;
    }

    /**
     * Gets the value of the maxBid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaxBid() {
        return maxBid;
    }

    /**
     * Sets the value of the maxBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaxBid(AmountType value) {
        this.maxBid = value;
    }

    /**
     * Gets the value of the quantityBid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityBid() {
        return quantityBid;
    }

    /**
     * Sets the value of the quantityBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityBid(Integer value) {
        this.quantityBid = value;
    }

    /**
     * Gets the value of the quantityWon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityWon() {
        return quantityWon;
    }

    /**
     * Sets the value of the quantityWon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityWon(Integer value) {
        this.quantityWon = value;
    }

    /**
     * Gets the value of the winning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWinning() {
        return winning;
    }

    /**
     * Sets the value of the winning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWinning(Boolean value) {
        this.winning = value;
    }

    /**
     * Gets the value of the bidAssistant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBidAssistant() {
        return bidAssistant;
    }

    /**
     * Sets the value of the bidAssistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBidAssistant(Boolean value) {
        this.bidAssistant = value;
    }

}