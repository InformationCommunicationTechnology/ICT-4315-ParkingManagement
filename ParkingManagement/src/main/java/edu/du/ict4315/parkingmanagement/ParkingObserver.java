/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;

/**
 *
 * @Date: 2/6/23
 * @author lutherchikumba
 *
 */
public class ParkingObserver implements Parking{
      private HashMap<String, ParkingLot> parkingLots;
      ParkingOffice parkingOffice;
      TransactionManager transactionManager;
      private String parkingLotKey;

      public ParkingObserver(String parkingLotKey) {
            this.parkingLots = new HashMap<String, ParkingLot>();
            this.parkingLotKey = parkingLotKey;
      }

      @Override
      public void registerParking(ParkingLot parkingLot) {
            parkingLots.put(parkingLotKey,parkingLot);
      }

      @Override
      public void removeParking(String parkingLotKey) {
            parkingLots.remove(parkingLotKey);

      }

      @Override
      public void notifyParking() {
            parkingLots.forEach((parkingLotKey,parkingLot) ->{
                  ParkingEvent parkingEvent = new ParkingEvent();
                  parkingEvent.update(parkingLot,transactionManager);
            });
      }
}
