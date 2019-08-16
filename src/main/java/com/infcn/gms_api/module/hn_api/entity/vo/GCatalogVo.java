package com.infcn.gms_api.module.hn_api.entity.vo;

import lombok.Data;

@Data
public class GCatalogVo {

  private String id;
  private String catalogName;
  private String metadataId;
  private String description;
  private String createUser;
  private java.util.Date createDate;
  private String catalogScriptInfo;
  private long releaseStatus;

}
