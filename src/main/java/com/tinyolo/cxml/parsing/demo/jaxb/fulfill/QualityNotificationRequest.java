//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:08:13 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.fulfill;

import java.util.ArrayList;
import java.util.List;
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
    "qualityNotificationRequestHeader",
    "qualityNotificationRequestItem"
})
@XmlRootElement(name = "QualityNotificationRequest")
public class QualityNotificationRequest {

    @XmlElement(name = "QualityNotificationRequestHeader", required = true)
    protected QualityNotificationRequestHeader qualityNotificationRequestHeader;
    @XmlElement(name = "QualityNotificationRequestItem")
    protected List<QualityNotificationRequestItem> qualityNotificationRequestItem;

    /**
     * Gets the value of the qualityNotificationRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link QualityNotificationRequestHeader }
     *     
     */
    public QualityNotificationRequestHeader getQualityNotificationRequestHeader() {
        return qualityNotificationRequestHeader;
    }

    /**
     * Sets the value of the qualityNotificationRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityNotificationRequestHeader }
     *     
     */
    public void setQualityNotificationRequestHeader(QualityNotificationRequestHeader value) {
        this.qualityNotificationRequestHeader = value;
    }

    /**
     * Gets the value of the qualityNotificationRequestItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityNotificationRequestItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityNotificationRequestItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualityNotificationRequestItem }
     * 
     * 
     */
    public List<QualityNotificationRequestItem> getQualityNotificationRequestItem() {
        if (qualityNotificationRequestItem == null) {
            qualityNotificationRequestItem = new ArrayList<QualityNotificationRequestItem>();
        }
        return this.qualityNotificationRequestItem;
    }

}
