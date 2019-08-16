package com.infcn.gms_api.common.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult implements Serializable {


    private static final long serialVersionUID = 2149518970113308041L;

    private int code;
    private String msg;
    private Object data;
}
