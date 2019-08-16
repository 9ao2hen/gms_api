package com.infcn.gms_api.module.hn_api.service;

import cn.hutool.core.util.ObjectUtil;
import com.infcn.gms_api.common.constant.Constant;
import com.infcn.gms_api.module.hn_api.dao.CatalogRecDao;
import com.infcn.gms_api.module.hn_api.dao.DepartmentDao;
import com.infcn.gms_api.module.hn_api.dao.ExecutorDao;
import com.infcn.gms_api.module.hn_api.dao.InformationItemDao;
import com.infcn.gms_api.module.hn_api.entity.GCatalogRecDo;
import com.infcn.gms_api.module.hn_api.entity.GCatalogscriptInfoDo;
import com.infcn.gms_api.module.hn_api.entity.GDepartmentDo;
import com.infcn.gms_api.module.hn_api.entity.vo.GCatalogRecVo;
import com.infcn.gms_api.module.hn_api.entity.vo.GInformationitemVo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CatalogRecService {


    @Autowired
    CatalogRecDao catalogRecDao;
    @Autowired
    DepartmentDao departmentDao;
    @Autowired
    InformationItemDao informationItemDao;

    @Autowired
    ExecutorDao<GCatalogRecDo> executorDao;

    @Autowired
    CatalogScriptInfoService catalogScriptInfoService;
    @Autowired
    InformationItemService informationItemService;


    public List<GCatalogRecVo> getAllCatalogList(String catalogInfo_id, Date beginDate){
        List<GCatalogRecVo> list = new ArrayList();
        Map params = new HashMap();
        String hql = " from GCatalogRecDo where 1=1 ";
        if (ObjectUtil.isNotEmpty(catalogInfo_id)){
            hql += " and id=:id";
            params.put("id",catalogInfo_id);
        }
        if (ObjectUtil.isNotEmpty(beginDate)){
            hql += " and createDate >= :createDate";
            params.put("createDate",beginDate);
        }
        List<GCatalogRecDo> queryList = executorDao.queryList(hql,params);
        if (ObjectUtil.isNotEmpty(queryList) && queryList.size()>0){
            for (GCatalogRecDo catalogRecDo : queryList) {
                GCatalogRecVo catalogRecVo = new GCatalogRecVo();

                catalogRecVo.setState(1);
                catalogRecVo.setCatalogId(catalogRecDo.getId());
                catalogRecVo.setCatalogName(catalogRecDo.getRestitle());
                catalogRecVo.setCatalogCode(catalogRecDo.getAllCode());
                catalogRecVo.setSource(catalogRecDo.getPath());
                catalogRecVo.setLastUpdate(catalogRecDo.getCreateDate().getTime());
                catalogRecVo.setShareType(0);
                catalogRecVo.setOpenType(0);
                catalogRecVo.setProvider(catalogRecDo.getResourceApply());
                catalogRecVo.setLocalClassify(catalogRecDo.getCataId());
                catalogRecVo.setDescription(catalogRecDo.getResourceSummary());

                String catalogCode = catalogRecDo.getAllCode();
                if (ObjectUtil.isNotEmpty(catalogCode)){

                    //部门
                    String deptCode = "000";
                    if (catalogCode.substring(6, 9) != "000"){
                        deptCode = catalogCode.substring(6, 9);
                    }else if (catalogCode.substring(9, 12) != "000"){
                        deptCode = catalogCode.substring(9, 12);
                    }else if (catalogCode.substring(12, 15) != "000"){
                        deptCode = catalogCode.substring(12, 15);
                    }

                    //部门ID
                    GDepartmentDo departmentDo = departmentDao.getByOrgCode(deptCode);
                    if (ObjectUtil.isNotEmpty(departmentDo)){
                        catalogRecVo.setDeptId(departmentDo.getId());
                    }

                    GCatalogscriptInfoDo info = null;

                    //部门分类ID
                     info = catalogScriptInfoService.getCatalogScriptInfoByCode(deptCode, Constant.CATA_CLASSIFY_TYPE_DEPT);
                    if (ObjectUtil.isNotEmpty(info)){
                        catalogRecVo.setDeptClassify(info.getId());
                    }

                    //基础分类ID
                    info = catalogScriptInfoService.getCatalogScriptInfoByCode(deptCode, Constant.CATA_CLASSIFY_TYPE_BASE);
                    if (ObjectUtil.isNotEmpty(info)){
                        catalogRecVo.setBaseClasssify(info.getId());
                    }

                    //主题分类ID
                    info = catalogScriptInfoService.getCatalogScriptInfoByCode(deptCode, Constant.CATA_CLASSIFY_TYPE_THEME);
                    if (ObjectUtil.isNotEmpty(info)){
                        catalogRecVo.setThemeClassify(info.getId());
                    }

                    List<GInformationitemVo> itemList = informationItemService.getInfoItemByCatalogRecId(catalogRecDo.getId());
                    catalogRecVo.setCatalogItemList(itemList);
                }
                list.add(catalogRecVo);
            }
        }
        return list;
    }



}
