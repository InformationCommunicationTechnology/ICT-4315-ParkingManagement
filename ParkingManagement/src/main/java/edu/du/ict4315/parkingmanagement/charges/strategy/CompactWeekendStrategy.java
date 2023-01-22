/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.charges.strategy;

import edu.du.ict4315.parkingmanagement.VehicleType;

import java.time.LocalDate;

/**
 * @author lutherchikumba
 * @Date: 1/20/23
 */
public class CompactWeekendStrategy implements DiscountStrategy {
      private LocalDate date;
      private VehicleType vehicleType;
      private String compactWeekendStrategy;
      private double strategyPercentage;

      public CompactWeekendStrategy(LocalDate date, VehicleType vehicleType, String compactWeekendStrategy, double strategyPercentage) {
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
      public String getStrategyName() {
            return compactWeekendStrategy;
      }

      @Override
      public Double getDiscount(VehicleType vehicleType, LocalDate Time) {
            if (checkCarType() && ("SUNDAY".equals(Time.getDayOfWeek().toString()) || "SATURDAY".equals(Time.getDayOfWeek().toString()))) {
                  return strategyPercentage;
            } else {
                  throw new IllegalArgumentException("Not qualified for the discount");
            }
      }
}
