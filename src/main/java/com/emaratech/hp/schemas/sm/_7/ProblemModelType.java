
package com.emaratech.hp.schemas.sm._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.emaratech.hp.schemas.sm._7.common.MessagesType;


/**
 * <p>Java class for ProblemModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProblemModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keys" type="{http://schemas.hp.com/SM/7}ProblemKeysType"/>
 *         &lt;element name="instance" type="{http://schemas.hp.com/SM/7}ProblemInstanceType"/>
 *         &lt;element name="messages" type="{http://schemas.hp.com/SM/7/Common}MessagesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProblemModelType", propOrder = {
    "keys",
    "instance",
    "messages"
})
public class ProblemModelType {

    @XmlElement(required = true)
    protected ProblemKeysType keys;
    @XmlElement(required = true)
    protected ProblemInstanceType instance;
    protected MessagesType messages;
    @XmlAttribute(name = "query")
    protected String query;

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemKeysType }
     *     
     */
    public ProblemKeysType getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemKeysType }
     *     
     */
    public void setKeys(ProblemKeysType value) {
        this.keys = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemInstanceType }
     *     
     */
    public ProblemInstanceType getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemInstanceType }
     *     
     */
    public void setInstance(ProblemInstanceType value) {
        this.instance = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link MessagesType }
     *     
     */
    public MessagesType getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagesType }
     *     
     */
    public void setMessages(MessagesType value) {
        this.messages = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

}
