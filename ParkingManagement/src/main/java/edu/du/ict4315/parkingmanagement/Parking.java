/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement;

/**
 *
 * @Date: 2/6/23
 * @author lutherchikumba
 *
 */
public interface Parking {
      public void registerParking(ParkingLot parkingLot);
      public  void removeParking(String parkingLotKey);
      public void  notifyParking();
}
