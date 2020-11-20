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
    "subcontractingStockInTransferQuantity",
    "unrestrictedUseQuantity",
    "blockedQuantity",
    "qualityInspectionQuantity",
    "promotionQuantity",
    "stockInTransferQuantity",
    "incrementQuantity",
    "requiredMinimumQuantity",
    "requiredMaximumQuantity"
})
@XmlRootElement(name = "ConsignmentInventory")
public class ConsignmentInventory {

    @XmlElement(name = "SubcontractingStockInTransferQuantity")
    protected SubcontractingStockInTransferQuantity subcontractingStockInTransferQuantity;
    @XmlElement(name = "UnrestrictedUseQuantity")
    protected UnrestrictedUseQuantity unrestrictedUseQuantity;
    @XmlElement(name = "BlockedQuantity")
    protected BlockedQuantity blockedQuantity;
    @XmlElement(name = "QualityInspectionQuantity")
    protected QualityInspectionQuantity qualityInspectionQuantity;
    @XmlElement(name = "PromotionQuantity")
    protected PromotionQuantity promotionQuantity;
    @XmlElement(name = "StockInTransferQuantity")
    protected StockInTransferQuantity stockInTransferQuantity;
    @XmlElement(name = "IncrementQuantity")
    protected IncrementQuantity incrementQuantity;
    @XmlElement(name = "RequiredMinimumQuantity")
    protected RequiredMinimumQuantity requiredMinimumQuantity;
    @XmlElement(name = "RequiredMaximumQuantity")
    protected RequiredMaximumQuantity requiredMaximumQuantity;

    /**
     * Gets the value of the subcontractingStockInTransferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SubcontractingStockInTransferQuantity }
     *     
     */
    public SubcontractingStockInTransferQuantity getSubcontractingStockInTransferQuantity() {
        return subcontractingStockInTransferQuantity;
    }

    /**
     * Sets the value of the subcontractingStockInTransferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcontractingStockInTransferQuantity }
     *     
     */
    public void setSubcontractingStockInTransferQuantity(SubcontractingStockInTransferQuantity value) {
        this.subcontractingStockInTransferQuantity = value;
    }

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
     * Gets the value of the qualityInspectionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QualityInspectionQuantity }
     *     
     */
    public QualityInspectionQuantity getQualityInspectionQuantity() {
        return qualityInspectionQuantity;
    }

    /**
     * Sets the value of the qualityInspectionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityInspectionQuantity }
     *     
     */
    public void setQualityInspectionQuantity(QualityInspectionQuantity value) {
        this.qualityInspectionQuantity = value;
    }

    /**
     * Gets the value of the promotionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionQuantity }
     *     
     */
    public PromotionQuantity getPromotionQuantity() {
        return promotionQuantity;
    }

    /**
     * Sets the value of the promotionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionQuantity }
     *     
     */
    public void setPromotionQuantity(PromotionQuantity value) {
        this.promotionQuantity = value;
    }

    /**
     * Gets the value of the stockInTransferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link StockInTransferQuantity }
     *     
     */
    public StockInTransferQuantity getStockInTransferQuantity() {
        return stockInTransferQuantity;
    }

    /**
     * Sets the value of the stockInTransferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockInTransferQuantity }
     *     
     */
    public void setStockInTransferQuantity(StockInTransferQuantity value) {
        this.stockInTransferQuantity = value;
    }

    /**
     * Gets the value of the incrementQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link IncrementQuantity }
     *     
     */
    public IncrementQuantity getIncrementQuantity() {
        return incrementQuantity;
    }

    /**
     * Sets the value of the incrementQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncrementQuantity }
     *     
     */
    public void setIncrementQuantity(IncrementQuantity value) {
        this.incrementQuantity = value;
    }

    /**
     * Gets the value of the requiredMinimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredMinimumQuantity }
     *     
     */
    public RequiredMinimumQuantity getRequiredMinimumQuantity() {
        return requiredMinimumQuantity;
    }

    /**
     * Sets the value of the requiredMinimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredMinimumQuantity }
     *     
     */
    public void setRequiredMinimumQuantity(RequiredMinimumQuantity value) {
        this.requiredMinimumQuantity = value;
    }

    /**
     * Gets the value of the requiredMaximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredMaximumQuantity }
     *     
     */
    public RequiredMaximumQuantity getRequiredMaximumQuantity() {
        return requiredMaximumQuantity;
    }

    /**
     * Sets the value of the requiredMaximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredMaximumQuantity }
     *     
     */
    public void setRequiredMaximumQuantity(RequiredMaximumQuantity value) {
        this.requiredMaximumQuantity = value;
    }

}
