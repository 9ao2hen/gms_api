package com.infcn.gms_api.module.hn_api.entity.vo;

import lombok.Data;

@Data
public class GInformationitemVo {

  private String id;
  private String catalogrec_code;
  private String item_name;
  private String item_explain;
  private String data_type;
  private String range;
  private String remarks;
  private Long create_time;
  private String create_user;


}
