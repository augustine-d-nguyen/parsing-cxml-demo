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
    "documentReference",
    "status",
    "paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatusOrIntegrationStatus",
    "extrinsic"
})
@XmlRootElement(name = "StatusUpdateRequest")
public class StatusUpdateRequest {

    @XmlElement(name = "DocumentReference")
    protected DocumentReference documentReference;
    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElements({
        @XmlElement(name = "PaymentStatus", type = PaymentStatus.class),
        @XmlElement(name = "SourcingStatus", type = SourcingStatus.class),
        @XmlElement(name = "InvoiceStatus", type = InvoiceStatus.class),
        @XmlElement(name = "DocumentStatus", type = DocumentStatus.class),
        @XmlElement(name = "IntegrationStatus", type = IntegrationStatus.class)
    })
    protected List<Object> paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatusOrIntegrationStatus;
    @XmlElement(name = "Extrinsic")
    protected List<Extrinsic> extrinsic;

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReference }
     *     
     */
    public DocumentReference getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReference }
     *     
     */
    public void setDocumentReference(DocumentReference value) {
        this.documentReference = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatusOrIntegrationStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatusOrIntegrationStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatusOrIntegrationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentStatus }
     * {@link SourcingStatus }
     * {@link InvoiceStatus }
     * {@link DocumentStatus }
     * {@link IntegrationStatus }
     * 
     * 
     */
    public List<Object> getPaymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatusOrIntegrationStatus() {
        if (paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatusOrIntegrationStatus == null) {
            paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatusOrIntegrationStatus = new ArrayList<Object>();
        }
        return this.paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatusOrIntegrationStatus;
    }

    /**
     * Gets the value of the extrinsic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extrinsic }
     * 
     * 
     */
    public List<Extrinsic> getExtrinsic() {
        if (extrinsic == null) {
            extrinsic = new ArrayList<Extrinsic>();
        }
        return this.extrinsic;
    }

}
