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
    "money"
})
@XmlRootElement(name = "MaxAdhocAmount")
public class MaxAdhocAmount {

    @XmlElement(name = "Money", required = true)
    protected Money money;

    /**
     * Gets the value of the money property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMoney() {
        return money;
    }

    /**
     * Sets the value of the money property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMoney(Money value) {
        this.money = value;
    }

}
