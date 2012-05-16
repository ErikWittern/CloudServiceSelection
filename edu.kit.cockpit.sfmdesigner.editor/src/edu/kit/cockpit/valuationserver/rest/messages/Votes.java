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
 *         &lt;element name="VoteEntry" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="VoteId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="VoteUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "voteEntry"
})
@XmlRootElement(name = "Votes")
public class Votes {

    @XmlElement(name = "VoteEntry", required = true)
    protected List<Votes.VoteEntry> voteEntry;

    /**
     * Gets the value of the voteEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voteEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Votes.VoteEntry }
     * 
     * 
     */
    public List<Votes.VoteEntry> getVoteEntry() {
        if (voteEntry == null) {
            voteEntry = new ArrayList<Votes.VoteEntry>();
        }
        return this.voteEntry;
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
     *       &lt;attribute name="VoteId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="VoteUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VoteEntry {

        @XmlAttribute(name = "VoteId", required = true)
        protected String voteId;
        @XmlAttribute(name = "VoteUrl", required = true)
        protected String voteUrl;

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

    }

}