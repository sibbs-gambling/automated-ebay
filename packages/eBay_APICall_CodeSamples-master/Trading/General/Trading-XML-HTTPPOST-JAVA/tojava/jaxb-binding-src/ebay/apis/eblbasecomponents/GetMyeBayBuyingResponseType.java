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
 * 				Returns items from All Buying or All Favorites in the user's My eBay account.
 * 			
 * 
 * <p>Java class for GetMyeBayBuyingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMyeBayBuyingResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="BuyingSummary" type="{urn:ebay:apis:eBLBaseComponents}BuyingSummaryType" minOccurs="0"/>
 *         &lt;element name="WatchList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="BidList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="BestOfferList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="WonList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedOrderTransactionArrayType" minOccurs="0"/>
 *         &lt;element name="LostList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="FavoriteSearches" type="{urn:ebay:apis:eBLBaseComponents}MyeBayFavoriteSearchListType" minOccurs="0"/>
 *         &lt;element name="FavoriteSellers" type="{urn:ebay:apis:eBLBaseComponents}MyeBayFavoriteSellerListType" minOccurs="0"/>
 *         &lt;element name="SecondChanceOffer" type="{urn:ebay:apis:eBLBaseComponents}ItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BidAssistantList" type="{urn:ebay:apis:eBLBaseComponents}BidGroupArrayType" minOccurs="0"/>
 *         &lt;element name="DeletedFromWonList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedOrderTransactionArrayType" minOccurs="0"/>
 *         &lt;element name="DeletedFromLostList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="UserDefinedList" type="{urn:ebay:apis:eBLBaseComponents}UserDefinedListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyeBayBuyingResponseType", propOrder = {
    "buyingSummary",
    "watchList",
    "bidList",
    "bestOfferList",
    "wonList",
    "lostList",
    "favoriteSearches",
    "favoriteSellers",
    "secondChanceOffer",
    "bidAssistantList",
    "deletedFromWonList",
    "deletedFromLostList",
    "userDefinedList"
})
public class GetMyeBayBuyingResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "BuyingSummary")
    protected BuyingSummaryType buyingSummary;
    @XmlElement(name = "WatchList")
    protected PaginatedItemArrayType watchList;
    @XmlElement(name = "BidList")
    protected PaginatedItemArrayType bidList;
    @XmlElement(name = "BestOfferList")
    protected PaginatedItemArrayType bestOfferList;
    @XmlElement(name = "WonList")
    protected PaginatedOrderTransactionArrayType wonList;
    @XmlElement(name = "LostList")
    protected PaginatedItemArrayType lostList;
    @XmlElement(name = "FavoriteSearches")
    protected MyeBayFavoriteSearchListType favoriteSearches;
    @XmlElement(name = "FavoriteSellers")
    protected MyeBayFavoriteSellerListType favoriteSellers;
    @XmlElement(name = "SecondChanceOffer")
    protected List<ItemType> secondChanceOffer;
    @XmlElement(name = "BidAssistantList")
    protected BidGroupArrayType bidAssistantList;
    @XmlElement(name = "DeletedFromWonList")
    protected PaginatedOrderTransactionArrayType deletedFromWonList;
    @XmlElement(name = "DeletedFromLostList")
    protected PaginatedItemArrayType deletedFromLostList;
    @XmlElement(name = "UserDefinedList")
    protected List<UserDefinedListType> userDefinedList;

    /**
     * Gets the value of the buyingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BuyingSummaryType }
     *     
     */
    public BuyingSummaryType getBuyingSummary() {
        return buyingSummary;
    }

    /**
     * Sets the value of the buyingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyingSummaryType }
     *     
     */
    public void setBuyingSummary(BuyingSummaryType value) {
        this.buyingSummary = value;
    }

    /**
     * Gets the value of the watchList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getWatchList() {
        return watchList;
    }

    /**
     * Sets the value of the watchList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setWatchList(PaginatedItemArrayType value) {
        this.watchList = value;
    }

    /**
     * Gets the value of the bidList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getBidList() {
        return bidList;
    }

    /**
     * Sets the value of the bidList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setBidList(PaginatedItemArrayType value) {
        this.bidList = value;
    }

    /**
     * Gets the value of the bestOfferList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getBestOfferList() {
        return bestOfferList;
    }

    /**
     * Sets the value of the bestOfferList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setBestOfferList(PaginatedItemArrayType value) {
        this.bestOfferList = value;
    }

    /**
     * Gets the value of the wonList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public PaginatedOrderTransactionArrayType getWonList() {
        return wonList;
    }

    /**
     * Sets the value of the wonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public void setWonList(PaginatedOrderTransactionArrayType value) {
        this.wonList = value;
    }

    /**
     * Gets the value of the lostList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getLostList() {
        return lostList;
    }

    /**
     * Sets the value of the lostList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setLostList(PaginatedItemArrayType value) {
        this.lostList = value;
    }

    /**
     * Gets the value of the favoriteSearches property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBayFavoriteSearchListType }
     *     
     */
    public MyeBayFavoriteSearchListType getFavoriteSearches() {
        return favoriteSearches;
    }

    /**
     * Sets the value of the favoriteSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBayFavoriteSearchListType }
     *     
     */
    public void setFavoriteSearches(MyeBayFavoriteSearchListType value) {
        this.favoriteSearches = value;
    }

    /**
     * Gets the value of the favoriteSellers property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBayFavoriteSellerListType }
     *     
     */
    public MyeBayFavoriteSellerListType getFavoriteSellers() {
        return favoriteSellers;
    }

    /**
     * Sets the value of the favoriteSellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBayFavoriteSellerListType }
     *     
     */
    public void setFavoriteSellers(MyeBayFavoriteSellerListType value) {
        this.favoriteSellers = value;
    }

    /**
     * Gets the value of the secondChanceOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondChanceOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondChanceOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getSecondChanceOffer() {
        if (secondChanceOffer == null) {
            secondChanceOffer = new ArrayList<ItemType>();
        }
        return this.secondChanceOffer;
    }

    /**
     * Gets the value of the bidAssistantList property.
     * 
     * @return
     *     possible object is
     *     {@link BidGroupArrayType }
     *     
     */
    public BidGroupArrayType getBidAssistantList() {
        return bidAssistantList;
    }

    /**
     * Sets the value of the bidAssistantList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidGroupArrayType }
     *     
     */
    public void setBidAssistantList(BidGroupArrayType value) {
        this.bidAssistantList = value;
    }

    /**
     * Gets the value of the deletedFromWonList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public PaginatedOrderTransactionArrayType getDeletedFromWonList() {
        return deletedFromWonList;
    }

    /**
     * Sets the value of the deletedFromWonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public void setDeletedFromWonList(PaginatedOrderTransactionArrayType value) {
        this.deletedFromWonList = value;
    }

    /**
     * Gets the value of the deletedFromLostList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getDeletedFromLostList() {
        return deletedFromLostList;
    }

    /**
     * Sets the value of the deletedFromLostList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setDeletedFromLostList(PaginatedItemArrayType value) {
        this.deletedFromLostList = value;
    }

    /**
     * Gets the value of the userDefinedList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedListType }
     * 
     * 
     */
    public List<UserDefinedListType> getUserDefinedList() {
        if (userDefinedList == null) {
            userDefinedList = new ArrayList<UserDefinedListType>();
        }
        return this.userDefinedList;
    }

}
