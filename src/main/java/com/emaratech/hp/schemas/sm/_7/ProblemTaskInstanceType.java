
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
 * <p>Java class for ProblemTaskInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProblemTaskInstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaskID" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="ParentProblem" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="AssignmentGroup" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="AffectedCI" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Assignee" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://schemas.hp.com/SM/7/Common}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Impact" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Urgency" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="OpenedBy" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="UpdatedBy" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="ClosedBy" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="OpenTime" type="{http://schemas.hp.com/SM/7/Common}DateTimeType" minOccurs="0"/>
 *         &lt;element name="UpdatedTime" type="{http://schemas.hp.com/SM/7/Common}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ClosedTime" type="{http://schemas.hp.com/SM/7/Common}DateTimeType" minOccurs="0"/>
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
 *         &lt;element name="JournalUpdates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType">
 *                 &lt;sequence>
 *                   &lt;element name="JournalUpdates" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaskOutcome" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://schemas.hp.com/SM/7/Common}ArrayType">
 *                 &lt;sequence>
 *                   &lt;element name="TaskOutcome" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SLAAgreementID" type="{http://schemas.hp.com/SM/7/Common}DecimalType" minOccurs="0"/>
 *         &lt;element name="Folder" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Phase" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="CompletionCode" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://schemas.hp.com/SM/7/Common}StringType" minOccurs="0"/>
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
@XmlType(name = "ProblemTaskInstanceType", propOrder = {
    "taskID",
    "parentProblem",
    "title",
    "assignmentGroup",
    "affectedCI",
    "assignee",
    "dueDate",
    "category",
    "impact",
    "urgency",
    "openedBy",
    "updatedBy",
    "closedBy",
    "openTime",
    "updatedTime",
    "closedTime",
    "description",
    "journalUpdates",
    "taskOutcome",
    "slaAgreementID",
    "folder",
    "status",
    "phase",
    "completionCode",
    "company",
    "attachments"
})
public class ProblemTaskInstanceType {

    @XmlElementRef(name = "TaskID", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> taskID;
    @XmlElementRef(name = "ParentProblem", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> parentProblem;
    @XmlElementRef(name = "Title", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> title;
    @XmlElementRef(name = "AssignmentGroup", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> assignmentGroup;
    @XmlElementRef(name = "AffectedCI", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> affectedCI;
    @XmlElementRef(name = "Assignee", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> assignee;
    @XmlElementRef(name = "DueDate", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> dueDate;
    @XmlElementRef(name = "Category", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> category;
    @XmlElementRef(name = "Impact", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> impact;
    @XmlElementRef(name = "Urgency", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> urgency;
    @XmlElementRef(name = "OpenedBy", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> openedBy;
    @XmlElementRef(name = "UpdatedBy", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> updatedBy;
    @XmlElementRef(name = "ClosedBy", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> closedBy;
    @XmlElementRef(name = "OpenTime", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> openTime;
    @XmlElementRef(name = "UpdatedTime", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> updatedTime;
    @XmlElementRef(name = "ClosedTime", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> closedTime;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "JournalUpdates")
    protected JournalUpdates journalUpdates;
    @XmlElement(name = "TaskOutcome")
    protected TaskOutcome taskOutcome;
    @XmlElementRef(name = "SLAAgreementID", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<DecimalType> slaAgreementID;
    @XmlElementRef(name = "Folder", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> folder;
    @XmlElementRef(name = "Status", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> status;
    @XmlElementRef(name = "Phase", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> phase;
    @XmlElementRef(name = "CompletionCode", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> completionCode;
    @XmlElementRef(name = "Company", namespace = "http://schemas.hp.com/SM/7", type = JAXBElement.class, required = false)
    protected JAXBElement<StringType> company;
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
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setTaskID(JAXBElement<StringType> value) {
        this.taskID = value;
    }

    /**
     * Gets the value of the parentProblem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getParentProblem() {
        return parentProblem;
    }

    /**
     * Sets the value of the parentProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setParentProblem(JAXBElement<StringType> value) {
        this.parentProblem = value;
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
     * Gets the value of the affectedCI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getAffectedCI() {
        return affectedCI;
    }

    /**
     * Sets the value of the affectedCI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setAffectedCI(JAXBElement<StringType> value) {
        this.affectedCI = value;
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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setDueDate(JAXBElement<DateTimeType> value) {
        this.dueDate = value;
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
     * Gets the value of the openedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getOpenedBy() {
        return openedBy;
    }

    /**
     * Sets the value of the openedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setOpenedBy(JAXBElement<StringType> value) {
        this.openedBy = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setUpdatedBy(JAXBElement<StringType> value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the closedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getClosedBy() {
        return closedBy;
    }

    /**
     * Sets the value of the closedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setClosedBy(JAXBElement<StringType> value) {
        this.closedBy = value;
    }

    /**
     * Gets the value of the openTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getOpenTime() {
        return openTime;
    }

    /**
     * Sets the value of the openTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setOpenTime(JAXBElement<DateTimeType> value) {
        this.openTime = value;
    }

    /**
     * Gets the value of the updatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Sets the value of the updatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setUpdatedTime(JAXBElement<DateTimeType> value) {
        this.updatedTime = value;
    }

    /**
     * Gets the value of the closedTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getClosedTime() {
        return closedTime;
    }

    /**
     * Sets the value of the closedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setClosedTime(JAXBElement<DateTimeType> value) {
        this.closedTime = value;
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
     * Gets the value of the journalUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link JournalUpdates }
     *     
     */
    public JournalUpdates getJournalUpdates() {
        return journalUpdates;
    }

    /**
     * Sets the value of the journalUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalUpdates }
     *     
     */
    public void setJournalUpdates(JournalUpdates value) {
        this.journalUpdates = value;
    }

    /**
     * Gets the value of the taskOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link TaskOutcome }
     *     
     */
    public TaskOutcome getTaskOutcome() {
        return taskOutcome;
    }

    /**
     * Sets the value of the taskOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskOutcome }
     *     
     */
    public void setTaskOutcome(TaskOutcome value) {
        this.taskOutcome = value;
    }

    /**
     * Gets the value of the slaAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
     *     
     */
    public JAXBElement<DecimalType> getSLAAgreementID() {
        return slaAgreementID;
    }

    /**
     * Sets the value of the slaAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DecimalType }{@code >}
     *     
     */
    public void setSLAAgreementID(JAXBElement<DecimalType> value) {
        this.slaAgreementID = value;
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
     * Gets the value of the completionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getCompletionCode() {
        return completionCode;
    }

    /**
     * Sets the value of the completionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setCompletionCode(JAXBElement<StringType> value) {
        this.completionCode = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public JAXBElement<StringType> getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringType }{@code >}
     *     
     */
    public void setCompany(JAXBElement<StringType> value) {
        this.company = value;
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
     *         &lt;element name="JournalUpdates" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
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
        "journalUpdates"
    })
    public static class JournalUpdates
        extends ArrayType
    {

        @XmlElement(name = "JournalUpdates")
        protected List<StringType> journalUpdates;

        /**
         * Gets the value of the journalUpdates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the journalUpdates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJournalUpdates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StringType }
         * 
         * 
         */
        public List<StringType> getJournalUpdates() {
            if (journalUpdates == null) {
                journalUpdates = new ArrayList<StringType>();
            }
            return this.journalUpdates;
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
     *         &lt;element name="TaskOutcome" type="{http://schemas.hp.com/SM/7/Common}StringType" maxOccurs="unbounded" minOccurs="0"/>
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
        "taskOutcome"
    })
    public static class TaskOutcome
        extends ArrayType
    {

        @XmlElement(name = "TaskOutcome")
        protected List<StringType> taskOutcome;

        /**
         * Gets the value of the taskOutcome property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taskOutcome property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaskOutcome().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StringType }
         * 
         * 
         */
        public List<StringType> getTaskOutcome() {
            if (taskOutcome == null) {
                taskOutcome = new ArrayList<StringType>();
            }
            return this.taskOutcome;
        }

    }

}
