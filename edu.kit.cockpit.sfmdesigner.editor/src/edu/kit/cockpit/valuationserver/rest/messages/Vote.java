//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.05 at 10:02:16 AM MESZ 
//


package edu.kit.cockpit.valuationserver.rest.messages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoteUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EvaluationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StakeholderGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigurationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aggregation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VoterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AggregationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClusterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preference" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="FeatureAttributeType1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FeatureAttributeType2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pref1over2" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "voteUrl",
    "voteId",
    "evaluationUrl",
    "stakeholderGroup",
    "configurationUrl",
    "aggregation",
    "voterId",
    "aggregationType",
    "clusterId",
    "preference"
})
@XmlRootElement(name = "Vote")
public class Vote {

    @XmlElement(name = "VoteUrl")
    protected String voteUrl;
    @XmlElement(name = "VoteId")
    protected String voteId;
    @XmlElement(name = "EvaluationUrl")
    protected String evaluationUrl;
    @XmlElement(name = "StakeholderGroup")
    protected String stakeholderGroup;
    @XmlElement(name = "ConfigurationUrl")
    protected String configurationUrl;
    @XmlElement(name = "Aggregation", defaultValue = "false")
    protected boolean aggregation;
    @XmlElement(name = "VoterId", required = true)
    protected String voterId;
    @XmlElement(name = "AggregationType")
    protected String aggregationType;
    @XmlElement(name = "ClusterId")
    protected String clusterId;
    @XmlElement(name = "Preference", required = true)
    protected List<Vote.Preference> preference;

    /**
     * Gets the value of the voteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoteUrl() {
        return voteUrl;
    }

    /**
     * Sets the value of the voteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoteUrl(String value) {
        this.voteUrl = value;
    }

    /**
     * Gets the value of the voteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoteId() {
        return voteId;
    }

    /**
     * Sets the value of the voteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoteId(String value) {
        this.voteId = value;
    }

    /**
     * Gets the value of the evaluationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationUrl() {
        return evaluationUrl;
    }

    /**
     * Sets the value of the evaluationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationUrl(String value) {
        this.evaluationUrl = value;
    }

    /**
     * Gets the value of the stakeholderGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStakeholderGroup() {
        return stakeholderGroup;
    }

    /**
     * Sets the value of the stakeholderGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStakeholderGroup(String value) {
        this.stakeholderGroup = value;
    }

    /**
     * Gets the value of the configurationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationUrl() {
        return configurationUrl;
    }

    /**
     * Sets the value of the configurationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationUrl(String value) {
        this.configurationUrl = value;
    }

    /**
     * Gets the value of the aggregation property.
     * 
     */
    public boolean isAggregation() {
        return aggregation;
    }

    /**
     * Sets the value of the aggregation property.
     * 
     */
    public void setAggregation(boolean value) {
        this.aggregation = value;
    }

    /**
     * Gets the value of the voterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoterId() {
        return voterId;
    }

    /**
     * Sets the value of the voterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoterId(String value) {
        this.voterId = value;
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregationType(String value) {
        this.aggregationType = value;
    }

    /**
     * Gets the value of the clusterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * Sets the value of the clusterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterId(String value) {
        this.clusterId = value;
    }

    /**
     * Gets the value of the preference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vote.Preference }
     * 
     * 
     */
    public List<Vote.Preference> getPreference() {
        if (preference == null) {
            preference = new ArrayList<Vote.Preference>();
        }
        return this.preference;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="FeatureAttributeType1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FeatureAttributeType2" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pref1over2" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Preference {

        @XmlAttribute(name = "FeatureAttributeType1", required = true)
        protected String featureAttributeType1;
        @XmlAttribute(name = "FeatureAttributeType2", required = true)
        protected String featureAttributeType2;
        @XmlAttribute(name = "pref1over2", required = true)
        protected int pref1Over2;

        /**
         * Gets the value of the featureAttributeType1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureAttributeType1() {
            return featureAttributeType1;
        }

        /**
         * Sets the value of the featureAttributeType1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureAttributeType1(String value) {
            this.featureAttributeType1 = value;
        }

        /**
         * Gets the value of the featureAttributeType2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeatureAttributeType2() {
            return featureAttributeType2;
        }

        /**
         * Sets the value of the featureAttributeType2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFeatureAttributeType2(String value) {
            this.featureAttributeType2 = value;
        }

        /**
         * Gets the value of the pref1Over2 property.
         * 
         */
        public int getPref1Over2() {
            return pref1Over2;
        }

        /**
         * Sets the value of the pref1Over2 property.
         * 
         */
        public void setPref1Over2(int value) {
            this.pref1Over2 = value;
        }

    }

}