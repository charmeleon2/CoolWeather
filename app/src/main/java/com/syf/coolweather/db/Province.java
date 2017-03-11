package com.syf.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by syf on 2017/3/11.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private String getProvinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getGetProvinceCode() {
        return getProvinceCode;
    }

    public void setGetProvinceCode(String getProvinceCode) {
        this.getProvinceCode = getProvinceCode;
    }
}
