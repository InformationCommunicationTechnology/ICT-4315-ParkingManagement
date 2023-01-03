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
 * This is the JUnit test class for PermitManager.java class. In this class we will
 * write all the test cases related to Permit Manager validation.
 *
 * <b>ModifiedOn:</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 03/07/2020
 * @author anujpatait
 *
 */
class PermitManagerTest {

      private Vehicle vehicle = null;
      private PermitManager manager = null;
      private Customer customer = null;

      /**
       * This is the setup method we initialize the check object.
       * @throws Exception
       */
      @BeforeEach
      void setUp() throws Exception {

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

            customer = new Customer(id,firstName,lastName,address,phoneNumber);

            vehicle = new Vehicle();
            vehicle.setLicensePlate("JQL-311");
            vehicle.setOwner(customer);
            vehicle.setType(VehicleType.ELECTRIC);

            manager = new PermitManager();
      }

      /**
       * This method will validate that the register method will generate the permit for the correct
       * vehicle.
       * Test method for {@link PermitManager#register(Vehicle)}.
       */
      @Test
      void testRegister() {

            ParkingPermit permit = manager.register(vehicle);

            assertEquals(vehicle.getLicensePlate(), permit.getVehicle().getLicensePlate());

      }

      /**
       * This method will validate that the expiration year is one year after current date.
       *
       * Test method for {@link PermitManager#register(Vehicle)}.
       */
      @Test
      void testExpirationDate() {
            ParkingPermit permit = manager.register(vehicle);

            Calendar nextyear = Calendar.getInstance();
            nextyear.add(Calendar.YEAR, 1);

            assertEquals(nextyear.getWeekYear(), permit.getExpirationDate().getWeekYear());
      }


      /**
       * This method will validate that the register method will generate the permit for the correct
       * vehicle.
       * Test method for {@link PermitManager#getPermit(String)}.
       */
      @Test
      void testGetPermit() {

            ParkingPermit permit = manager.register(vehicle);

            assertEquals(permit.getId(), manager.getPermit(vehicle.getLicensePlate()).getId());

      }

      /**
       * This method will validate that the register method will add entry to permits map.
       * Test method for {@link PermitManager#getPermits()}.
       */
      @Test
      void testGetPermits() {

            manager.register(vehicle);

            assertEquals(1, manager.getPermits().keySet().size());

      }
}