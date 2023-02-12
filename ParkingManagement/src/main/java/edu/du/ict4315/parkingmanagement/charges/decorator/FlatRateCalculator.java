/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.charges.decorator;

import edu.du.ict4315.parkingmanagement.*;

import java.util.Calendar;

/**
 *
 * @Date: 2/9/23
 * @author lutherchikumba
 *
 */
public class FlatRateCalculator extends ParkingChargeCalculator {
      private ParkingLotType lotType;
      private Money money;
      ParkingChargeCalculator parkingChargeCalculator;
      public FlatRateCalculator(ParkingChargeCalculator parkingChargeCalculator, Money money) {
            this.money = money;
            this.parkingChargeCalculator = parkingChargeCalculator;
      }

      @Override
      public Money getParkingCharge(Calendar entryTime, Calendar exitTime, ParkingLot parkingLot, ParkingPermit parkingPermit) {
            TransactionManager transactionManager = new TransactionManager();
            if (parkingPermit.validateId()){
                  money = parkingChargeCalculator.getParkingCharge(entryTime, exitTime, parkingLot,parkingPermit);
                  double base_rate = money.getAmount();
                  money.setCurrency("$");
                  money.setAmount(base_rate);
                  transactionManager.park(entryTime,parkingPermit,parkingLot);
                  return money;
            }else {
                  throw new IllegalArgumentException("Your permit is not valid");
            }

      }
}
