//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:07:34 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.cxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemDetailRetail"
})
@XmlRootElement(name = "ItemDetailIndustry")
public class ItemDetailIndustry {

    @XmlAttribute(name = "isConfigurableMaterial")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isConfigurableMaterial;
    @XmlElement(name = "ItemDetailRetail")
    protected ItemDetailRetail itemDetailRetail;

    /**
     * Gets the value of the isConfigurableMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsConfigurableMaterial() {
        return isConfigurableMaterial;
    }

    /**
     * Sets the value of the isConfigurableMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsConfigurableMaterial(String value) {
        this.isConfigurableMaterial = value;
    }

    /**
     * Gets the value of the itemDetailRetail property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDetailRetail }
     *     
     */
    public ItemDetailRetail getItemDetailRetail() {
        return itemDetailRetail;
    }

    /**
     * Sets the value of the itemDetailRetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDetailRetail }
     *     
     */
    public void setItemDetailRetail(ItemDetailRetail value) {
        this.itemDetailRetail = value;
    }

}
