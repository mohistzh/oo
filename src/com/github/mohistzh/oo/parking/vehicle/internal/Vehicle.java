package com.github.mohistzh.oo.parking.vehicle.internal;

import com.github.mohistzh.oo.parking.pojo.ParkingTicket;
import com.github.mohistzh.oo.parking.pojo.constant.VehicleType;

/**
 * An abstract vehicle class
 * @Author Jonathan
 * @Date 2020/5/8
 **/
public abstract class Vehicle {
    private String licenseNumber;
    private final VehicleType vehicleType;
    private ParkingTicket parkingTicket;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void assignTicket(ParkingTicket ticket) {
        this.parkingTicket = ticket;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
