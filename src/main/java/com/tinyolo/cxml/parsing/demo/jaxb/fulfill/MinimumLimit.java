//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:08:13 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.fulfill;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "comparatorInfo"
})
@XmlRootElement(name = "MinimumLimit")
public class MinimumLimit {

    @XmlElement(name = "ComparatorInfo", required = true)
    protected ComparatorInfo comparatorInfo;

    /**
     * Gets the value of the comparatorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ComparatorInfo }
     *     
     */
    public ComparatorInfo getComparatorInfo() {
        return comparatorInfo;
    }

    /**
     * Sets the value of the comparatorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparatorInfo }
     *     
     */
    public void setComparatorInfo(ComparatorInfo value) {
        this.comparatorInfo = value;
    }

}
