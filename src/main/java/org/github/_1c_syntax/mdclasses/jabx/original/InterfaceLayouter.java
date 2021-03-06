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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for InterfaceLayouter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceLayouter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="top" type="{http://v8.1c.ru/8.2/managed-application/core}PanelLayouter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="left" type="{http://v8.1c.ru/8.2/managed-application/core}PanelLayouter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="right" type="{http://v8.1c.ru/8.2/managed-application/core}PanelLayouter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bottom" type="{http://v8.1c.ru/8.2/managed-application/core}PanelLayouter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="panelDef" type="{http://v8.1c.ru/8.2/managed-application/core}PanelDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceLayouter", namespace = "http://v8.1c.ru/8.2/managed-application/core", propOrder = {
    "top",
    "left",
    "right",
    "bottom",
    "panelDef"
})
public class InterfaceLayouter {

    protected List<PanelLayouter> top;
    protected List<PanelLayouter> left;
    protected List<PanelLayouter> right;
    protected List<PanelLayouter> bottom;
    protected List<PanelDef> panelDef;

    /**
     * Gets the value of the top property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the top property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanelLayouter }
     * 
     * 
     */
    public List<PanelLayouter> getTop() {
        if (top == null) {
            top = new ArrayList<PanelLayouter>();
        }
        return this.top;
    }

    /**
     * Gets the value of the left property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the left property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanelLayouter }
     * 
     * 
     */
    public List<PanelLayouter> getLeft() {
        if (left == null) {
            left = new ArrayList<PanelLayouter>();
        }
        return this.left;
    }

    /**
     * Gets the value of the right property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the right property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanelLayouter }
     * 
     * 
     */
    public List<PanelLayouter> getRight() {
        if (right == null) {
            right = new ArrayList<PanelLayouter>();
        }
        return this.right;
    }

    /**
     * Gets the value of the bottom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bottom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBottom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanelLayouter }
     * 
     * 
     */
    public List<PanelLayouter> getBottom() {
        if (bottom == null) {
            bottom = new ArrayList<PanelLayouter>();
        }
        return this.bottom;
    }

    /**
     * Gets the value of the panelDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panelDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPanelDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanelDef }
     * 
     * 
     */
    public List<PanelDef> getPanelDef() {
        if (panelDef == null) {
            panelDef = new ArrayList<PanelDef>();
        }
        return this.panelDef;
    }

}
