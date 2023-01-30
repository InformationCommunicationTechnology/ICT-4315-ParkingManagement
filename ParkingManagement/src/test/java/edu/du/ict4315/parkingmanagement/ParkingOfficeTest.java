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
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author anujpatait
 *
 */
class ParkingOfficeTest {

      private Customer customer = null;
      private Address address = null;
      private ParkingLot parkingLot = null;
      private ParkingOffice parkingOffice = null;

      /**
       * This is the setup method we initialize the CustomerInfo, AddressInfo, and ParkingLot object.
       * @throws Exception
       */
      @BeforeEach
      void setUp() throws Exception {

            address = new Address();
            address.setStreet1("525 W Burgundy St");
            address.setStreet2("622");
            address.setCity("Littletone");
            address.setState("CO");
            address.setZip("80134");

            customer = new Customer();
            customer.setFirstName("Anuj");
            customer.setLastName("Patait");
            customer.setId("AB504392");
            customer.setPhoneNumber("303-992-8712");
            customer.setAddress(address);

            parkingLot = new ParkingLot();
            parkingLot.setAddress(address);
            parkingLot.setId("001");
            parkingLot.setLotType(ParkingLotType.TYPEA);
            parkingLot.setName("East End Lot");

            parkingOffice = new ParkingOffice();
            parkingOffice.setParkingOfficeName("DU Parking Office");
            parkingOffice.setParkingOfficeAddress(address);
            parkingOffice.register(customer);
            parkingOffice.addLot(parkingLot);


      }

      /**
       * This is the test method to validate customer registration process.
       * <b>Result:</b>&nbsp; Pass when new customer is added to the customer map.
       *
       * Test method for {@link ParkingOffice#register(Customer)}.
       */
      @Test
      void testRegister() {
            parkingOffice.register(customer);
            assertEquals(customer.getId(), parkingOffice.getCustomer(customer.getId()).getId());
      }

      /**
       * This method validate the customer removal process.
       * <b>Result:</b>&nbsp; Pass when we will get the same customer in output whose id we have provided in input.
       *
       * Test method for {@link ParkingOffice#removeCustomer(Customer)}.
       */
      @Test
      void testRemoveCustomer() {
            Customer removed = parkingOffice.removeCustomer(customer);
            assertEquals(customer.getId(), removed.getId());
      }

      /**
       * This is the test method to validate customer retrieval process.
       * <b>Result:</b>&nbsp; Pass when We get the same customer object we we have requested.
       *
       * Test method for {@link ParkingOffice#getCustomer(java.lang.String)}.
       */
      @Test
      void testGetCustomer() {
            Customer get = parkingOffice.getCustomer(customer.getId());
            assertEquals(customer.getId(), get.getId());
      }

      /**
       * This is the test method to validate lot addition method.
       * <b>Result:</b>&nbsp; Pass when given lot is added to the parking lot collection.
       *
       * Test method for {@link ParkingOffice#addLot(ParkingLot)}.
       */
      @Test
      void testAddLot() {
            parkingOffice.addLot(parkingLot);
            assertEquals(parkingLot.getId(), parkingOffice.getParkingLot(parkingLot.getId()).getId());
      }

      /**
       *This method validate the lot removal process.
       * <b>Result:</b>&nbsp; Pass when we will get the same lot in output whose id we have provided in input.
       *
       * Test method for {@link edu.du.ict4305.week10.ParkingOffice#removeLot(ParkingLot)}.
       */
      @Test
      void testRemoveLot() {

            ParkingLot removed = parkingOffice.removeLot(parkingLot);
            assertEquals(parkingLot.getId(), removed.getId());

      }

      /**
       * This is the test method to validate lot retrieval process.
       * <b>Result:</b>&nbsp; Pass when We get the same lot object we we have requested.
       *
       * Test method for {@link ParkingOffice#getParkingLot(java.lang.String)}.
       */
      @Test
      void testGetParkingLot() {

            ParkingLot get = parkingOffice.getParkingLot(parkingLot.getId());
            assertEquals(parkingLot.getId(), get.getId());
      }

      /**
       * This test case will validate the unhappy path where name is empty.
       *
       * <b>Result:</b>&nbsp; Pass when validateParkingOfficeName() method will return False.
       *
       * Test method for {@link ParkingOffice#validateParkingOfficeName()}.
       */
      @Test
      void testValidateEmptyParkingOfficeName() {

            parkingOffice = new ParkingOffice();
            parkingOffice.setParkingOfficeName("");
            assertFalse(parkingOffice.validateParkingOfficeName());

      }

      /**
       * This test case will validate the unhappy path where name is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateParkingOfficeName() method will return False.
       *
       * Test method for {@link ParkingOffice#validateParkingOfficeName()}.
       */
      @Test
      void testValidateNullParkingOfficeName() {

            parkingOffice = new ParkingOffice();
            parkingOffice.setParkingOfficeName(null);
            assertFalse(parkingOffice.validateParkingOfficeName());

      }

}