//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.20 at 08:07:34 PM ICT 
//


package com.tinyolo.cxml.parsing.demo.jaxb.cxml;

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
    "unrestrictedUseQuantity",
    "scrapQuantity",
    "sampleUsageQuantity",
    "blockedQuantity",
    "newMaterialQuantity",
    "reserveQuantity",
    "returnQuantity"
})
@XmlRootElement(name = "QualityInspectionLotStock")
public class QualityInspectionLotStock {

    @XmlElement(name = "UnrestrictedUseQuantity")
    protected UnrestrictedUseQuantity unrestrictedUseQuantity;
    @XmlElement(name = "ScrapQuantity")
    protected ScrapQuantity scrapQuantity;
    @XmlElement(name = "SampleUsageQuantity")
    protected SampleUsageQuantity sampleUsageQuantity;
    @XmlElement(name = "BlockedQuantity")
    protected BlockedQuantity blockedQuantity;
    @XmlElement(name = "NewMaterialQuantity")
    protected NewMaterialQuantity newMaterialQuantity;
    @XmlElement(name = "ReserveQuantity")
    protected ReserveQuantity reserveQuantity;
    @XmlElement(name = "ReturnQuantity")
    protected ReturnQuantity returnQuantity;

    /**
     * Gets the value of the unrestrictedUseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link UnrestrictedUseQuantity }
     *     
     */
    public UnrestrictedUseQuantity getUnrestrictedUseQuantity() {
        return unrestrictedUseQuantity;
    }

    /**
     * Sets the value of the unrestrictedUseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnrestrictedUseQuantity }
     *     
     */
    public void setUnrestrictedUseQuantity(UnrestrictedUseQuantity value) {
        this.unrestrictedUseQuantity = value;
    }

    /**
     * Gets the value of the scrapQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ScrapQuantity }
     *     
     */
    public ScrapQuantity getScrapQuantity() {
        return scrapQuantity;
    }

    /**
     * Sets the value of the scrapQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScrapQuantity }
     *     
     */
    public void setScrapQuantity(ScrapQuantity value) {
        this.scrapQuantity = value;
    }

    /**
     * Gets the value of the sampleUsageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SampleUsageQuantity }
     *     
     */
    public SampleUsageQuantity getSampleUsageQuantity() {
        return sampleUsageQuantity;
    }

    /**
     * Sets the value of the sampleUsageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleUsageQuantity }
     *     
     */
    public void setSampleUsageQuantity(SampleUsageQuantity value) {
        this.sampleUsageQuantity = value;
    }

    /**
     * Gets the value of the blockedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BlockedQuantity }
     *     
     */
    public BlockedQuantity getBlockedQuantity() {
        return blockedQuantity;
    }

    /**
     * Sets the value of the blockedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockedQuantity }
     *     
     */
    public void setBlockedQuantity(BlockedQuantity value) {
        this.blockedQuantity = value;
    }

    /**
     * Gets the value of the newMaterialQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link NewMaterialQuantity }
     *     
     */
    public NewMaterialQuantity getNewMaterialQuantity() {
        return newMaterialQuantity;
    }

    /**
     * Sets the value of the newMaterialQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewMaterialQuantity }
     *     
     */
    public void setNewMaterialQuantity(NewMaterialQuantity value) {
        this.newMaterialQuantity = value;
    }

    /**
     * Gets the value of the reserveQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ReserveQuantity }
     *     
     */
    public ReserveQuantity getReserveQuantity() {
        return reserveQuantity;
    }

    /**
     * Sets the value of the reserveQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReserveQuantity }
     *     
     */
    public void setReserveQuantity(ReserveQuantity value) {
        this.reserveQuantity = value;
    }

    /**
     * Gets the value of the returnQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnQuantity }
     *     
     */
    public ReturnQuantity getReturnQuantity() {
        return returnQuantity;
    }

    /**
     * Sets the value of the returnQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnQuantity }
     *     
     */
    public void setReturnQuantity(ReturnQuantity value) {
        this.returnQuantity = value;
    }

}
