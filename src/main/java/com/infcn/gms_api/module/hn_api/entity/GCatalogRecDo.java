package com.infcn.gms_api.module.hn_api.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "g_catalog_rec", schema = "infcn_gcm_hn", catalog = "")
public class GCatalogRecDo {
    private String id;
    private String restitle;
    private String status;
    private String sourceCodeMiddle;
    private String sourceCodePrev;
    private String sourceCodeLast;
    private String catId;
    private String metadataId;
    private String createUser;
    private Date createDate;
    private String deptIds;
    private String doUserCode;
    private Date doTime;
    private String doCause;
    private String rootCode;
    private String deptNames;
    private String kvlist;
    private String tabname;
    private String formHtml;
    private String mustFields;
    private String lastCodeId;
    private String catlogId;
    private String path;
    private String dataClassify;
    private String eventType;
    private String resourceApply;
    private String resourceApplyInner;
    private String resourceApplyCode;
    private String resourceType;
    private String resourceFileType;
    private String otherResourceDescribe;
    private String updateCycle;
    private String publishDate;
    private String net;
    private String resourcePosition;
    private String resourceSummary;
    private String relationCat;
    private String relationName;
    private String relationParentId;
    private String relationSystem;
    private String totalDataStore;
    private String shareDataStore;
    private String openDataStore;
    private String totalStructRecords;
    private String shareStructRecords;
    private String openStructRecords;
    private String allCode;
    private String catalogGroupId;
    private String cataId;
    private String sharedType;
    private String sharedCondition;
    private String openType;
    private String openCondition;
    private String digTableId;

    @Id
    @Column(name = "id", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "restitle", nullable = true, length = 1000)
    public String getRestitle() {
        return restitle;
    }

    public void setRestitle(String restitle) {
        this.restitle = restitle;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 20)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "sourceCodeMiddle", nullable = true, length = 1000)
    public String getSourceCodeMiddle() {
        return sourceCodeMiddle;
    }

    public void setSourceCodeMiddle(String sourceCodeMiddle) {
        this.sourceCodeMiddle = sourceCodeMiddle;
    }

    @Basic
    @Column(name = "source_code_prev", nullable = true, length = -1)
    public String getSourceCodePrev() {
        return sourceCodePrev;
    }

    public void setSourceCodePrev(String sourceCodePrev) {
        this.sourceCodePrev = sourceCodePrev;
    }

    @Basic
    @Column(name = "source_code_last", nullable = true, length = -1)
    public String getSourceCodeLast() {
        return sourceCodeLast;
    }

    public void setSourceCodeLast(String sourceCodeLast) {
        this.sourceCodeLast = sourceCodeLast;
    }

    @Basic
    @Column(name = "cat_id", nullable = true, length = 255)
    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    @Basic
    @Column(name = "metadata_id", nullable = true, length = 255)
    public String getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(String metadataId) {
        this.metadataId = metadataId;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 50)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "dept_ids", nullable = true, length = -1)
    public String getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(String deptIds) {
        this.deptIds = deptIds;
    }

    @Basic
    @Column(name = "do_user_code", nullable = true, length = 50)
    public String getDoUserCode() {
        return doUserCode;
    }

    public void setDoUserCode(String doUserCode) {
        this.doUserCode = doUserCode;
    }

    @Basic
    @Column(name = "do_time", nullable = true)
    public Date getDoTime() {
        return doTime;
    }

    public void setDoTime(Date doTime) {
        this.doTime = doTime;
    }

    @Basic
    @Column(name = "do_cause", nullable = true, length = 255)
    public String getDoCause() {
        return doCause;
    }

    public void setDoCause(String doCause) {
        this.doCause = doCause;
    }

    @Basic
    @Column(name = "rootCode", nullable = true, length = 255)
    public String getRootCode() {
        return rootCode;
    }

    public void setRootCode(String rootCode) {
        this.rootCode = rootCode;
    }

    @Basic
    @Column(name = "dept_names", nullable = true, length = -1)
    public String getDeptNames() {
        return deptNames;
    }

    public void setDeptNames(String deptNames) {
        this.deptNames = deptNames;
    }

    @Basic
    @Column(name = "kvlist", nullable = true, length = -1)
    public String getKvlist() {
        return kvlist;
    }

    public void setKvlist(String kvlist) {
        this.kvlist = kvlist;
    }

    @Basic
    @Column(name = "tabname", nullable = true, length = 255)
    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }

    @Basic
    @Column(name = "form_html", nullable = true, length = -1)
    public String getFormHtml() {
        return formHtml;
    }

    public void setFormHtml(String formHtml) {
        this.formHtml = formHtml;
    }

    @Basic
    @Column(name = "mustFields", nullable = true, length = -1)
    public String getMustFields() {
        return mustFields;
    }

    public void setMustFields(String mustFields) {
        this.mustFields = mustFields;
    }

    @Basic
    @Column(name = "lastCodeId", nullable = true, length = 50)
    public String getLastCodeId() {
        return lastCodeId;
    }

    public void setLastCodeId(String lastCodeId) {
        this.lastCodeId = lastCodeId;
    }

    @Basic
    @Column(name = "catlogId", nullable = true, length = 50)
    public String getCatlogId() {
        return catlogId;
    }

    public void setCatlogId(String catlogId) {
        this.catlogId = catlogId;
    }

    @Basic
    @Column(name = "path", nullable = true, length = -1)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "data_classify", nullable = true, length = 50)
    public String getDataClassify() {
        return dataClassify;
    }

    public void setDataClassify(String dataClassify) {
        this.dataClassify = dataClassify;
    }

    @Basic
    @Column(name = "event_type", nullable = true, length = 50)
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Basic
    @Column(name = "resourceApply", nullable = true, length = 100)
    public String getResourceApply() {
        return resourceApply;
    }

    public void setResourceApply(String resourceApply) {
        this.resourceApply = resourceApply;
    }

    @Basic
    @Column(name = "resourceApplyInner", nullable = true, length = 500)
    public String getResourceApplyInner() {
        return resourceApplyInner;
    }

    public void setResourceApplyInner(String resourceApplyInner) {
        this.resourceApplyInner = resourceApplyInner;
    }

    @Basic
    @Column(name = "resourceApplyCode", nullable = true, length = 100)
    public String getResourceApplyCode() {
        return resourceApplyCode;
    }

    public void setResourceApplyCode(String resourceApplyCode) {
        this.resourceApplyCode = resourceApplyCode;
    }

    @Basic
    @Column(name = "resourceType", nullable = true, length = 200)
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Basic
    @Column(name = "resourceFileType", nullable = true, length = 100)
    public String getResourceFileType() {
        return resourceFileType;
    }

    public void setResourceFileType(String resourceFileType) {
        this.resourceFileType = resourceFileType;
    }

    @Basic
    @Column(name = "otherResourceDescribe", nullable = true, length = 2000)
    public String getOtherResourceDescribe() {
        return otherResourceDescribe;
    }

    public void setOtherResourceDescribe(String otherResourceDescribe) {
        this.otherResourceDescribe = otherResourceDescribe;
    }

    @Basic
    @Column(name = "updateCycle", nullable = true, length = 20)
    public String getUpdateCycle() {
        return updateCycle;
    }

    public void setUpdateCycle(String updateCycle) {
        this.updateCycle = updateCycle;
    }

    @Basic
    @Column(name = "publishDate", nullable = true, length = 100)
    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Basic
    @Column(name = "net", nullable = true, length = 10)
    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    @Basic
    @Column(name = "resourcePosition", nullable = true, length = 2000)
    public String getResourcePosition() {
        return resourcePosition;
    }

    public void setResourcePosition(String resourcePosition) {
        this.resourcePosition = resourcePosition;
    }

    @Basic
    @Column(name = "resourceSummary", nullable = true, length = -1)
    public String getResourceSummary() {
        return resourceSummary;
    }

    public void setResourceSummary(String resourceSummary) {
        this.resourceSummary = resourceSummary;
    }

    @Basic
    @Column(name = "relationCat", nullable = true, length = 2000)
    public String getRelationCat() {
        return relationCat;
    }

    public void setRelationCat(String relationCat) {
        this.relationCat = relationCat;
    }

    @Basic
    @Column(name = "relationName", nullable = true, length = 2000)
    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    @Basic
    @Column(name = "relationParentId", nullable = true, length = 50)
    public String getRelationParentId() {
        return relationParentId;
    }

    public void setRelationParentId(String relationParentId) {
        this.relationParentId = relationParentId;
    }

    @Basic
    @Column(name = "relationSystem", nullable = true, length = 2000)
    public String getRelationSystem() {
        return relationSystem;
    }

    public void setRelationSystem(String relationSystem) {
        this.relationSystem = relationSystem;
    }

    @Basic
    @Column(name = "totalDataStore", nullable = true, length = 100)
    public String getTotalDataStore() {
        return totalDataStore;
    }

    public void setTotalDataStore(String totalDataStore) {
        this.totalDataStore = totalDataStore;
    }

    @Basic
    @Column(name = "shareDataStore", nullable = true, length = 100)
    public String getShareDataStore() {
        return shareDataStore;
    }

    public void setShareDataStore(String shareDataStore) {
        this.shareDataStore = shareDataStore;
    }

    @Basic
    @Column(name = "openDataStore", nullable = true, length = 100)
    public String getOpenDataStore() {
        return openDataStore;
    }

    public void setOpenDataStore(String openDataStore) {
        this.openDataStore = openDataStore;
    }

    @Basic
    @Column(name = "totalStructRecords", nullable = true, length = 100)
    public String getTotalStructRecords() {
        return totalStructRecords;
    }

    public void setTotalStructRecords(String totalStructRecords) {
        this.totalStructRecords = totalStructRecords;
    }

    @Basic
    @Column(name = "shareStructRecords", nullable = true, length = 100)
    public String getShareStructRecords() {
        return shareStructRecords;
    }

    public void setShareStructRecords(String shareStructRecords) {
        this.shareStructRecords = shareStructRecords;
    }

    @Basic
    @Column(name = "openStructRecords", nullable = true, length = 100)
    public String getOpenStructRecords() {
        return openStructRecords;
    }

    public void setOpenStructRecords(String openStructRecords) {
        this.openStructRecords = openStructRecords;
    }

    @Basic
    @Column(name = "allCode", nullable = true, length = 50)
    public String getAllCode() {
        return allCode;
    }

    public void setAllCode(String allCode) {
        this.allCode = allCode;
    }

    @Basic
    @Column(name = "catalogGroupId", nullable = true, length = 50)
    public String getCatalogGroupId() {
        return catalogGroupId;
    }

    public void setCatalogGroupId(String catalogGroupId) {
        this.catalogGroupId = catalogGroupId;
    }

    @Basic
    @Column(name = "cata_id", nullable = true, length = 32)
    public String getCataId() {
        return cataId;
    }

    public void setCataId(String cataId) {
        this.cataId = cataId;
    }

    @Basic
    @Column(name = "sharedType", nullable = true, length = 10)
    public String getSharedType() {
        return sharedType;
    }

    public void setSharedType(String sharedType) {
        this.sharedType = sharedType;
    }

    @Basic
    @Column(name = "sharedCondition", nullable = true, length = 200)
    public String getSharedCondition() {
        return sharedCondition;
    }

    public void setSharedCondition(String sharedCondition) {
        this.sharedCondition = sharedCondition;
    }

    @Basic
    @Column(name = "openType", nullable = true, length = 10)
    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    @Basic
    @Column(name = "openCondition", nullable = true, length = 1024)
    public String getOpenCondition() {
        return openCondition;
    }

    public void setOpenCondition(String openCondition) {
        this.openCondition = openCondition;
    }

    @Basic
    @Column(name = "digTableId", nullable = true, length = 0)
    public String getDigTableId() {
        return digTableId;
    }

    public void setDigTableId(String digTableId) {
        this.digTableId = digTableId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GCatalogRecDo that = (GCatalogRecDo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(restitle, that.restitle) &&
                Objects.equals(status, that.status) &&
                Objects.equals(sourceCodeMiddle, that.sourceCodeMiddle) &&
                Objects.equals(sourceCodePrev, that.sourceCodePrev) &&
                Objects.equals(sourceCodeLast, that.sourceCodeLast) &&
                Objects.equals(catId, that.catId) &&
                Objects.equals(metadataId, that.metadataId) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(deptIds, that.deptIds) &&
                Objects.equals(doUserCode, that.doUserCode) &&
                Objects.equals(doTime, that.doTime) &&
                Objects.equals(doCause, that.doCause) &&
                Objects.equals(rootCode, that.rootCode) &&
                Objects.equals(deptNames, that.deptNames) &&
                Objects.equals(kvlist, that.kvlist) &&
                Objects.equals(tabname, that.tabname) &&
                Objects.equals(formHtml, that.formHtml) &&
                Objects.equals(mustFields, that.mustFields) &&
                Objects.equals(lastCodeId, that.lastCodeId) &&
                Objects.equals(catlogId, that.catlogId) &&
                Objects.equals(path, that.path) &&
                Objects.equals(dataClassify, that.dataClassify) &&
                Objects.equals(eventType, that.eventType) &&
                Objects.equals(resourceApply, that.resourceApply) &&
                Objects.equals(resourceApplyInner, that.resourceApplyInner) &&
                Objects.equals(resourceApplyCode, that.resourceApplyCode) &&
                Objects.equals(resourceType, that.resourceType) &&
                Objects.equals(resourceFileType, that.resourceFileType) &&
                Objects.equals(otherResourceDescribe, that.otherResourceDescribe) &&
                Objects.equals(updateCycle, that.updateCycle) &&
                Objects.equals(publishDate, that.publishDate) &&
                Objects.equals(net, that.net) &&
                Objects.equals(resourcePosition, that.resourcePosition) &&
                Objects.equals(resourceSummary, that.resourceSummary) &&
                Objects.equals(relationCat, that.relationCat) &&
                Objects.equals(relationName, that.relationName) &&
                Objects.equals(relationParentId, that.relationParentId) &&
                Objects.equals(relationSystem, that.relationSystem) &&
                Objects.equals(totalDataStore, that.totalDataStore) &&
                Objects.equals(shareDataStore, that.shareDataStore) &&
                Objects.equals(openDataStore, that.openDataStore) &&
                Objects.equals(totalStructRecords, that.totalStructRecords) &&
                Objects.equals(shareStructRecords, that.shareStructRecords) &&
                Objects.equals(openStructRecords, that.openStructRecords) &&
                Objects.equals(allCode, that.allCode) &&
                Objects.equals(catalogGroupId, that.catalogGroupId) &&
                Objects.equals(cataId, that.cataId) &&
                Objects.equals(sharedType, that.sharedType) &&
                Objects.equals(sharedCondition, that.sharedCondition) &&
                Objects.equals(openType, that.openType) &&
                Objects.equals(openCondition, that.openCondition) &&
                Objects.equals(digTableId, that.digTableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, restitle, status, sourceCodeMiddle, sourceCodePrev, sourceCodeLast, catId, metadataId, createUser, createDate, deptIds, doUserCode, doTime, doCause, rootCode, deptNames, kvlist, tabname, formHtml, mustFields, lastCodeId, catlogId, path, dataClassify, eventType, resourceApply, resourceApplyInner, resourceApplyCode, resourceType, resourceFileType, otherResourceDescribe, updateCycle, publishDate, net, resourcePosition, resourceSummary, relationCat, relationName, relationParentId, relationSystem, totalDataStore, shareDataStore, openDataStore, totalStructRecords, shareStructRecords, openStructRecords, allCode, catalogGroupId, cataId, sharedType, sharedCondition, openType, openCondition, digTableId);
    }
}
