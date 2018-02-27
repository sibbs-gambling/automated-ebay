
package com.ebay.marketplace.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AckValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AckValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Failure"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="PartialFailure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AckValue")
@XmlEnum
public enum AckValue {


    /**
     * 
     * 				The request was processed successfully, but something occurred that may
     * 				affect your application or the user.
     * 				
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * 
     * 				The request that triggered the error was not processed successfully.
     * 				When a serious application-level error occurs, the error is returned
     * 				instead of the business data.
     * 				
     * 
     */
    @XmlEnumValue("Failure")
    FAILURE("Failure"),

    /**
     * 
     * 					The request that triggered the error was processed successfully but with some
     * 					warnings.
     * 				
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     * 					Reserved for future use.
     * 				
     * 
     */
    @XmlEnumValue("PartialFailure")
    PARTIAL_FAILURE("PartialFailure");
    private final String value;

    AckValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AckValue fromValue(String v) {
        for (AckValue c: AckValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
