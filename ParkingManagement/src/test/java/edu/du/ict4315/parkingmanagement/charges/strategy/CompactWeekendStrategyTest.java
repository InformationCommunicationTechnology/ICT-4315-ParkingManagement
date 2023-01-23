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
public class CompactWeekendStrategyTest {
      private CompactWeekendStrategy compactWeekendStrategy;

      public CompactWeekendStrategyTest() {
            this.compactWeekendStrategy = new CompactWeekendStrategy(LocalDate.of(2023, 1, 21), VehicleType.COMPACT, "compactWeekendStrategy", 0.50);
      }

      @Test
      public void checkDate() {
            assertTrue(compactWeekendStrategy.checkDate());
      }

      @Test
      public void checkCarType() {
            assertTrue(compactWeekendStrategy.checkCarType());
      }

      @Test
      public void getStrategyName() {
            assertEquals("compactWeekendStrategy", compactWeekendStrategy.getStrategyName());
      }

      @Test
      public void getDiscount() {
            assertEquals(0.50, compactWeekendStrategy.getDiscount(VehicleType.COMPACT, LocalDate.of(2023, 1, 21)));
      }
}