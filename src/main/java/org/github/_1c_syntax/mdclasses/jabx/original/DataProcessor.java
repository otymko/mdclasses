//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataProcessor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataProcessor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://v8.1c.ru/8.3/MDClasses}MDObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Properties" type="{http://v8.1c.ru/8.3/MDClasses}DataProcessorProperties"/&gt;
 *         &lt;element name="ChildObjects" type="{http://v8.1c.ru/8.3/MDClasses}DataProcessorChildObjects"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataProcessor", propOrder = {
    "properties",
    "childObjects"
})
public class DataProcessor
    extends MDObjectBase
{

    @XmlElement(name = "Properties", required = true)
    protected DataProcessorProperties properties;
    @XmlElement(name = "ChildObjects", required = true)
    protected DataProcessorChildObjects childObjects;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link DataProcessorProperties }
     *     
     */
    public DataProcessorProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProcessorProperties }
     *     
     */
    public void setProperties(DataProcessorProperties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the childObjects property.
     * 
     * @return
     *     possible object is
     *     {@link DataProcessorChildObjects }
     *     
     */
    public DataProcessorChildObjects getChildObjects() {
        return childObjects;
    }

    /**
     * Sets the value of the childObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProcessorChildObjects }
     *     
     */
    public void setChildObjects(DataProcessorChildObjects value) {
        this.childObjects = value;
    }

}
