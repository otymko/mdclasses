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
 * <p>Java class for ChartOfAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChartOfAccounts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://v8.1c.ru/8.3/MDClasses}MDObjectBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Properties" type="{http://v8.1c.ru/8.3/MDClasses}ChartOfAccountsProperties"/&gt;
 *         &lt;element name="ChildObjects" type="{http://v8.1c.ru/8.3/MDClasses}ChartOfAccountsChildObjects"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChartOfAccounts", propOrder = {
    "properties",
    "childObjects"
})
public class ChartOfAccounts
    extends MDObjectBase
{

    @XmlElement(name = "Properties", required = true)
    protected ChartOfAccountsProperties properties;
    @XmlElement(name = "ChildObjects", required = true)
    protected ChartOfAccountsChildObjects childObjects;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ChartOfAccountsProperties }
     *     
     */
    public ChartOfAccountsProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartOfAccountsProperties }
     *     
     */
    public void setProperties(ChartOfAccountsProperties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the childObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ChartOfAccountsChildObjects }
     *     
     */
    public ChartOfAccountsChildObjects getChildObjects() {
        return childObjects;
    }

    /**
     * Sets the value of the childObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartOfAccountsChildObjects }
     *     
     */
    public void setChildObjects(ChartOfAccountsChildObjects value) {
        this.childObjects = value;
    }

}
