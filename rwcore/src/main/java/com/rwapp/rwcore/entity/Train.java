package com.rwapp.rwcore.entity;

import com.rwapp.rwcore.database_management.Entity;

import java.time.LocalTime;

public class Train extends Entity {
    private String number;
    private LocalTime departureTime;
}
