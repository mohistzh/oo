package com.github.mohistzh.oo.parking.people;

import com.github.mohistzh.oo.parking.people.internal.Account;

/**
 * Admin is an actor which mainly responsible for parking floors, parking spots, entrance, exit panels, and parking attendants.
 * @Author Jonathan
 * @Date 2020/5/8
 **/
public class Admin extends Account {
   public boolean addParkingFloor(Object floor) { //ParkingFloor
       return false;
   }

   public boolean addParkingSpot(String floorName, Object spot) { // ParkingSpot
       return false;
   }

   public boolean addParkingDisplayBoard(String floorName, Object displayBoard) { // ParkingDisplayBoard
       return false;
   }

   public boolean addCustomerInfoPanel(String floorName, Object infoPanel) { // CustomerInfoPanel
       return false;
   }

   public boolean addEntrancePanel(Object entrancePanel) {  // EntrancePanel
       return false;
   }
   public boolean addExitPanel(Object exitPanel) { // ExitPanel
       return false;
   }

}
