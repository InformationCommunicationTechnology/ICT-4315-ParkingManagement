package edu.du.ict4315.parkingmanagement.charges.decorator; /**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */

import edu.du.ict4315.parkingmanagement.Money;
import edu.du.ict4315.parkingmanagement.ParkingLot;
import edu.du.ict4315.parkingmanagement.ParkingPermit;
import edu.du.ict4315.parkingmanagement.Vehicle;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 2/9/23
 * @author lutherchikumba
 *
 */
public class FlatRateCalculatorTest {
      FlatRateCalculator flatRateCalculator;

      public FlatRateCalculatorTest() {
            double amount = 40;
            ParkingChargeCalculator parkingChargeCalculator = new ParkingChargeCalculator() {
                  @Override
                  public Money getParkingCharge(Calendar entryTime, Calendar exitTime, ParkingLot parkingLot, ParkingPermit parkingPermit) {
                        return new Money(amount,"$");
                  }
            };
            this.flatRateCalculator = new FlatRateCalculator(parkingChargeCalculator,new Money(40.0,"$"));

      }

      @Test
      public void getParkingCharge() {
            double amount = 40;
            assertEquals(new Money(amount,"$").getAmount(),flatRateCalculator.getParkingCharge(Calendar.getInstance(),Calendar.getInstance(),new ParkingLot(),new ParkingPermit( "id", new Vehicle(), Calendar.getInstance(), Calendar.getInstance())).getAmount());
      }
}