
package com.emaratech.hp.schemas.sm._7.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="Array" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayType")
@XmlSeeAlso({
    com.emaratech.hp.schemas.sm._7.ProblemTaskInstanceType.Description.class,
    com.emaratech.hp.schemas.sm._7.ProblemTaskInstanceType.JournalUpdates.class,
    com.emaratech.hp.schemas.sm._7.ProblemTaskInstanceType.TaskOutcome.class,
    com.emaratech.hp.schemas.sm._7.NEW9330035ProblemInstanceType.Description.class,
    com.emaratech.hp.schemas.sm._7.NEW9330035ProblemInstanceType.RootCause.class,
    com.emaratech.hp.schemas.sm._7.NEW9330035ProblemInstanceType.JournalUpdates.class,
    com.emaratech.hp.schemas.sm._7.NEW9330035ProblemInstanceType.Solution.class,
    com.emaratech.hp.schemas.sm._7.NEW9330035ProblemInstanceType.Workaround.class,
    com.emaratech.hp.schemas.sm._7.ProblemInstanceType.Description.class,
    com.emaratech.hp.schemas.sm._7.ProblemInstanceType.RootCause.class,
    com.emaratech.hp.schemas.sm._7.ProblemInstanceType.Solution.class,
    com.emaratech.hp.schemas.sm._7.ProblemInstanceType.Workaround.class
})
public class ArrayType {

    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "Array";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
