//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ChoiceParameterLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChoiceParameterLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DataPath" type="{http://v8.1c.ru/8.3/xcf/readable}DataPath" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ValueChange" type="{http://v8.1c.ru/8.1/data/enterprise}LinkedValueChangeMode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChoiceParameterLink", namespace = "http://v8.1c.ru/8.3/xcf/readable", propOrder = {
    "name",
    "dataPath",
    "valueChange"
})
public class ChoiceParameterLink {

    @XmlElement(name = "Name", required = true)
    protected List<String> name;
    @XmlElement(name = "DataPath", required = true)
    protected List<String> dataPath;
    @XmlElement(name = "ValueChange")
    @XmlSchemaType(name = "string")
    protected LinkedValueChangeMode valueChange;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getName() {
        if (name == null) {
            name = new ArrayList<String>();
        }
        return this.name;
    }

    /**
     * Gets the value of the dataPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataPath() {
        if (dataPath == null) {
            dataPath = new ArrayList<String>();
        }
        return this.dataPath;
    }

    /**
     * Gets the value of the valueChange property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedValueChangeMode }
     *     
     */
    public LinkedValueChangeMode getValueChange() {
        return valueChange;
    }

    /**
     * Sets the value of the valueChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedValueChangeMode }
     *     
     */
    public void setValueChange(LinkedValueChangeMode value) {
        this.valueChange = value;
    }

}
