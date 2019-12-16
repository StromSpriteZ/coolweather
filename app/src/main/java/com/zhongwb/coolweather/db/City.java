package com.zhongwb.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private Integer id;
    private String name;
    private Integer code;
    private Integer proviceCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(Integer proviceCode) {
        this.proviceCode = proviceCode;
    }
}
