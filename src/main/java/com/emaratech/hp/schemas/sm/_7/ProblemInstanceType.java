
package com.emaratech.hp.schemas.sm._7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.emaratech.hp.schemas.sm._7.common.ArrayType;
import com.emaratech.hp.schemas.sm._7.common.AttachmentsType;
import com.emaratech.hp.schemas.sm._7.common.DateTimeType;
import com.emaratech.hp.schemas.sm._7.common.DecimalType;
import com.emaratech.hp.schemas.sm._7.common.StringType;


/**
 * <p>Java class for ProblemInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProblemInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="AssignmentGroup" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="PrimaryCI" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Description" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RootCause" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType">
 *                 &lt;sequence>
 *                   &lt;element name="RootCause" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Priority" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="ProblemOwner" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Urgency" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Assignee" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="SubCategory" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="ProblemType" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Solution" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType">
 *                 &lt;sequence>
 *                   &lt;element name="Solution" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Workaround" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType">
 *                 &lt;sequence>
 *                   &lt;element name="Workaround" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Phase" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="IncidentCount" type="{http://schemas.hp.com/SM/7/Common}DecimalType" minOccurs="0"/>
 *         &lt;element name="Impact" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="ExpectedResolutionDate" type="{http://schemas.hp.com/SM/7/Common}DateTimeType" minOccurs="0"/>
 *         &lt;element name="AffectedCICount" type="{http://schemas.hp.com/SM/7/Common}DecimalType" minOccurs="0"/>
 *         &lt;element name="Folder" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="ClosureCode" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="ExpectedRootCauseIdentifiedDate" type="{http://schemas.hp.com/SM/7/Common}DateTimeType" minOccurs="0"/>
 *         &lt;element name="SolutionIdentifiedDate" type="{http://schemas.hp.com/SM/7/Common}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://schemas.hp.com/SM/7/Common}AttachmentsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uniquequery" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updatecounter" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProblemInstanceType", propOrder = {
    "id",
    "category",
    "assignmentGroup",
    "primaryCI",
    "title",
    "description",
    "rootCause",
    "priority",
    "problemOwner",
    "urgency",
    "assignee",
    "subCategory",
    "area",
    "problemType",
    "solution",
    "workaround",
    "phase",
    "incidentCount",
    "impact",
    "expectedResolutionDate",
    "affectedCICount",
    "folder",
    "closureCode",
    "expectedRootCauseIdentifiedDate",
    "solutionIdentifiedDate",
    "service",
    "status",
    "attachments"
})
public class ProblemInstanceType {

    @XmlElementRef(name = "ID", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> id;
    @XmlElementRef(name = "Category", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> category;
    @XmlElementRef(name = "AssignmentGroup", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> assignmentGroup;
    @XmlElementRef(name = "PrimaryCI", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> primaryCI;
    @XmlElementRef(name = "Title", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> title;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "RootCause")
    protected RootCause rootCause;
    @XmlElementRef(name = "Priority", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> priority;
    @XmlElementRef(name = "ProblemOwner", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> problemOwner;
    @XmlElementRef(name = "Urgency", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> urgency;
    @XmlElementRef(name = "Assignee", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> assignee;
    @XmlElementRef(name = "SubCategory", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> subCategory;
    @XmlElementRef(name = "Area", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> area;
    @XmlElementRef(name = "ProblemType", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> problemType;
    @XmlElement(name = "Solution")
    protected Solution solution;
    @XmlElement(name = "Workaround")
    protected Workaround workaround;
    @XmlElementRef(name = "Phase", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> phase;
    @XmlElementRef(name = "IncidentCount", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DecimalType> incidentCount;
    @XmlElementRef(name = "Impact", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> impact;
    @XmlElementRef(name = "ExpectedResolutionDate", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> expectedResolutionDate;
    @XmlElementRef(name = "AffectedCICount", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DecimalType> affectedCICount;
    @XmlElementRef(name = "Folder", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> folder;
    @XmlElementRef(name = "ClosureCode", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> closureCode;
    @XmlElementRef(name = "ExpectedRootCauseIdentifiedDate", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> expectedRootCauseIdentifiedDate;
    @XmlElementRef(name = "SolutionIdentifiedDate", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> solutionIdentifiedDate;
    @XmlElementRef(name = "Service", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> service;
    @XmlElementRef(name = "Status", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> status;
    @XmlElementRef(name = "attachments", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<AttachmentsType> attachments;
    @XmlAttribute(name = "query")
    protected String query;
    @XmlAttribute(name = "uniquequery")
    protected String uniquequery;
    @XmlAttribute(name = "recordid")
    protected String recordid;
    @XmlAttribute(name = "updatecounter")
    protected Long updatecounter;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setID(JAXBElement<StringType> value) {
        this.id = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setCategory(JAXBElement<StringType> value) {
        this.category = value;
    }

    /**
     * Gets the value of the assignmentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getAssignmentGroup() {
        return assignmentGroup;
    }

    /**
     * Sets the value of the assignmentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setAssignmentGroup(JAXBElement<StringType> value) {
        this.assignmentGroup = value;
    }

    /**
     * Gets the value of the primaryCI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getPrimaryCI() {
        return primaryCI;
    }

    /**
     * Sets the value of the primaryCI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setPrimaryCI(JAXBElement<StringType> value) {
        this.primaryCI = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setTitle(JAXBElement<StringType> value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the rootCause property.
     * 
     * @return
     *     possible object is
     *     {@link RootCause }
     *     
     */
    public RootCause getRootCause() {
        return rootCause;
    }

    /**
     * Sets the value of the rootCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link RootCause }
     *     
     */
    public void setRootCause(RootCause value) {
        this.rootCause = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setPriority(JAXBElement<StringType> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the problemOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getProblemOwner() {
        return problemOwner;
    }

    /**
     * Sets the value of the problemOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setProblemOwner(JAXBElement<StringType> value) {
        this.problemOwner = value;
    }

    /**
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getUrgency() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setUrgency(JAXBElement<StringType> value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the assignee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getAssignee() {
        return assignee;
    }

    /**
     * Sets the value of the assignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setAssignee(JAXBElement<StringType> value) {
        this.assignee = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setSubCategory(JAXBElement<StringType> value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setArea(JAXBElement<StringType> value) {
        this.area = value;
    }

    /**
     * Gets the value of the problemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getProblemType() {
        return problemType;
    }

    /**
     * Sets the value of the problemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setProblemType(JAXBElement<StringType> value) {
        this.problemType = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link Solution }
     *     
     */
    public Solution getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Solution }
     *     
     */
    public void setSolution(Solution value) {
        this.solution = value;
    }

    /**
     * Gets the value of the workaround property.
     * 
     * @return
     *     possible object is
     *     {@link Workaround }
     *     
     */
    public Workaround getWorkaround() {
        return workaround;
    }

    /**
     * Sets the value of the workaround property.
     * 
     * @param value
     *     allowed object is
     *     {@link Workaround }
     *     
     */
    public void setWorkaround(Workaround value) {
        this.workaround = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setPhase(JAXBElement<StringType> value) {
        this.phase = value;
    }

    /**
     * Gets the value of the incidentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
     *     
     */
    public JAXBElement<DecimalType> getIncidentCount() {
        return incidentCount;
    }

    /**
     * Sets the value of the incidentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
     *     
     */
    public void setIncidentCount(JAXBElement<DecimalType> value) {
        this.incidentCount = value;
    }

    /**
     * Gets the value of the impact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getImpact() {
        return impact;
    }

    /**
     * Sets the value of the impact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setImpact(JAXBElement<StringType> value) {
        this.impact = value;
    }

    /**
     * Gets the value of the expectedResolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getExpectedResolutionDate() {
        return expectedResolutionDate;
    }

    /**
     * Sets the value of the expectedResolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setExpectedResolutionDate(JAXBElement<DateTimeType> value) {
        this.expectedResolutionDate = value;
    }

    /**
     * Gets the value of the affectedCICount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
     *     
     */
    public JAXBElement<DecimalType> getAffectedCICount() {
        return affectedCICount;
    }

    /**
     * Sets the value of the affectedCICount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
     *     
     */
    public void setAffectedCICount(JAXBElement<DecimalType> value) {
        this.affectedCICount = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setFolder(JAXBElement<StringType> value) {
        this.folder = value;
    }

    /**
     * Gets the value of the closureCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getClosureCode() {
        return closureCode;
    }

    /**
     * Sets the value of the closureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setClosureCode(JAXBElement<StringType> value) {
        this.closureCode = value;
    }

    /**
     * Gets the value of the expectedRootCauseIdentifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getExpectedRootCauseIdentifiedDate() {
        return expectedRootCauseIdentifiedDate;
    }

    /**
     * Sets the value of the expectedRootCauseIdentifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setExpectedRootCauseIdentifiedDate(JAXBElement<DateTimeType> value) {
        this.expectedRootCauseIdentifiedDate = value;
    }

    /**
     * Gets the value of the solutionIdentifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getSolutionIdentifiedDate() {
        return solutionIdentifiedDate;
    }

    /**
     * Sets the value of the solutionIdentifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setSolutionIdentifiedDate(JAXBElement<DateTimeType> value) {
        this.solutionIdentifiedDate = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setService(JAXBElement<StringType> value) {
        this.service = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<StringType> value) {
        this.status = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AttachmentsType }{@code >}
     *     
     */
    public JAXBElement<AttachmentsType> getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AttachmentsType }{@code >}
     *     
     */
    public void setAttachments(JAXBElement<AttachmentsType> value) {
        this.attachments = value;
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

    /**
     * Gets the value of the uniquequery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniquequery() {
        return uniquequery;
    }

    /**
     * Sets the value of the uniquequery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniquequery(String value) {
        this.uniquequery = value;
    }

    /**
     * Gets the value of the recordid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordid() {
        return recordid;
    }

    /**
     * Sets the value of the recordid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordid(String value) {
        this.recordid = value;
    }

    /**
     * Gets the value of the updatecounter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdatecounter() {
        return updatecounter;
    }

    /**
     * Sets the value of the updatecounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdatecounter(Long value) {
        this.updatecounter = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType">
     *       &lt;sequence>
     *         &lt;element name="Description" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class Description
        extends ArrayType
    {

        @XmlElement(name = "Description")
        protected List<StringType> description;

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StringType }
         * 
         * 
         */
        public List<StringType> getDescription() {
            if (description == null) {
                description = new ArrayList<StringType>();
            }
            return this.description;
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
     *     &lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType">
     *       &lt;sequence>
     *         &lt;element name="RootCause" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rootCause"
    })
    public static class RootCause
        extends ArrayType
    {

        @XmlElement(name = "RootCause")
        protected List<StringType> rootCause;

        /**
         * Gets the value of the rootCause property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rootCause property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRootCause().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StringType }
         * 
         * 
         */
        public List<StringType> getRootCause() {
            if (rootCause == null) {
                rootCause = new ArrayList<StringType>();
            }
            return this.rootCause;
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
     *     &lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType">
     *       &lt;sequence>
     *         &lt;element name="Solution" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "solution"
    })
    public static class Solution
        extends ArrayType
    {

        @XmlElement(name = "Solution")
        protected List<StringType> solution;

        /**
         * Gets the value of the solution property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the solution property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSolution().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StringType }
         * 
         * 
         */
        public List<StringType> getSolution() {
            if (solution == null) {
                solution = new ArrayList<StringType>();
            }
            return this.solution;
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
     *     &lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType">
     *       &lt;sequence>
     *         &lt;element name="Workaround" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "workaround"
    })
    public static class Workaround
        extends ArrayType
    {

        @XmlElement(name = "Workaround")
        protected List<StringType> workaround;

        /**
         * Gets the value of the workaround property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workaround property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkaround().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StringType }
         * 
         * 
         */
        public List<StringType> getWorkaround() {
            if (workaround == null) {
                workaround = new ArrayList<StringType>();
            }
            return this.workaround;
        }

    }

}
