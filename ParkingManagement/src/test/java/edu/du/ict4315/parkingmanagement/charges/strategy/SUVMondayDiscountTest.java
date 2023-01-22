package edu.du.ict4315.parkingmanagement.charges.strategy; /**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */

import edu.du.ict4315.parkingmanagement.VehicleType;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lutherchikumba
 * @Date: 1/22/23
 */
public class SUVMondayDiscountTest {
      private SUVMondayDiscount suvMondayDiscount;
      private LocalDate time;

      public SUVMondayDiscountTest() {
            this.suvMondayDiscount = new SUVMondayDiscount(LocalDate.of(2023, 1, 23), VehicleType.SUV, "suvMondayDiscount", 0.40);
            this.time = time;
      }

      @Test
      public void checkDate() {
            assertTrue(suvMondayDiscount.checkDate());
      }

      @Test
      public void checkCarType() {
            assertTrue(suvMondayDiscount.checkCarType());
      }

      @Test
      public void getStrategyName() {
            assertEquals("suvMondayDiscount", suvMondayDiscount.getStrategyName());
      }

      @Test
      public void getDiscount() {
            assertEquals(0.40, suvMondayDiscount.getDiscount(VehicleType.SUV, LocalDate.of(2023, 1, 23)));
      }
}