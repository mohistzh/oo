package com.github.mohistzh.oo.parking.spot;


import com.github.mohistzh.oo.parking.pojo.constant.ParkingSpotType;
import com.github.mohistzh.oo.parking.spot.internal.ParkingSpot;

/**
 * Motorcycle extension
 * @Author Jonathan
 * @Date 2020/5/8
 **/
public class MotorcycleSpot extends ParkingSpot {
    public MotorcycleSpot() {
        super(ParkingSpotType.MOTORCYCLE);
    }
}
