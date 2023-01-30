/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.factory.strategy.charges;

import edu.du.ict4315.parkingmanagement.Money;
import edu.du.ict4315.parkingmanagement.VehicleType;

import java.time.LocalDate;

/**
 *
 * @Date: 1/19/23
 * @author lutherchikumba
 *
 */
public interface ParkingChargeStrategy {
      String  getStrategy();
      Money getDiscountRate();
}
