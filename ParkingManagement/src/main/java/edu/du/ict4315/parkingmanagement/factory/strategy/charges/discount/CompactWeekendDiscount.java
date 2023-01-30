/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.factory.strategy.charges.discount;

import edu.du.ict4315.parkingmanagement.Money;
import edu.du.ict4315.parkingmanagement.ParkingLotType;
import edu.du.ict4315.parkingmanagement.VehicleType;
import edu.du.ict4315.parkingmanagement.factory.strategy.charges.ParkingChargeStrategy;

import java.time.LocalDate;

/**
 * @author lutherchikumba
 * @Date: 1/20/23
 */
public class CompactWeekendDiscount implements ParkingChargeStrategy {
      private final LocalDate date;
      private final VehicleType vehicleType;
      private final String compactWeekendStrategy;
      private final double strategyPercentage;
      private ParkingLotType lotType;

      public CompactWeekendDiscount(LocalDate date, VehicleType vehicleType, String compactWeekendStrategy, double strategyPercentage) {
            this.date = date;
            this.vehicleType = vehicleType;
            this.compactWeekendStrategy = compactWeekendStrategy;
            this.strategyPercentage = strategyPercentage;
      }

      public boolean checkDate() {
            if ("SUNDAY".equals(date.getDayOfWeek().toString()) || "SATURDAY".equals(date.getDayOfWeek().toString())) {
                  return true;
            } else {
                  return false;
            }
      }

      public boolean checkCarType() {
            if (VehicleType.COMPACT == vehicleType) {
                  return true;
            } else {
                  return false;
            }

      }

      @Override
      public String getStrategy() {
            return compactWeekendStrategy;
      }

      @SuppressWarnings("DuplicatedCode")
      @Override
      public Money getDiscountRate() {
            Money money = new Money();
            money.setCurrency("$");
            double base_rate = lotType.getRate();
            if (checkDate()) {
                  double discountRate = base_rate -(( strategyPercentage/100) * base_rate);
                  money.setAmount(discountRate);
                  return money;
            } else {
                  throw new IllegalArgumentException("Today is not labor day");
            }
      }
}
