//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:07:34 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.cxml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "percentageOrMoney"
})
@XmlRootElement(name = "PriceTolerance")
public class PriceTolerance {

    @XmlElements({
        @XmlElement(name = "Percentage", required = true, type = Percentage.class),
        @XmlElement(name = "Money", required = true, type = Money.class)
    })
    protected List<Object> percentageOrMoney;

    /**
     * Gets the value of the percentageOrMoney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the percentageOrMoney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPercentageOrMoney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Percentage }
     * {@link Money }
     * 
     * 
     */
    public List<Object> getPercentageOrMoney() {
        if (percentageOrMoney == null) {
            percentageOrMoney = new ArrayList<Object>();
        }
        return this.percentageOrMoney;
    }

}
