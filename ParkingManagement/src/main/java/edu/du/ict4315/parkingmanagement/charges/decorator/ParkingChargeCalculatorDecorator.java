/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.charges.decorator;

import edu.du.ict4315.parkingmanagement.Money;
import edu.du.ict4315.parkingmanagement.ParkingLot;
import edu.du.ict4315.parkingmanagement.ParkingPermit;

import java.util.Calendar;

/**
 *
 * @Date: 2/9/23
 * @author lutherchikumba
 *
 */
public abstract class ParkingChargeCalculatorDecorator extends ParkingChargeCalculator{

      public ParkingChargeCalculatorDecorator() {

      }
      public  abstract Money getParkingCharge(Calendar entryTime, Calendar exitTime, ParkingLot parkingLot, ParkingPermit parkingPermit);

}
