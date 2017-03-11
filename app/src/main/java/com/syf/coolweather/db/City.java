package com.syf.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by syf on 2017/3/11.
 */

public class City extends DataSupport {
    private int id;
    private int provincdId;
    private String cityName;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvincdId() {
        return provincdId;
    }

    public void setProvincdId(int provincdId) {
        this.provincdId = provincdId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
