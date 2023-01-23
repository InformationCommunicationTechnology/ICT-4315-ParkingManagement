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
public class LaborDayDiscountTest {
      private LaborDayDiscount laborDayDiscount;

      public LaborDayDiscountTest() {
            this.laborDayDiscount = new LaborDayDiscount(LocalDate.of(2023, 9, 4), "laborDayDiscount", 0.30);
      }

      @Test
      public void checkDate() {
            if (laborDayDiscount.checkDate()) {
                  assertTrue(laborDayDiscount.checkDate());
            } else {
                  assertThrows(IllegalArgumentException.class, () -> {
                        laborDayDiscount.checkDate();
                  });
            }
      }

      @Test
      public void getStrategyName() {
            assertEquals("laborDayDiscount", laborDayDiscount.getStrategyName());
      }

      @Test
      public void getDiscount() {
            assertEquals(0.30, laborDayDiscount.getDiscount(VehicleType.COMPACT, LocalDate.now()));
      }
}