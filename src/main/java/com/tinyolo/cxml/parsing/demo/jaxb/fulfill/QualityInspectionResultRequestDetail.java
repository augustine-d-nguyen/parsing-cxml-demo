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
    "qualityInspectionValuation"
})
@XmlRootElement(name = "QualityInspectionResultRequestDetail")
public class QualityInspectionResultRequestDetail {

    @XmlElement(name = "QualityInspectionValuation", required = true)
    protected List<QualityInspectionValuation> qualityInspectionValuation;

    /**
     * Gets the value of the qualityInspectionValuation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityInspectionValuation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityInspectionValuation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualityInspectionValuation }
     * 
     * 
     */
    public List<QualityInspectionValuation> getQualityInspectionValuation() {
        if (qualityInspectionValuation == null) {
            qualityInspectionValuation = new ArrayList<QualityInspectionValuation>();
        }
        return this.qualityInspectionValuation;
    }

}
