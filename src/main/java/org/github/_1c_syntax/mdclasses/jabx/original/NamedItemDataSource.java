//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NamedItemDataSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamedItemDataSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://v8.1c.ru/8.2/data/spreadsheet}NamedItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="area" type="{http://v8.1c.ru/8.2/data/spreadsheet}Area" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedItemDataSource", namespace = "http://v8.1c.ru/8.2/data/spreadsheet", propOrder = {
    "area"
})
public class NamedItemDataSource
    extends NamedItem
{

    protected Area area;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setArea(Area value) {
        this.area = value;
    }

}