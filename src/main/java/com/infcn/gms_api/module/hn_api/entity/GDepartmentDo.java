package com.infcn.gms_api.module.hn_api.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "g_department", schema = "infcn_gcm_hn", catalog = "")
public class GDepartmentDo {
    private String id;
    private String orgPid;
    private String orgCode;
    private String orgName;
    private String sourceCodePrev;
    private String sourceCodePrevBak;
    private String orgType;
    private String executiveLevel;
    private String orgAddress;
    private String dutyDesc;
    private String businessDesc;
    private String dutyUser;
    private String telephone;
    private String fax;
    private String postNumber;
    private String email;
    private String website;
    private String createUser;
    private Date createDate;
    private Integer sort;

    @Id
    @Column(name = "id", nullable = false, length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "org_pid", nullable = true, length = 40)
    public String getOrgPid() {
        return orgPid;
    }

    public void setOrgPid(String orgPid) {
        this.orgPid = orgPid;
    }

    @Basic
    @Column(name = "org_code", nullable = true, length = -1)
    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Basic
    @Column(name = "org_name", nullable = false, length = 200)
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "source_code_prev", nullable = true, length = 200)
    public String getSourceCodePrev() {
        return sourceCodePrev;
    }

    public void setSourceCodePrev(String sourceCodePrev) {
        this.sourceCodePrev = sourceCodePrev;
    }

    @Basic
    @Column(name = "source_code_prev_bak", nullable = true, length = 200)
    public String getSourceCodePrevBak() {
        return sourceCodePrevBak;
    }

    public void setSourceCodePrevBak(String sourceCodePrevBak) {
        this.sourceCodePrevBak = sourceCodePrevBak;
    }

    @Basic
    @Column(name = "org_type", nullable = true, length = 40)
    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    @Basic
    @Column(name = "executive_level", nullable = true, length = 40)
    public String getExecutiveLevel() {
        return executiveLevel;
    }

    public void setExecutiveLevel(String executiveLevel) {
        this.executiveLevel = executiveLevel;
    }

    @Basic
    @Column(name = "org_address", nullable = true, length = 200)
    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    @Basic
    @Column(name = "duty_desc", nullable = true, length = 800)
    public String getDutyDesc() {
        return dutyDesc;
    }

    public void setDutyDesc(String dutyDesc) {
        this.dutyDesc = dutyDesc;
    }

    @Basic
    @Column(name = "business_desc", nullable = true, length = 200)
    public String getBusinessDesc() {
        return businessDesc;
    }

    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }

    @Basic
    @Column(name = "duty_user", nullable = true, length = 150)
    public String getDutyUser() {
        return dutyUser;
    }

    public void setDutyUser(String dutyUser) {
        this.dutyUser = dutyUser;
    }

    @Basic
    @Column(name = "telephone", nullable = true, length = 20)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "fax", nullable = true, length = 20)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "post_number", nullable = true, length = 200)
    public String getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 200)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "website", nullable = true, length = -1)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "create_user", nullable = false, length = 40)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_date", nullable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "sort", nullable = true)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GDepartmentDo that = (GDepartmentDo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(orgPid, that.orgPid) &&
                Objects.equals(orgCode, that.orgCode) &&
                Objects.equals(orgName, that.orgName) &&
                Objects.equals(sourceCodePrev, that.sourceCodePrev) &&
                Objects.equals(sourceCodePrevBak, that.sourceCodePrevBak) &&
                Objects.equals(orgType, that.orgType) &&
                Objects.equals(executiveLevel, that.executiveLevel) &&
                Objects.equals(orgAddress, that.orgAddress) &&
                Objects.equals(dutyDesc, that.dutyDesc) &&
                Objects.equals(businessDesc, that.businessDesc) &&
                Objects.equals(dutyUser, that.dutyUser) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(postNumber, that.postNumber) &&
                Objects.equals(email, that.email) &&
                Objects.equals(website, that.website) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(sort, that.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orgPid, orgCode, orgName, sourceCodePrev, sourceCodePrevBak, orgType, executiveLevel, orgAddress, dutyDesc, businessDesc, dutyUser, telephone, fax, postNumber, email, website, createUser, createDate, sort);
    }
}
