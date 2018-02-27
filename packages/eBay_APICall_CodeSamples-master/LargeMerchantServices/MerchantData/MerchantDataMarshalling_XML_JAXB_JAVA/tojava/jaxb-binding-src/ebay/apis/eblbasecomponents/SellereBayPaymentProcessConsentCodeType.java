//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
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
 * 				Type defining the <b>SellereBayPaymentProcessConsent</b> container, which is returned to all DE and
 * 				AT sellers, and consists of details of the seller's account status regarding the new eBay payment process.
 * 			  <br><br>
 * 			  Currently, this type is not applicable since the introduction of the new eBay payment
 * 				process for the Germany and Austria eBay sites has been delayed until further notice.
 * 			
 * 
 * <p>Java class for SellereBayPaymentProcessConsentCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellereBayPaymentProcessConsentCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PayoutMethodSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PayoutMethod" type="{urn:ebay:apis:eBLBaseComponents}PayoutMethodType" minOccurs="0"/>
 *         &lt;element name="UserAgreementInfo" type="{urn:ebay:apis:eBLBaseComponents}UserAgreementInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellereBayPaymentProcessConsentCodeType", propOrder = {
    "payoutMethodSet",
    "payoutMethod",
    "userAgreementInfo"
})
public class SellereBayPaymentProcessConsentCodeType {

    @XmlElement(name = "PayoutMethodSet")
    protected Boolean payoutMethodSet;
    @XmlElement(name = "PayoutMethod")
    protected PayoutMethodType payoutMethod;
    @XmlElement(name = "UserAgreementInfo")
    protected List<UserAgreementInfoType> userAgreementInfo;

    /**
     * Gets the value of the payoutMethodSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayoutMethodSet() {
        return payoutMethodSet;
    }

    /**
     * Sets the value of the payoutMethodSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayoutMethodSet(Boolean value) {
        this.payoutMethodSet = value;
    }

    /**
     * Gets the value of the payoutMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutMethodType }
     *     
     */
    public PayoutMethodType getPayoutMethod() {
        return payoutMethod;
    }

    /**
     * Sets the value of the payoutMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutMethodType }
     *     
     */
    public void setPayoutMethod(PayoutMethodType value) {
        this.payoutMethod = value;
    }

    /**
     * Gets the value of the userAgreementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAgreementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAgreementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAgreementInfoType }
     * 
     * 
     */
    public List<UserAgreementInfoType> getUserAgreementInfo() {
        if (userAgreementInfo == null) {
            userAgreementInfo = new ArrayList<UserAgreementInfoType>();
        }
        return this.userAgreementInfo;
    }

}
