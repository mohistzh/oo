package com.github.mohistzh.oo.parking.vehicle;

import com.github.mohistzh.oo.parking.pojo.constant.VehicleType;
import com.github.mohistzh.oo.parking.vehicle.internal.Vehicle;

/**
 * @Author Jonathan
 * @Date 2020/5/8
 **/
public class Car extends Vehicle {
    public Car(VehicleType vehicleType) {
        super(VehicleType.CAR);
    }
}
