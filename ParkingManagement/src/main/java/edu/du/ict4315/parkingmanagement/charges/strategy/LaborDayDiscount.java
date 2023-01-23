/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.charges.strategy;

import edu.du.ict4315.parkingmanagement.VehicleType;

import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

/**
 * @author lutherchikumba
 * @Date: 1/22/23
 */
public class LaborDayDiscount implements DiscountStrategy {
      private LocalDate date;
      private String laborDayStrategy;
      private double strategyPercentage;

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
      public String getStrategyName() {
            return laborDayStrategy;
      }

      @Override
      public Double getDiscount(VehicleType vehicleType, LocalDate Time) {
            if (checkDate()) {
                  return strategyPercentage;
            } else {
                  throw new IllegalArgumentException("Today is not labor day");
            }
      }
}
