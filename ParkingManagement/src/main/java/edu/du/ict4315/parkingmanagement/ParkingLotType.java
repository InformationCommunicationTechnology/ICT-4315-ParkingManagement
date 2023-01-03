/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement;

/**
 *
 * @Date: 12/29/22
 * @author lutherchikumba
 *
 */

/**
 * <b>Description:</b><br>
 * This enumeration maintains the information about different type
 * parking lots. This enumeration also stores the daily rate of each parking lot.
 *
 * <b>ModifiedOn</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 02/14/2020
 *
 * @author anujpatait
 *
 */
public enum ParkingLotType {
      TYPEA(20.0),
      TYPEB(15.0),
      TYPEC(10.0);

      private double rate;

      /**
       * This constructor initialize the daily base rate of each type of parking.
       * @param rate
       */
      ParkingLotType(double rate) {
            this.rate = rate;
      }

      /**
       * This method return the daily base rate of each type of lot.
       * @return
       */
      public double getRate() {
            return rate;
      }
}


