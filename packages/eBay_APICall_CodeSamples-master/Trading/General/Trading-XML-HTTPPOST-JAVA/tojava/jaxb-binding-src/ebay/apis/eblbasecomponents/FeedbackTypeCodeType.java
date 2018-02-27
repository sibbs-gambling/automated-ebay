//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedbackTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedbackTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FeedbackReceivedAsSeller"/>
 *     &lt;enumeration value="FeedbackReceivedAsBuyer"/>
 *     &lt;enumeration value="FeedbackReceived"/>
 *     &lt;enumeration value="FeedbackLeft"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedbackTypeCodeType")
@XmlEnum
public enum FeedbackTypeCodeType {


    /**
     * 
     * 								Retrieves feedback left by all buyers for this user.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceivedAsSeller")
    FEEDBACK_RECEIVED_AS_SELLER("FeedbackReceivedAsSeller"),

    /**
     * 
     * 								Retrieves feedback left by all sellers for this user.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceivedAsBuyer")
    FEEDBACK_RECEIVED_AS_BUYER("FeedbackReceivedAsBuyer"),

    /**
     * 
     * 								Retrieves feedback left by all buyers and all sellers for this user.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceived")
    FEEDBACK_RECEIVED("FeedbackReceived"),

    /**
     * 
     * 								Feedback left for others.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackLeft")
    FEEDBACK_LEFT("FeedbackLeft"),

    /**
     * 
     * 								Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FeedbackTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedbackTypeCodeType fromValue(String v) {
        for (FeedbackTypeCodeType c: FeedbackTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
