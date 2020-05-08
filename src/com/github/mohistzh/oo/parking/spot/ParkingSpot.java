package com.github.mohistzh.oo.parking.spot;

import com.github.mohistzh.oo.parking.pojo.constant.ParkingSpotType;
import com.github.mohistzh.oo.parking.vehicle.Vehicle;

/**
 * An abstract class represents parking spot features.
 * @Author Jonathan
 * @Date 2020/5/8
 **/
public abstract class ParkingSpot {
    /**
     * id of spot
     */
    private String number;
    /**
     * is available?
     */
    private boolean free;
    /**
     * what kind of vehicle in the spot
     */
    private Vehicle vehicle;
    /**
     * spot type
     */
    private ParkingSpotType spotType;

    public ParkingSpot(ParkingSpotType spotType) {
        this.spotType = spotType;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        free = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        free = true;
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(ParkingSpotType spotType) {
        this.spotType = spotType;
    }
}
