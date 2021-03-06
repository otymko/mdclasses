//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for FormDataFieldDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormDataFieldDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://v8.1c.ru/8.2/uobjects}FormDataTypeDescription"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://v8.1c.ru/8.1/data/core}CompositeID" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nameRu" type="{http://www.w3.org/2001/XMLSchema}string" default="" /&gt;
 *       &lt;attribute name="mode" type="{http://v8.1c.ru/8.2/uobjects}AccessMode" default="rw" /&gt;
 *       &lt;attribute name="imode" type="{http://v8.1c.ru/8.2/uobjects}AccessMode" default="rw" /&gt;
 *       &lt;attribute name="fromCntx" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormDataFieldDescription", namespace = "http://v8.1c.ru/8.2/uobjects", propOrder = {
    "type"
})
public class FormDataFieldDescription {

    @XmlElement(required = true)
    protected FormDataTypeDescription type;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "nameRu")
    protected String nameRu;
    @XmlAttribute(name = "mode")
    protected AccessMode mode;
    @XmlAttribute(name = "imode")
    protected AccessMode imode;
    @XmlAttribute(name = "fromCntx")
    protected Boolean fromCntx;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FormDataTypeDescription }
     *     
     */
    public FormDataTypeDescription getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormDataTypeDescription }
     *     
     */
    public void setType(FormDataTypeDescription value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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

    /**
     * Gets the value of the nameRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameRu() {
        if (nameRu == null) {
            return "";
        } else {
            return nameRu;
        }
    }

    /**
     * Sets the value of the nameRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameRu(String value) {
        this.nameRu = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link AccessMode }
     *     
     */
    public AccessMode getMode() {
        if (mode == null) {
            return AccessMode.RW;
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessMode }
     *     
     */
    public void setMode(AccessMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the imode property.
     * 
     * @return
     *     possible object is
     *     {@link AccessMode }
     *     
     */
    public AccessMode getImode() {
        if (imode == null) {
            return AccessMode.RW;
        } else {
            return imode;
        }
    }

    /**
     * Sets the value of the imode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessMode }
     *     
     */
    public void setImode(AccessMode value) {
        this.imode = value;
    }

    /**
     * Gets the value of the fromCntx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFromCntx() {
        if (fromCntx == null) {
            return false;
        } else {
            return fromCntx;
        }
    }

    /**
     * Sets the value of the fromCntx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromCntx(Boolean value) {
        this.fromCntx = value;
    }

}
