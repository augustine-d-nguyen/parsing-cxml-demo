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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profileRequestOrOrderRequestOrMasterAgreementRequestOrPurchaseRequisitionRequestOrPunchOutSetupRequestOrProviderSetupRequestOrStatusUpdateRequestOrGetPendingRequestOrSubscriptionListRequestOrSubscriptionContentRequestOrSupplierListRequestOrSupplierDataRequestOrSubscriptionStatusUpdateRequestOrCopyRequestOrCatalogUploadRequestOrAuthRequestOrDataRequestOrOrganizationDataRequestOrApprovalRequestOrQualityNotificationRequestOrQualityInspectionRequestOrQualityInspectionResultRequestOrQualityInspectionDecisionRequest"
})
@XmlRootElement(name = "Request")
public class Request {

    @XmlAttribute(name = "deploymentMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deploymentMode;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElements({
        @XmlElement(name = "ProfileRequest", required = true, type = ProfileRequest.class),
        @XmlElement(name = "OrderRequest", required = true, type = OrderRequest.class),
        @XmlElement(name = "MasterAgreementRequest", required = true, type = MasterAgreementRequest.class),
        @XmlElement(name = "PurchaseRequisitionRequest", required = true, type = PurchaseRequisitionRequest.class),
        @XmlElement(name = "PunchOutSetupRequest", required = true, type = PunchOutSetupRequest.class),
        @XmlElement(name = "ProviderSetupRequest", required = true, type = ProviderSetupRequest.class),
        @XmlElement(name = "StatusUpdateRequest", required = true, type = StatusUpdateRequest.class),
        @XmlElement(name = "GetPendingRequest", required = true, type = GetPendingRequest.class),
        @XmlElement(name = "SubscriptionListRequest", required = true, type = SubscriptionListRequest.class),
        @XmlElement(name = "SubscriptionContentRequest", required = true, type = SubscriptionContentRequest.class),
        @XmlElement(name = "SupplierListRequest", required = true, type = SupplierListRequest.class),
        @XmlElement(name = "SupplierDataRequest", required = true, type = SupplierDataRequest.class),
        @XmlElement(name = "SubscriptionStatusUpdateRequest", required = true, type = SubscriptionStatusUpdateRequest.class),
        @XmlElement(name = "CopyRequest", required = true, type = CopyRequest.class),
        @XmlElement(name = "CatalogUploadRequest", required = true, type = CatalogUploadRequest.class),
        @XmlElement(name = "AuthRequest", required = true, type = AuthRequest.class),
        @XmlElement(name = "DataRequest", required = true, type = DataRequest.class),
        @XmlElement(name = "OrganizationDataRequest", required = true, type = OrganizationDataRequest.class),
        @XmlElement(name = "ApprovalRequest", required = true, type = ApprovalRequest.class),
        @XmlElement(name = "QualityNotificationRequest", required = true, type = QualityNotificationRequest.class),
        @XmlElement(name = "QualityInspectionRequest", required = true, type = QualityInspectionRequest.class),
        @XmlElement(name = "QualityInspectionResultRequest", required = true, type = QualityInspectionResultRequest.class),
        @XmlElement(name = "QualityInspectionDecisionRequest", required = true, type = QualityInspectionDecisionRequest.class)
    })
    protected List<Object> profileRequestOrOrderRequestOrMasterAgreementRequestOrPurchaseRequisitionRequestOrPunchOutSetupRequestOrProviderSetupRequestOrStatusUpdateRequestOrGetPendingRequestOrSubscriptionListRequestOrSubscriptionContentRequestOrSupplierListRequestOrSupplierDataRequestOrSubscriptionStatusUpdateRequestOrCopyRequestOrCatalogUploadRequestOrAuthRequestOrDataRequestOrOrganizationDataRequestOrApprovalRequestOrQualityNotificationRequestOrQualityInspectionRequestOrQualityInspectionResultRequestOrQualityInspectionDecisionRequest;

    /**
     * Gets the value of the deploymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentMode() {
        if (deploymentMode == null) {
            return "production";
        } else {
            return deploymentMode;
        }
    }

    /**
     * Sets the value of the deploymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentMode(String value) {
        this.deploymentMode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the profileRequestOrOrderRequestOrMasterAgreementRequestOrPurchaseRequisitionRequestOrPunchOutSetupRequestOrProviderSetupRequestOrStatusUpdateRequestOrGetPendingRequestOrSubscriptionListRequestOrSubscriptionContentRequestOrSupplierListRequestOrSupplierDataRequestOrSubscriptionStatusUpdateRequestOrCopyRequestOrCatalogUploadRequestOrAuthRequestOrDataRequestOrOrganizationDataRequestOrApprovalRequestOrQualityNotificationRequestOrQualityInspectionRequestOrQualityInspectionResultRequestOrQualityInspectionDecisionRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileRequestOrOrderRequestOrMasterAgreementRequestOrPurchaseRequisitionRequestOrPunchOutSetupRequestOrProviderSetupRequestOrStatusUpdateRequestOrGetPendingRequestOrSubscriptionListRequestOrSubscriptionContentRequestOrSupplierListRequestOrSupplierDataRequestOrSubscriptionStatusUpdateRequestOrCopyRequestOrCatalogUploadRequestOrAuthRequestOrDataRequestOrOrganizationDataRequestOrApprovalRequestOrQualityNotificationRequestOrQualityInspectionRequestOrQualityInspectionResultRequestOrQualityInspectionDecisionRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileRequestOrOrderRequestOrMasterAgreementRequestOrPurchaseRequisitionRequestOrPunchOutSetupRequestOrProviderSetupRequestOrStatusUpdateRequestOrGetPendingRequestOrSubscriptionListRequestOrSubscriptionContentRequestOrSupplierListRequestOrSupplierDataRequestOrSubscriptionStatusUpdateRequestOrCopyRequestOrCatalogUploadRequestOrAuthRequestOrDataRequestOrOrganizationDataRequestOrApprovalRequestOrQualityNotificationRequestOrQualityInspectionRequestOrQualityInspectionResultRequestOrQualityInspectionDecisionRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileRequest }
     * {@link OrderRequest }
     * {@link MasterAgreementRequest }
     * {@link PurchaseRequisitionRequest }
     * {@link PunchOutSetupRequest }
     * {@link ProviderSetupRequest }
     * {@link StatusUpdateRequest }
     * {@link GetPendingRequest }
     * {@link SubscriptionListRequest }
     * {@link SubscriptionContentRequest }
     * {@link SupplierListRequest }
     * {@link SupplierDataRequest }
     * {@link SubscriptionStatusUpdateRequest }
     * {@link CopyRequest }
     * {@link CatalogUploadRequest }
     * {@link AuthRequest }
     * {@link DataRequest }
     * {@link OrganizationDataRequest }
     * {@link ApprovalRequest }
     * {@link QualityNotificationRequest }
     * {@link QualityInspectionRequest }
     * {@link QualityInspectionResultRequest }
     * {@link QualityInspectionDecisionRequest }
     * 
     * 
     */
    public List<Object> getProfileRequestOrOrderRequestOrMasterAgreementRequestOrPurchaseRequisitionRequestOrPunchOutSetupRequestOrProviderSetupRequestOrStatusUpdateRequestOrGetPendingRequestOrSubscriptionListRequestOrSubscriptionContentRequestOrSupplierListRequestOrSupplierDataRequestOrSubscriptionStatusUpdateRequestOrCopyRequestOrCatalogUploadRequestOrAuthRequestOrDataRequestOrOrganizationDataRequestOrApprovalRequestOrQualityNotificationRequestOrQualityInspectionRequestOrQualityInspectionResultRequestOrQualityInspectionDecisionRequest() {
        if (profileRequestOrOrderRequestOrMasterAgreementRequestOrPurchaseRequisitionRequestOrPunchOutSetupRequestOrProviderSetupRequestOrStatusUpdateRequestOrGetPendingRequestOrSubscriptionListRequestOrSubscriptionContentRequestOrSupplierListRequestOrSupplierDataRequestOrSubscriptionStatusUpdateRequestOrCopyRequestOrCatalogUploadRequestOrAuthRequestOrDataRequestOrOrganizationDataRequestOrApprovalRequestOrQualityNotificationRequestOrQualityInspectionRequestOrQualityInspectionResultRequestOrQualityInspectionDecisionRequest == null) {
            profileRequestOrOrderRequestOrMasterAgreementRequestOrPurchaseRequisitionRequestOrPunchOutSetupRequestOrProviderSetupRequestOrStatusUpdateRequestOrGetPendingRequestOrSubscriptionListRequestOrSubscriptionContentRequestOrSupplierListRequestOrSupplierDataRequestOrSubscriptionStatusUpdateRequestOrCopyRequestOrCatalogUploadRequestOrAuthRequestOrDataRequestOrOrganizationDataRequestOrApprovalRequestOrQualityNotificationRequestOrQualityInspectionRequestOrQualityInspectionResultRequestOrQualityInspectionDecisionRequest = new ArrayList<Object>();
        }
        return this.profileRequestOrOrderRequestOrMasterAgreementRequestOrPurchaseRequisitionRequestOrPunchOutSetupRequestOrProviderSetupRequestOrStatusUpdateRequestOrGetPendingRequestOrSubscriptionListRequestOrSubscriptionContentRequestOrSupplierListRequestOrSupplierDataRequestOrSubscriptionStatusUpdateRequestOrCopyRequestOrCatalogUploadRequestOrAuthRequestOrDataRequestOrOrganizationDataRequestOrApprovalRequestOrQualityNotificationRequestOrQualityInspectionRequestOrQualityInspectionResultRequestOrQualityInspectionDecisionRequest;
    }

}
