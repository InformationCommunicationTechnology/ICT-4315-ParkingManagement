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

import org.junit.jupiter.api.Test;

/**
 * <b>Description:</b><br/>
 * This is the JUnit test class for Vechicle.java class. In this class we will
 * write all the test cases related to Vechicle validation.
 *
 * <b>ModifiedOn:</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 03/07/2020
 * @author anujpatait
 *
 */
class VehicleTest {

      /**
       * This test case will validate the unhappy path where license plate is empty.
       *
       * <b>Result:</b>&nbsp; Pass when validateLicensePlate() method will return False.
       */
      @Test
      void testValidateEmptyLicensePlate() {
            Vehicle vehicle = new Vehicle();
            vehicle.setLicensePlate("");
            assertFalse(vehicle.validateLicensePlate());
      }

      /**
       * This test case will validate the unhappy path where license plate is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateLicensePlate() method will return False.
       */
      @Test
      void testValidateNullId() {
            Vehicle vehicle = new Vehicle();
            vehicle.setLicensePlate(null);
            assertFalse(vehicle.validateLicensePlate());
      }

      /**
       * This test case will validate the happy path where license plate is valid.
       *
       * <b>Result:</b>&nbsp; Pass when validateLicensePlate() method will return True.
       */
      @Test
      void testValidateId() {
            Vehicle vehicle = new Vehicle();
            vehicle.setLicensePlate("657-ACX");
            assertTrue(vehicle.validateLicensePlate());
      }

      /**
       * This test case will validate the unhappy path where type is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateType() method will return False.
       */
      @Test
      void testValidateNullType() {
            Vehicle vehicle = new Vehicle();
            vehicle.setType(null);
            assertFalse(vehicle.validateType());
      }

      /**
       * This test case will validate the happy path where type is valid.
       *
       * <b>Result:</b>&nbsp; Pass when validateType() method will return False.
       */
      @Test
      void testValidateType() {
            Vehicle vehicle = new Vehicle();
            vehicle.setType(VehicleType.BIKE);
            assertTrue(vehicle.validateType());
      }

      /**
       * This test case will validate the unhappy path where Owner is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateOwner() method will return False.
       */
      @Test
      void testValidateNullOwner() {
            Vehicle vehicle = new Vehicle();
            vehicle.setOwner(null);
            assertFalse(vehicle.validateOwner());
      }

      /**
       * This test case will validate the happy path where Owner is valid.
       *
       * <b>Result:</b>&nbsp; Pass when validateOwner() method will return False.
       */
      @Test
      void testValidateOwner() {
            Vehicle vehicle = new Vehicle();
            vehicle.setOwner(new Customer());
            assertTrue(vehicle.validateOwner());
      }


}