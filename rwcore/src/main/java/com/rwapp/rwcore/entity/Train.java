package com.rwapp.rwcore.entity;

import com.rwapp.rwcore.dbmanagement.Entity;

import java.time.LocalTime;

public class Train extends Entity {
    private String number;
    private LocalTime departureTime;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
}
