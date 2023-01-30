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

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

/**
 * @author lutherchikumba
 * @Date: 1/22/23
 */
public class LaborDayDiscount implements ParkingChargeStrategy {
      private LocalDate date;
      private final String laborDayStrategy;
      private final double strategyPercentage;
      private ParkingLotType lotType;

      public LaborDayDiscount(LocalDate date, String laborDayStrategy, double strategyPercentage) {
            this.date = date;
            this.laborDayStrategy = laborDayStrategy;
            this.strategyPercentage = strategyPercentage;
      }

      public boolean checkDate() {
            LocalDate now = LocalDate.now();
            LocalDate firstMonday = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
            if (date.getMonth().toString().equals("SEPTEMBER") && ("MONDAY".equals(firstMonday.getDayOfWeek().toString()))) {
                  return true;
            } else {
                  throw new IllegalArgumentException("Today is not labor day");
            }
      }

      @Override
      public String getStrategy() {
            return laborDayStrategy;
      }

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
