package com.houjun.testweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by houjun on 2017/5/3.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int  countyrCode;
    private int  cittId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountyrCode() {
        return countyrCode;
    }

    public void setCountyrCode(int countyrCode) {
        this.countyrCode = countyrCode;
    }

    public int getCittId() {
        return cittId;
    }

    public void setCittId(int cittId) {
        this.cittId = cittId;
    }
}
