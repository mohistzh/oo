package com.github.mohistzh.oo.parking.spot;

import com.github.mohistzh.oo.parking.pojo.constant.ParkingSpotType;
import com.github.mohistzh.oo.parking.spot.internal.ParkingSpot;

/**
 * HandicappedSpot extension
 * @Author Jonathan
 * @Date 2020/5/8
 **/
public class HandicappedSpot extends ParkingSpot {
    public HandicappedSpot() {
        super(ParkingSpotType.HANDICAPPED);
    }
}
