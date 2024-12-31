package com.entity;

import java.io.Serializable;

public class MobileBean implements Serializable {
    private long mobNi;

    public MobileBean() {

    }

    public long getMobNi() {
        return mobNi;
    }

    public void setMobNi(long mobNi) {
        this.mobNi = mobNi;
    }
}
