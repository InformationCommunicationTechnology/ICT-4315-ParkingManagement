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
 *  <b>Description:</b><br>
 * This enumeration maintains the information about different type
 * vehicles. This enumeration also stores the discount associated with each
 * vehicle.
 *
 * <b>ModifiedOn</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 02/14/2020
 *
 * @author anujpatait
 *
 */
public enum VehicleType {

      COMPACT(20),
      SUV(0),
      ELECTRIC(20),
      MOTERCYCLE(50),
      BIKE(80);

      private int discount;

      /**
       * This constructor initialize the discount percentage of each type of vehicle.
       * @param discount
       */
      VehicleType(int discount) {
            this.discount = discount;
      }

      /**
       *  This method return the discount percentage of each type of vehicle.
       * @return
       */
      public double getDiscount() {
            return discount;
      }

}


