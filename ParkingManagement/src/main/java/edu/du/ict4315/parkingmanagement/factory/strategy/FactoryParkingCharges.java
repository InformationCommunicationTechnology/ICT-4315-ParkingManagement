/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.factory.strategy;

import edu.du.ict4315.parkingmanagement.Money;
import edu.du.ict4315.parkingmanagement.ParkingLotType;
import edu.du.ict4315.parkingmanagement.VehicleType;
import edu.du.ict4315.parkingmanagement.factory.strategy.charges.ParkingChargeStrategy;
import edu.du.ict4315.parkingmanagement.factory.strategy.charges.discount.CompactWeekendDiscount;
import edu.du.ict4315.parkingmanagement.factory.strategy.charges.discount.LaborDayDiscount;
import edu.du.ict4315.parkingmanagement.factory.strategy.charges.discount.SUVMondayDiscount;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

/**
 * @author lutherchikumba
 * @Date: 1/24/23
 */
public class FactoryParkingCharges implements ParkingChargeStrategyFactory {

      @Override
      public ParkingChargeStrategy makeStrategy(String strategyName, double discountStrategy) {
            switch (strategyName) {
                  case "CompactWeekendDiscount":
                        return new CompactWeekendDiscount(LocalDate.now(), VehicleType.COMPACT, strategyName, discountStrategy);
                  case "LaborDayDiscount":
                        return new LaborDayDiscount(LocalDate.now(), strategyName, discountStrategy);
                  case "SUVMondayDiscount":
                        return new SUVMondayDiscount(LocalDate.now(), VehicleType.SUV, strategyName, discountStrategy);
                  default:
                        return null;
            }
      }
}
