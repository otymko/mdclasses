//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GenericException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inner" type="{http://v8.1c.ru/8.1/data/core}GenericException" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="clsid" use="required" type="{http://v8.1c.ru/8.1/data/core}UUID" /&gt;
 *       &lt;attribute name="encoded" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericException", namespace = "http://v8.1c.ru/8.1/data/core", propOrder = {
    "descr",
    "inner"
})
@XmlSeeAlso({
    Exception.class
})
public abstract class GenericException {

    @XmlElement(required = true)
    protected String descr;
    protected GenericException inner;
    @XmlAttribute(name = "clsid", required = true)
    protected String clsid;
    @XmlAttribute(name = "encoded")
    protected Boolean encoded;

    /**
     * Gets the value of the descr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescr() {
        return descr;
    }

    /**
     * Sets the value of the descr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescr(String value) {
        this.descr = value;
    }

    /**
     * Gets the value of the inner property.
     * 
     * @return
     *     possible object is
     *     {@link GenericException }
     *     
     */
    public GenericException getInner() {
        return inner;
    }

    /**
     * Sets the value of the inner property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericException }
     *     
     */
    public void setInner(GenericException value) {
        this.inner = value;
    }

    /**
     * Gets the value of the clsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsid() {
        return clsid;
    }

    /**
     * Sets the value of the clsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClsid(String value) {
        this.clsid = value;
    }

    /**
     * Gets the value of the encoded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEncoded() {
        if (encoded == null) {
            return false;
        } else {
            return encoded;
        }
    }

    /**
     * Sets the value of the encoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncoded(Boolean value) {
        this.encoded = value;
    }

}
