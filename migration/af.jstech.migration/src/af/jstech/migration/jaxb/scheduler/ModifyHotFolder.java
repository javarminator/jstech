//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.03 at 02:04:24 PM CEST 
//


package af.jstech.migration.jaxb.scheduler;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modify_hot_folder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modify_hot_folder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}job"/>
 *         &lt;element ref="{}job_chain"/>
 *         &lt;element ref="{}lock"/>
 *         &lt;element ref="{}order"/>
 *         &lt;element ref="{}process_class"/>
 *         &lt;element ref="{}schedule"/>
 *       &lt;/choice>
 *       &lt;attribute name="folder" type="{}Path" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modify_hot_folder", propOrder = {
    "job",
    "jobChain",
    "lock",
    "order",
    "processClass",
    "schedule"
})
public class ModifyHotFolder {

    protected Job job;
    @XmlElement(name = "job_chain")
    protected JobChain jobChain;
    protected Lock lock;
    protected Order order;
    @XmlElement(name = "process_class")
    protected ProcessClass processClass;
    protected RunTime schedule;
    @XmlAttribute
    protected String folder;

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link Job }
     *     
     */
    public Job getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link Job }
     *     
     */
    public void setJob(Job value) {
        this.job = value;
    }

    /**
     * Gets the value of the jobChain property.
     * 
     * @return
     *     possible object is
     *     {@link JobChain }
     *     
     */
    public JobChain getJobChain() {
        return jobChain;
    }

    /**
     * Sets the value of the jobChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobChain }
     *     
     */
    public void setJobChain(JobChain value) {
        this.jobChain = value;
    }

    /**
     * Gets the value of the lock property.
     * 
     * @return
     *     possible object is
     *     {@link Lock }
     *     
     */
    public Lock getLock() {
        return lock;
    }

    /**
     * Sets the value of the lock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lock }
     *     
     */
    public void setLock(Lock value) {
        this.lock = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

    /**
     * Gets the value of the processClass property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessClass }
     *     
     */
    public ProcessClass getProcessClass() {
        return processClass;
    }

    /**
     * Sets the value of the processClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessClass }
     *     
     */
    public void setProcessClass(ProcessClass value) {
        this.processClass = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link RunTime }
     *     
     */
    public RunTime getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunTime }
     *     
     */
    public void setSchedule(RunTime value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolder(String value) {
        this.folder = value;
    }

}
