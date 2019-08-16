package com.infcn.gms_api.module.hn_api.service;

import cn.hutool.core.util.ObjectUtil;
import com.infcn.gms_api.common.constant.Constant;
import com.infcn.gms_api.module.hn_api.dao.CatalogRecDao;
import com.infcn.gms_api.module.hn_api.dao.DepartmentDao;
import com.infcn.gms_api.module.hn_api.dao.ExecutorDao;
import com.infcn.gms_api.module.hn_api.entity.GCatalogRecDo;
import com.infcn.gms_api.module.hn_api.entity.GCatalogscriptInfoDo;
import com.infcn.gms_api.module.hn_api.entity.GDepartmentDo;
import com.infcn.gms_api.module.hn_api.entity.vo.GCatalogRecVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CatalogScriptInfoService {



    @Autowired
    ExecutorDao<GCatalogscriptInfoDo> scriptInfoExecutorDao;



    public GCatalogscriptInfoDo getCatalogScriptInfoByCode(String code, int classifyType) {
        Map<String, Object> params = new HashMap<>();
        String hql = "from GCatalogscriptInfoDo where catCode = :catCode";
        switch (classifyType){
            case Constant.CATA_CLASSIFY_TYPE_DEPT:
                hql += " and pId in ('1510800529440','454f5ef9cad14367a4aaccb5cece4b97' )";
            case Constant.CATA_CLASSIFY_TYPE_BASE:
                hql += " and pId ='1510800242424' ";
            case Constant.CATA_CLASSIFY_TYPE_THEME:
                hql += " and pId ='1510800344014' ";
        }
        params.put("catCode",Integer.valueOf(code));
        GCatalogscriptInfoDo infoDo = scriptInfoExecutorDao.getOne(hql, params);
        if (ObjectUtil.isEmpty(infoDo) && classifyType==Constant.CATA_CLASSIFY_TYPE_THEME){
            infoDo = new GCatalogscriptInfoDo();
            infoDo.setId("1510800344014");
        }
        return infoDo;
    }





}
