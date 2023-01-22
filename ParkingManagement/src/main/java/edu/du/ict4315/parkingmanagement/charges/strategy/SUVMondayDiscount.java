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
public class SUVMondayDiscount implements DiscountStrategy {
      private LocalDate date;
      private VehicleType vehicleType;
      private String SUVMondayDiscount;
      private double strategyPercentage;

      public SUVMondayDiscount(LocalDate date, VehicleType vehicleType, String SUVMondayDiscount, double strategyPercentage) {
            this.date = date;
            this.vehicleType = vehicleType;
            this.SUVMondayDiscount = SUVMondayDiscount;
            this.strategyPercentage = strategyPercentage;

      }

      public boolean checkDate() {
            if ("MONDAY".equals(date.getDayOfWeek().toString())) {
                  return true;
            } else {
                  return false;
            }
      }

      public boolean checkCarType() {
            if (VehicleType.SUV == vehicleType) {
                  return true;
            } else {
                  return false;
            }

      }

      @Override
      public String getStrategyName() {
            return SUVMondayDiscount;
      }

      @Override
      public Double getDiscount(VehicleType vehicleType, LocalDate Time) {
            if (checkCarType() && ("MONDAY".equals(Time.getDayOfWeek().toString()))) {
                  return strategyPercentage;
            } else {
                  throw new IllegalArgumentException("Not qualified for the discount");
            }
      }
}
