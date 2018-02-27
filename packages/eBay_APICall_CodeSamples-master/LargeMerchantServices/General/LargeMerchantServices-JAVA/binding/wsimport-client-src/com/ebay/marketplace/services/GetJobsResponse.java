
package com.ebay.marketplace.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 		Returns the list of jobs requested by this seller.
 * 		
 * 
 * <p>Java class for GetJobsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetJobsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/services}BaseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="jobProfile" type="{http://www.ebay.com/marketplace/services}JobProfile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetJobsResponse", propOrder = {
    "jobProfile"
})
public class GetJobsResponse
    extends BaseServiceResponse
{

    protected List<JobProfile> jobProfile;

    /**
     * Gets the value of the jobProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobProfile }
     * 
     * 
     */
    public List<JobProfile> getJobProfile() {
        if (jobProfile == null) {
            jobProfile = new ArrayList<JobProfile>();
        }
        return this.jobProfile;
    }

}
