//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.03 at 02:04:24 PM CEST 
//


package af.jstech.migration.jaxb.scheduler;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configuration.directory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configuration.directory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="configuration.directory" type="{}configuration.directory"/>
 *           &lt;element name="configuration.file" type="{}configuration.file"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{}String" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuration.directory", propOrder = {
    "configurationDirectoryOrConfigurationFile"
})
public class ConfigurationDirectory {

    @XmlElements({
        @XmlElement(name = "configuration.directory", required = true, type = ConfigurationDirectory.class),
        @XmlElement(name = "configuration.file", required = true, type = ConfigurationFile.class)
    })
    protected List<Object> configurationDirectoryOrConfigurationFile;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the configurationDirectoryOrConfigurationFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurationDirectoryOrConfigurationFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigurationDirectoryOrConfigurationFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurationDirectory }
     * {@link ConfigurationFile }
     * 
     * 
     */
    public List<Object> getConfigurationDirectoryOrConfigurationFile() {
        if (configurationDirectoryOrConfigurationFile == null) {
            configurationDirectoryOrConfigurationFile = new ArrayList<Object>();
        }
        return this.configurationDirectoryOrConfigurationFile;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
