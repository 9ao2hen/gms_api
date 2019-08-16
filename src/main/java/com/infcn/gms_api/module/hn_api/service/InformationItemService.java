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
import com.infcn.gms_api.module.hn_api.entity.GInformationitemDo;
import com.infcn.gms_api.module.hn_api.entity.vo.GCatalogRecVo;
import com.infcn.gms_api.module.hn_api.entity.vo.GInformationitemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InformationItemService {


    @Autowired
    InformationItemDao informationItemDao;


    public List<GInformationitemVo> getInfoItemByCatalogRecId(String catalogRecId){
        List<GInformationitemVo> itemVoList = new ArrayList<>();
        List<GInformationitemDo> list = informationItemDao.getByCatalogRecId(catalogRecId);
        for (GInformationitemDo itemDo : list) {
            GInformationitemVo vo = new GInformationitemVo();
            vo.setId(itemDo.getId());
            vo.setCatalogrec_code(itemDo.getCatalogRecId());
            vo.setItem_name(itemDo.getItemName());
            vo.setItem_explain(itemDo.getItemNameEn());
            vo.setData_type(itemDo.getDataType());
            vo.setRange(itemDo.getFieldLength());
            vo.setRemarks(itemDo.getRemarks());
            vo.setCreate_time(itemDo.getCreateTime().getTime());
            vo.setCreate_user(itemDo.getCreateUser());
            itemVoList.add(vo);
        }
        return itemVoList;
    }


}
