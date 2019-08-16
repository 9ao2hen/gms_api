package com.infcn.gms_api.module.hn_api.controller;

import com.infcn.gms_api.common.util.JsonResult;
import com.infcn.gms_api.module.hn_api.entity.vo.GCatalogRecVo;
import com.infcn.gms_api.module.hn_api.service.CatalogRecService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("hn")
public class HnController {

    @Autowired
    CatalogRecService catalogRecService;

    @RequestMapping("getAllCatalog")
    public JsonResult getAllCatalog(String catalogInfo_id, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date beginDate){
        System.out.println(beginDate);
        JsonResult result = new JsonResult();
        List<GCatalogRecVo> list = catalogRecService.getAllCatalogList(catalogInfo_id, beginDate);
        result.setCode(1);
        result.setMsg("成功");
        result.setData(list);
        return result;
    }

}
