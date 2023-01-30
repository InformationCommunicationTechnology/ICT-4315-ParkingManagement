/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.factory.strategy;

import edu.du.ict4315.parkingmanagement.Money;
import edu.du.ict4315.parkingmanagement.VehicleType;
import edu.du.ict4315.parkingmanagement.factory.strategy.charges.ParkingChargeStrategy;

import java.time.LocalDate;

/**
 *
 * @Date: 1/24/23
 * @author lutherchikumba
 *
 */
public interface ParkingChargeStrategyFactory {

      public default ParkingChargeStrategy parkingChargeStrategy(String strategyName, Money discountRateStrategy){
            return new ParkingChargeStrategy() {
                  @Override
                  public String getStrategy() {
                        return strategyName;
                  }

                  @Override
                  public Money getDiscountRate() {
                        return discountRateStrategy;
                  }
            };

      }
      public ParkingChargeStrategy makeStrategy(String strategyName, double discountStrategy);

}
