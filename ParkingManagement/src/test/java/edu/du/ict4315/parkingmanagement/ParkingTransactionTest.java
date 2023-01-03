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

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <b>Description:</b><br/>
 * This is the JUnit test class for ParkingTransaction.java class. In this class we will
 * write all the test cases related to Transaction validation.
 *
 * <b>ModifiedOn:</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 03/07/2020
 * @author anujpatait
 *
 */
class ParkingTransactionTest {

      private ParkingTransaction transaction = null;

      /**
       * @throws java.lang.Exception
       */
      @BeforeEach
      void setUp() throws Exception {

            transaction = new ParkingTransaction();
            ParkingLot parkingLot = new ParkingLot();
            parkingLot.setLotType(ParkingLotType.TYPEA);
            parkingLot.setName("Lot 1");
            parkingLot.setId("001");

            transaction.setLot(parkingLot);

            String id = "AB50439";
            String firstName = "Anuj";
            String lastName = "Patait";
            String phoneNumber = "303-992-8712";

            String street1 = "525 W Burgundy Street";
            String street2 = "Unit 622";
            String city = "Highlands Ranch";
            String state = "CO";
            String zip = "80129";
            Address address = new Address(street1,street2,city,state,zip);

            Customer customer = new Customer(id,firstName,lastName,address,phoneNumber);

            Vehicle vehicle = new Vehicle();
            vehicle.setLicensePlate("JQL-311");
            vehicle.setOwner(customer);
            vehicle.setType(VehicleType.ELECTRIC);

            PermitManager manager = new PermitManager();

            transaction.setPermit(manager.register(vehicle));

            transaction.setTransactionDate(Calendar.getInstance());
      }

      /**
       * This test case validates that the charged amount is calculated correctly.
       * Test method for {@link ParkingTransaction#getChargedAmount()}.
       */
      @Test
      void testGetChargedAmount() {

            assertEquals(16.0,transaction.getChargedAmount().getAmount() );
      }

      /**
       * This test case validate the transaction date.
       * Test method for {@link ParkingTransaction#validateTransactionDate()}.
       */
      @Test
      void testValidateTransactionDate() {
            transaction.setTransactionDate(null);
            assertFalse(transaction.validateTransactionDate());
      }

      /**
       * This test case validates the permit.
       * Test method for {@link ParkingTransaction#validatePermit()}.
       */
      @Test
      void testValidatePermit() {
            transaction.setPermit(null);
            assertFalse(transaction.validatePermit());
      }

      /**
       * This test case validates the lot.
       * Test method for {@link ParkingTransaction#validateLot()}.
       */
      @Test
      void testValidateLot() {
            transaction.setLot(null);
            assertFalse(transaction.validateLot());
      }

}