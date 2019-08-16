package com.infcn.gms_api;

import com.alibaba.fastjson.JSON;
import com.infcn.gms_api.module.hn_api.dao.CatalogDao;
import com.infcn.gms_api.module.hn_api.dao.CatalogScriptInfoDao;
import com.infcn.gms_api.module.hn_api.entity.GCatalogDo;
import com.infcn.gms_api.module.hn_api.entity.GCatalogscriptInfoDo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class GmsApiApplicationTests {

    @Autowired
    CatalogDao catalogDao;
    @Autowired
    CatalogScriptInfoDao catalogScriptInfoDao;

    @Test
    public void contextLoads() {
    }

//    @Test
    public void initData(){
        Iterable<GCatalogDo> iterable = catalogDao.findAll();
        catalogScriptInfoDao.deleteAll();
        for (GCatalogDo catalogDo : iterable) {
            String scriptInfo = catalogDo.getCatalogScriptInfo();
            List<GCatalogscriptInfoDo> list = JSON.parseArray(scriptInfo.replaceAll("'",""), GCatalogscriptInfoDo.class);
            for (GCatalogscriptInfoDo infoDo : list) {
                System.out.println(infoDo.getName());
                catalogScriptInfoDao.save(infoDo);
            }
        }
    }

}
