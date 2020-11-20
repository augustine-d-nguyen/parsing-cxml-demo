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
    "indexItemAddOrIndexItemDeleteOrIndexItemPunchout"
})
@XmlRootElement(name = "IndexItem")
public class IndexItem {

    @XmlElements({
        @XmlElement(name = "IndexItemAdd", required = true, type = IndexItemAdd.class),
        @XmlElement(name = "IndexItemDelete", required = true, type = IndexItemDelete.class),
        @XmlElement(name = "IndexItemPunchout", required = true, type = IndexItemPunchout.class)
    })
    protected List<Object> indexItemAddOrIndexItemDeleteOrIndexItemPunchout;

    /**
     * Gets the value of the indexItemAddOrIndexItemDeleteOrIndexItemPunchout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexItemAddOrIndexItemDeleteOrIndexItemPunchout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexItemAddOrIndexItemDeleteOrIndexItemPunchout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexItemAdd }
     * {@link IndexItemDelete }
     * {@link IndexItemPunchout }
     * 
     * 
     */
    public List<Object> getIndexItemAddOrIndexItemDeleteOrIndexItemPunchout() {
        if (indexItemAddOrIndexItemDeleteOrIndexItemPunchout == null) {
            indexItemAddOrIndexItemDeleteOrIndexItemPunchout = new ArrayList<Object>();
        }
        return this.indexItemAddOrIndexItemDeleteOrIndexItemPunchout;
    }

}
