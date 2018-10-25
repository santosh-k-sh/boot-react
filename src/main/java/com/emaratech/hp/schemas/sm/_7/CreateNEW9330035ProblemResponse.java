
package com.emaratech.hp.schemas.sm._7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.emaratech.hp.schemas.sm._7.common.MessagesType;
import com.emaratech.hp.schemas.sm._7.common.StatusType;


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
 *         &lt;element name="model" type="{http://schemas.hp.com/SM/7}NEW9.33.0035ProblemModelType"/>
 *         &lt;element name="messages" type="{http://schemas.hp.com/SM/7/Common}MessagesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{http://schemas.hp.com/SM/7/Common}StatusType" />
 *       &lt;attribute name="message" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemaRevisionDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="schemaRevisionLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="returnCode" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "model",
    "messages"
})
@XmlRootElement(name = "CreateNEW9.33.0035ProblemResponse")
public class CreateNEW9330035ProblemResponse {

    @XmlElement(required = true)
    protected NEW9330035ProblemModelType model;
    protected MessagesType messages;
    @XmlAttribute(name = "status", required = true)
    protected StatusType status;
    @XmlAttribute(name = "message", required = true)
    protected String message;
    @XmlAttribute(name = "schemaRevisionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar schemaRevisionDate;
    @XmlAttribute(name = "schemaRevisionLevel", required = true)
    protected int schemaRevisionLevel;
    @XmlAttribute(name = "returnCode")
    protected BigDecimal returnCode;
    @XmlAttribute(name = "query")
    protected String query;

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link NEW9330035ProblemModelType }
     *     
     */
    public NEW9330035ProblemModelType getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link NEW9330035ProblemModelType }
     *     
     */
    public void setModel(NEW9330035ProblemModelType value) {
        this.model = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the schemaRevisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchemaRevisionDate() {
        return schemaRevisionDate;
    }

    /**
     * Sets the value of the schemaRevisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchemaRevisionDate(XMLGregorianCalendar value) {
        this.schemaRevisionDate = value;
    }

    /**
     * Gets the value of the schemaRevisionLevel property.
     * 
     */
    public int getSchemaRevisionLevel() {
        return schemaRevisionLevel;
    }

    /**
     * Sets the value of the schemaRevisionLevel property.
     * 
     */
    public void setSchemaRevisionLevel(int value) {
        this.schemaRevisionLevel = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnCode(BigDecimal value) {
        this.returnCode = value;
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
