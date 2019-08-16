package com.infcn.gms_api.module.hn_api.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "g_catalogscript_info", schema = "infcn_gcm_hn", catalog = "")
public class GCatalogscriptInfoDo {
    private String id;
    private Integer catCode;
    private String contents;
    private String createDept;
    private String deptIds;
    private String name;
    private String pId;
    private String open;
    private String catalogId;
    private Integer rootCode;

    @Id
    @Column(name = "id", nullable = false, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cat_code", nullable = false)
    public Integer getCatCode() {
        return catCode;
    }

    public void setCatCode(Integer catCode) {
        this.catCode = catCode;
    }

    @Basic
    @Column(name = "contents", nullable = true, length = -1)
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Basic
    @Column(name = "createDept", nullable = true, length = 255)
    public String getCreateDept() {
        return createDept;
    }

    public void setCreateDept(String createDept) {
        this.createDept = createDept;
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
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "pId", nullable = true, length = 50)
    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    @Basic
    @Column(name = "open", nullable = true, length = 50)
    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    @Basic
    @Column(name = "catalog_id", nullable = false, length = 50)
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    @Basic
    @Column(name = "rootCode", nullable = true)
    public Integer getRootCode() {
        return rootCode;
    }

    public void setRootCode(Integer rootCode) {
        this.rootCode = rootCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GCatalogscriptInfoDo that = (GCatalogscriptInfoDo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(catCode, that.catCode) &&
                Objects.equals(contents, that.contents) &&
                Objects.equals(createDept, that.createDept) &&
                Objects.equals(deptIds, that.deptIds) &&
                Objects.equals(name, that.name) &&
                Objects.equals(pId, that.pId) &&
                Objects.equals(open, that.open) &&
                Objects.equals(catalogId, that.catalogId) &&
                Objects.equals(rootCode, that.rootCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, catCode, contents, createDept, deptIds, name, pId, open, catalogId, rootCode);
    }
}
