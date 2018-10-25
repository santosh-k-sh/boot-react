
package com.emaratech.hp.schemas.sm._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.emaratech.hp.schemas.sm._7.common.MessagesType;


/**
 * <p>Java class for ProblemTaskModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProblemTaskModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keys" type="{http://schemas.hp.com/SM/7}ProblemTaskKeysType"/>
 *         &lt;element name="instance" type="{http://schemas.hp.com/SM/7}ProblemTaskInstanceType"/>
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
@XmlType(name = "ProblemTaskModelType", propOrder = {
    "keys",
    "instance",
    "messages"
})
public class ProblemTaskModelType {

    @XmlElement(required = true)
    protected ProblemTaskKeysType keys;
    @XmlElement(required = true)
    protected ProblemTaskInstanceType instance;
    protected MessagesType messages;
    @XmlAttribute(name = "query")
    protected String query;

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemTaskKeysType }
     *     
     */
    public ProblemTaskKeysType getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemTaskKeysType }
     *     
     */
    public void setKeys(ProblemTaskKeysType value) {
        this.keys = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemTaskInstanceType }
     *     
     */
    public ProblemTaskInstanceType getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemTaskInstanceType }
     *     
     */
    public void setInstance(ProblemTaskInstanceType value) {
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
