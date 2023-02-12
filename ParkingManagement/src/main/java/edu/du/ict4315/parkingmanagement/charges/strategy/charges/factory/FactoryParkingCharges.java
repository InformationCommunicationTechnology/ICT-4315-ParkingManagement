/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.charges.strategy.charges.factory;

import edu.du.ict4315.parkingmanagement.VehicleType;
import edu.du.ict4315.parkingmanagement.charges.strategy.ParkingChargeStrategyFactory;
import edu.du.ict4315.parkingmanagement.charges.strategy.charges.factory.ParkingChargeStrategy;
import edu.du.ict4315.parkingmanagement.charges.strategy.charges.factory.discount.CompactWeekendDiscount;
import edu.du.ict4315.parkingmanagement.charges.strategy.charges.factory.discount.LaborDayDiscount;
import edu.du.ict4315.parkingmanagement.charges.strategy.charges.factory.discount.SUVMondayDiscount;

import java.time.LocalDate;

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
