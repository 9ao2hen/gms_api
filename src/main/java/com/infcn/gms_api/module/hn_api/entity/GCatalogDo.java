package com.infcn.gms_api.module.hn_api.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "g_catalog", schema = "infcn_gcm_hn", catalog = "")
public class GCatalogDo {
    private String id;
    private String catalogName;
    private String metadataId;
    private String description;
    private String createUser;
    private Date createDate;
    private String catalogScriptInfo;
    private Integer releaseStatus;

    @Id
    @Column(name = "id", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "catalog_name", nullable = true, length = 100)
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    @Basic
    @Column(name = "metadata_id", nullable = true, length = 50)
    public String getMetadataId() {
        return metadataId;
    }

    public void setMetadataId(String metadataId) {
        this.metadataId = metadataId;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 40)
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
    @Column(name = "catalog_script_info", nullable = true, length = -1)
    public String getCatalogScriptInfo() {
        return catalogScriptInfo;
    }

    public void setCatalogScriptInfo(String catalogScriptInfo) {
        this.catalogScriptInfo = catalogScriptInfo;
    }

    @Basic
    @Column(name = "release_status", nullable = true)
    public Integer getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(Integer releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GCatalogDo that = (GCatalogDo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(catalogName, that.catalogName) &&
                Objects.equals(metadataId, that.metadataId) &&
                Objects.equals(description, that.description) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(catalogScriptInfo, that.catalogScriptInfo) &&
                Objects.equals(releaseStatus, that.releaseStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, catalogName, metadataId, description, createUser, createDate, catalogScriptInfo, releaseStatus);
    }
}
