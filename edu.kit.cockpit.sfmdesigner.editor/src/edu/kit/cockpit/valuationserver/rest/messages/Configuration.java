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
 *         &lt;element name="VoteUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConfigName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigurationAttributes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FeatureAttribute" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FeatureAttributeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="FeatureAttributeValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ConfigurationRanking">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RankedConfiguration" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ConfigurationId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PreferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
    "configName",
    "configId",
    "configDescription",
    "configurationAttributes",
    "configurationRanking"
})
@XmlRootElement(name = "Configuration")
public class Configuration {

    @XmlElement(name = "VoteUrl", required = true)
    protected String voteUrl;
    @XmlElement(name = "ConfigName")
    protected String configName;
    @XmlElement(name = "ConfigId")
    protected String configId;
    @XmlElement(name = "ConfigDescription")
    protected String configDescription;
    @XmlElement(name = "ConfigurationAttributes", required = true)
    protected Configuration.ConfigurationAttributes configurationAttributes;
    @XmlElement(name = "ConfigurationRanking", required = true)
    protected Configuration.ConfigurationRanking configurationRanking;

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
     * Gets the value of the configName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * Sets the value of the configName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigName(String value) {
        this.configName = value;
    }

    /**
     * Gets the value of the configId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * Sets the value of the configId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigId(String value) {
        this.configId = value;
    }

    /**
     * Gets the value of the configDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigDescription() {
        return configDescription;
    }

    /**
     * Sets the value of the configDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigDescription(String value) {
        this.configDescription = value;
    }

    /**
     * Gets the value of the configurationAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link Configuration.ConfigurationAttributes }
     *     
     */
    public Configuration.ConfigurationAttributes getConfigurationAttributes() {
        return configurationAttributes;
    }

    /**
     * Sets the value of the configurationAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuration.ConfigurationAttributes }
     *     
     */
    public void setConfigurationAttributes(Configuration.ConfigurationAttributes value) {
        this.configurationAttributes = value;
    }

    /**
     * Gets the value of the configurationRanking property.
     * 
     * @return
     *     possible object is
     *     {@link Configuration.ConfigurationRanking }
     *     
     */
    public Configuration.ConfigurationRanking getConfigurationRanking() {
        return configurationRanking;
    }

    /**
     * Sets the value of the configurationRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuration.ConfigurationRanking }
     *     
     */
    public void setConfigurationRanking(Configuration.ConfigurationRanking value) {
        this.configurationRanking = value;
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
     *       &lt;sequence>
     *         &lt;element name="FeatureAttribute" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FeatureAttributeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FeatureAttributeValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "featureAttribute"
    })
    public static class ConfigurationAttributes {

        @XmlElement(name = "FeatureAttribute", required = true)
        protected List<Configuration.ConfigurationAttributes.FeatureAttribute> featureAttribute;

        /**
         * Gets the value of the featureAttribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureAttribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Configuration.ConfigurationAttributes.FeatureAttribute }
         * 
         * 
         */
        public List<Configuration.ConfigurationAttributes.FeatureAttribute> getFeatureAttribute() {
            if (featureAttribute == null) {
                featureAttribute = new ArrayList<Configuration.ConfigurationAttributes.FeatureAttribute>();
            }
            return this.featureAttribute;
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
         *       &lt;attribute name="FeatureAttributeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FeatureAttributeValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FeatureAttribute {

            @XmlAttribute(name = "FeatureAttributeType", required = true)
            protected String featureAttributeType;
            @XmlAttribute(name = "FeatureAttributeValue", required = true)
            protected String featureAttributeValue;

            /**
             * Gets the value of the featureAttributeType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeatureAttributeType() {
                return featureAttributeType;
            }

            /**
             * Sets the value of the featureAttributeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeatureAttributeType(String value) {
                this.featureAttributeType = value;
            }

            /**
             * Gets the value of the featureAttributeValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeatureAttributeValue() {
                return featureAttributeValue;
            }

            /**
             * Sets the value of the featureAttributeValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeatureAttributeValue(String value) {
                this.featureAttributeValue = value;
            }

        }

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
     *       &lt;sequence>
     *         &lt;element name="RankedConfiguration" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ConfigurationId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PreferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
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
        "rankedConfiguration"
    })
    public static class ConfigurationRanking {

        @XmlElement(name = "RankedConfiguration", required = true)
        protected List<Configuration.ConfigurationRanking.RankedConfiguration> rankedConfiguration;

        /**
         * Gets the value of the rankedConfiguration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rankedConfiguration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRankedConfiguration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Configuration.ConfigurationRanking.RankedConfiguration }
         * 
         * 
         */
        public List<Configuration.ConfigurationRanking.RankedConfiguration> getRankedConfiguration() {
            if (rankedConfiguration == null) {
                rankedConfiguration = new ArrayList<Configuration.ConfigurationRanking.RankedConfiguration>();
            }
            return this.rankedConfiguration;
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
         *       &lt;attribute name="ConfigurationId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PreferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RankedConfiguration {

            @XmlAttribute(name = "ConfigurationId", required = true)
            protected String configurationId;
            @XmlAttribute(name = "PreferenceValue", required = true)
            protected float preferenceValue;

            /**
             * Gets the value of the configurationId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConfigurationId() {
                return configurationId;
            }

            /**
             * Sets the value of the configurationId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConfigurationId(String value) {
                this.configurationId = value;
            }

            /**
             * Gets the value of the preferenceValue property.
             * 
             */
            public float getPreferenceValue() {
                return preferenceValue;
            }

            /**
             * Sets the value of the preferenceValue property.
             * 
             */
            public void setPreferenceValue(float value) {
                this.preferenceValue = value;
            }

        }

    }

}
