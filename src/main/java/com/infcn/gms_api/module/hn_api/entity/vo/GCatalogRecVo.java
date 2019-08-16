package com.infcn.gms_api.module.hn_api.entity.vo;

import lombok.Data;

import java.util.List;

@Data
public class GCatalogRecVo {

  private int state;
  private String catalogId;
  private String catalogName;
  private String catalogCode;
  private String source;
  private String deptId;
  private Long lastUpdate;
  private int shareType;
  private int openType;
  private String provider;
  private String catalogClassify;
  private String description;
  private String baseClasssify;
  private String themeClassify;
  private String deptClassify;
  private String localClassify;
  private List<GInformationitemVo> catalogItemList;

}
