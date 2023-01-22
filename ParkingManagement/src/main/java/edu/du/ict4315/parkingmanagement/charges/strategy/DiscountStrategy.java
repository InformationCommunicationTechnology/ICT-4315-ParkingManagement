/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.charges.strategy;

import com.sun.jdi.CharType;
import edu.du.ict4315.parkingmanagement.VehicleType;

import java.time.LocalDate;

/**
 *
 * @Date: 1/19/23
 * @author lutherchikumba
 *
 */
public interface DiscountStrategy {
      String  getStrategyName();
      Double getDiscount(VehicleType vehicleType, LocalDate Time);
}
