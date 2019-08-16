package com.infcn.gms_api.module.hn_api.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "g_informationitem", schema = "infcn_gcm_hn", catalog = "")
public class GInformationitemDo {
    private String id;
    private String catalogRecId;
    private String itemName;
    private String itemNameEn;
    private String dataType;
    private String tableName;
    private String shareType;
    private Date createTime;
    private String createUser;
    private String fieldLength;
    private String shareCondition;
    private String catalogCode;
    private String shareMode;
    private String shareModeType;
    private String openCondition;
    private String isopenSociety;
    private String remarks;
    private String updateCycle;
    private String publishDate;

    @Id
    @Column(name = "id", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "catalogRec_id", nullable = true, length = 50)
    public String getCatalogRecId() {
        return catalogRecId;
    }

    public void setCatalogRecId(String catalogRecId) {
        this.catalogRecId = catalogRecId;
    }

    @Basic
    @Column(name = "item_name", nullable = true, length = 500)
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "item_nameEn", nullable = true, length = 500)
    public String getItemNameEn() {
        return itemNameEn;
    }

    public void setItemNameEn(String itemNameEn) {
        this.itemNameEn = itemNameEn;
    }

    @Basic
    @Column(name = "data_type", nullable = true, length = 50)
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Basic
    @Column(name = "table_name", nullable = true, length = 100)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "share_type", nullable = true, length = 100)
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    @Column(name = "field_length", nullable = true, length = 50)
    public String getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(String fieldLength) {
        this.fieldLength = fieldLength;
    }

    @Basic
    @Column(name = "share_condition", nullable = true, length = 5000)
    public String getShareCondition() {
        return shareCondition;
    }

    public void setShareCondition(String shareCondition) {
        this.shareCondition = shareCondition;
    }

    @Basic
    @Column(name = "catalog_code", nullable = true, length = -1)
    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    @Basic
    @Column(name = "share_mode", nullable = true, length = 50)
    public String getShareMode() {
        return shareMode;
    }

    public void setShareMode(String shareMode) {
        this.shareMode = shareMode;
    }

    @Basic
    @Column(name = "share_mode_type", nullable = true, length = 50)
    public String getShareModeType() {
        return shareModeType;
    }

    public void setShareModeType(String shareModeType) {
        this.shareModeType = shareModeType;
    }

    @Basic
    @Column(name = "open_condition", nullable = true, length = 5000)
    public String getOpenCondition() {
        return openCondition;
    }

    public void setOpenCondition(String openCondition) {
        this.openCondition = openCondition;
    }

    @Basic
    @Column(name = "isopen_society", nullable = true, length = 10)
    public String getIsopenSociety() {
        return isopenSociety;
    }

    public void setIsopenSociety(String isopenSociety) {
        this.isopenSociety = isopenSociety;
    }

    @Basic
    @Column(name = "remarks", nullable = true, length = -1)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "updateCycle", nullable = true, length = 10)
    public String getUpdateCycle() {
        return updateCycle;
    }

    public void setUpdateCycle(String updateCycle) {
        this.updateCycle = updateCycle;
    }

    @Basic
    @Column(name = "publishDate", nullable = true, length = 20)
    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GInformationitemDo that = (GInformationitemDo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(catalogRecId, that.catalogRecId) &&
                Objects.equals(itemName, that.itemName) &&
                Objects.equals(itemNameEn, that.itemNameEn) &&
                Objects.equals(dataType, that.dataType) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(shareType, that.shareType) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(fieldLength, that.fieldLength) &&
                Objects.equals(shareCondition, that.shareCondition) &&
                Objects.equals(catalogCode, that.catalogCode) &&
                Objects.equals(shareMode, that.shareMode) &&
                Objects.equals(shareModeType, that.shareModeType) &&
                Objects.equals(openCondition, that.openCondition) &&
                Objects.equals(isopenSociety, that.isopenSociety) &&
                Objects.equals(remarks, that.remarks) &&
                Objects.equals(updateCycle, that.updateCycle) &&
                Objects.equals(publishDate, that.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, catalogRecId, itemName, itemNameEn, dataType, tableName, shareType, createTime, createUser, fieldLength, shareCondition, catalogCode, shareMode, shareModeType, openCondition, isopenSociety, remarks, updateCycle, publishDate);
    }
}
