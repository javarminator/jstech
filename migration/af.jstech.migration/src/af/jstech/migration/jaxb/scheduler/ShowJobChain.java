//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.03 at 02:04:24 PM CEST 
//


package af.jstech.migration.jaxb.scheduler;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for show_job_chain element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="show_job_chain">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;attribute name="job_chain" use="required" type="{}Path" />
 *         &lt;attribute name="max_order_history" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *         &lt;attribute name="max_orders" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *         &lt;attribute name="what" type="{}What" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "show_job_chain")
public class ShowJobChain {

    @XmlAttribute(name = "job_chain", required = true)
    protected String jobChain;
    @XmlAttribute(name = "max_order_history")
    protected BigInteger maxOrderHistory;
    @XmlAttribute(name = "max_orders")
    protected BigInteger maxOrders;
    @XmlAttribute
    protected String what;

    /**
     * Gets the value of the jobChain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobChain() {
        return jobChain;
    }

    /**
     * Sets the value of the jobChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobChain(String value) {
        this.jobChain = value;
    }

    /**
     * Gets the value of the maxOrderHistory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOrderHistory() {
        return maxOrderHistory;
    }

    /**
     * Sets the value of the maxOrderHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOrderHistory(BigInteger value) {
        this.maxOrderHistory = value;
    }

    /**
     * Gets the value of the maxOrders property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOrders() {
        return maxOrders;
    }

    /**
     * Sets the value of the maxOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOrders(BigInteger value) {
        this.maxOrders = value;
    }

    /**
     * Gets the value of the what property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhat() {
        return what;
    }

    /**
     * Sets the value of the what property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhat(String value) {
        this.what = value;
    }

}
