package edu.du.ict4315.parkingmanagement; /**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 1/3/23
 * @author lutherchikumba
 *
 */
/**
 *
 */

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

/**
 * <b>Description:</b><br/>
 * This is the JUnit test class for ParkingPermit.java class. In this class we will
 * write all the test cases related to Parking Permit validation.
 *
 * <b>ModifiedOn:</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 03/07/2020
 * @author anujpatait
 *
 */
class ParkingPermitTest {

      /**
       * This test case will validate the unhappy path where id is not present.
       *
       * <b>Result:</b>&nbsp; Pass when validateId method will return False.
       */
      @Test
      void testValidateIdNotPresent() {

            ParkingPermit permit = new ParkingPermit();
            permit.setId("");

            assertFalse(permit.validateId());


      }

      /**
       * This test case will validate the unhappy path where ID is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateId method will return False.
       */
      @Test
      void testValidateNullId() {

            ParkingPermit permit = new ParkingPermit();
            permit.setId(null);

            assertFalse(permit.validateId());


      }

      /**
       * This test case will validate the happy path where ID is present.
       *
       * <b>Result:</b>&nbsp; Pass when validateId method will return True.
       */
      @Test
      void testValidateId() {

            ParkingPermit permit = new ParkingPermit();
            permit.setId("Permit001");

            assertTrue(permit.validateId());


      }

      /**
       * This test case will validate the unhappy path where Registration Date is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateRegistrationDate will return False.
       */
      @Test
      void testValidateEmptyRegistrationDate() {
            ParkingPermit permit = new ParkingPermit();
            permit.setRegistrationDate(null);

            assertFalse(permit.validateRegistrationDate());
      }

      /**
       * This test case will validate the unhappy path where Expiration Date is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateExpirationDate will return False.
       */
      @Test
      void testValidateEmptyExpirationDate() {
            ParkingPermit permit = new ParkingPermit();
            permit.setExpirationDate(null);

            assertFalse(permit.validateExpirationDate());
      }

      /**
       * This test case will validate the happy path where Registration Date is present.
       *
       * <b>Result:</b>&nbsp; Pass when validateRegistrationDate will return True.
       */
      @Test
      void testValidateRegistrationDate() {
            ParkingPermit permit = new ParkingPermit();
            permit.setRegistrationDate(Calendar.getInstance());

            assertTrue(permit.validateRegistrationDate());
      }

      /**
       * This test case will validate the happy path where Expiration Date is present.
       *
       * <b>Result:</b>&nbsp; Pass when validateExpirationDate will return True.
       */
      @Test
      void testValidateExpirationDate() {
            ParkingPermit permit = new ParkingPermit();
            permit.setExpirationDate(Calendar.getInstance());

            assertTrue(permit.validateExpirationDate());
      }
}