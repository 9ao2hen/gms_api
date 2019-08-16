package com.infcn.gms_api.module.hn_api.dao;

import com.infcn.gms_api.module.hn_api.entity.GCatalogRecDo;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;
import java.util.List;

public interface CatalogRecDao extends CrudRepository<GCatalogRecDo, Id> {

    List<GCatalogRecDo> getAllById(String id);
}
