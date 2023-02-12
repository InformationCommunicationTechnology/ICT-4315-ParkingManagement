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
public class CompactCarDiscountDecorator extends ParkingChargeCalculatorDecorator{
      ParkingChargeCalculator parkingChargeCalculator;
      private final double compactCarDiscountPercentage;
      Money money;

      public CompactCarDiscountDecorator(ParkingChargeCalculator parkingChargeCalculator, double compactCarDiscountPercentage, Money money) {
            this.parkingChargeCalculator = parkingChargeCalculator;
            this.compactCarDiscountPercentage = compactCarDiscountPercentage;
            this.money = money;
      }

      @Override
      public Money getParkingCharge(Calendar entryTime, Calendar exitTime, ParkingLot parkingLot, ParkingPermit parkingPermit) {
            TransactionManager transactionManager = new TransactionManager();
            if (parkingPermit.validateId()){
                  money = parkingChargeCalculator.getParkingCharge(entryTime, exitTime, parkingLot,parkingPermit);
                  double discount_rate = money.getAmount() -(( compactCarDiscountPercentage/100) * money.getAmount());
                  money.setCurrency("$");
                  money.setAmount(discount_rate);
                  transactionManager.park(entryTime,parkingPermit,parkingLot);
                  return money;
            }else {
                  throw new IllegalArgumentException("Your permit is not valid");
            }

      }
}
