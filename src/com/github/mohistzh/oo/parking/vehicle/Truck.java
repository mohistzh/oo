package com.github.mohistzh.oo.parking.vehicle;

import com.github.mohistzh.oo.parking.pojo.constant.VehicleType;
import com.github.mohistzh.oo.parking.vehicle.internal.Vehicle;

/**
 * @Author Jonathan
 * @Date 2020/5/8
 **/
public class Truck extends Vehicle {
    public Truck(VehicleType vehicleType) {
        super(VehicleType.TRUCK);
    }
}
