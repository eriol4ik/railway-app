package com.rwapp.rwcore.entity;

import com.rwapp.rwcore.dbmanagement.Entity;

public class Station extends Entity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
