package com.rwapp.rwcore.entity;

import com.rwapp.rwcore.dbmanagement.Entity;

public class UnitRoute extends Entity {
    private Station start;
    private Station end;
    private int distance;

    public Station getStart() {
        return start;
    }

    public void setStart(Station start) {
        this.start = start;
    }

    public Station getEnd() {
        return end;
    }

    public void setEnd(Station end) {
        this.end = end;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
