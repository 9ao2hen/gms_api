package com.infcn.gms_api.module.hn_api.dao;

import com.infcn.gms_api.module.hn_api.entity.GDepartmentDo;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface DepartmentDao extends CrudRepository<GDepartmentDo, Id> {

    GDepartmentDo getByOrgCode(String orgCode);

}
