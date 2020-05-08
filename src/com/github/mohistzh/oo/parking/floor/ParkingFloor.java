package com.github.mohistzh.oo.parking.floor;

import com.github.mohistzh.oo.parking.spot.*;
import com.github.mohistzh.oo.parking.spot.internal.ParkingSpot;
import com.github.mohistzh.oo.parking.vehicle.internal.Vehicle;

import java.util.HashMap;

/**
 * Encapsulate a parking floor
 * @Author Jonathan
 * @Date 2020/5/8
 **/
public class ParkingFloor {
    private String floorName;
    private HashMap<String, HandicappedSpot> handicappedSpotHashMap;
    private HashMap<String, CompactSpot> compactSpotHashMap;
    private HashMap<String, LargeSpot> largeSpotHashMap;
    private HashMap<String, MotorcycleSpot> motorcycleSpotHashMap;
    private HashMap<String, ElectricSpot> electricSpotHashMap;
    private HashMap<String, CustomerInfoPortal> customerInfoPortalHashMap;
    private ParkingDisplayBoard displayBoard;

    public ParkingFloor(String name) {
        this.floorName = name;
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {

    }

    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {

    }

    public void freeSpot(ParkingSpot spot) {

    }
    private void updateDisplayBoardForCompact(ParkingSpot spot) {

    }
    private void updateDisplayBoardForHandicapped(ParkingSpot spot) {

    }


}
