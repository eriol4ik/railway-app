package com.rwapp.rwcore.entity;

import com.rwapp.rwcore.database_management.Entity;

public class TrainUnitRoute extends Entity {
    private Train train;
    private Station station;
    private UnitRoute unitRoute;
    private int duration;
    private int stopTime;

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public UnitRoute getUnitRoute() {
        return unitRoute;
    }

    public void setUnitRoute(UnitRoute unitRoute) {
        this.unitRoute = unitRoute;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getStopTime() {
        return stopTime;
    }

    public void setStopTime(int stopTime) {
        this.stopTime = stopTime;
    }
}
