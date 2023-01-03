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
 * This is the JUnit test class for TransactionManager.java class. In this class we will
 * write all the test cases related to Transaction Manager validation.
 *
 * <b>ModifiedOn:</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 03/08/2020
 * @author anujpatait
 *
 */
class TransactionManagerTest {

      private TransactionManager tManager =  null;
      private ParkingPermit permit = null;
      private ParkingLot lot = null;
      private Vehicle vehicle = null;
      private PermitManager manager = null;
      private Customer customer = null;
      /**
       * @throws java.lang.Exception
       */
      @BeforeEach
      void setUp() throws Exception {
            //Setting up the Customer, vehicle and Parking manager information.
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
            manager.register(vehicle);
            permit = manager.getPermit(vehicle.getLicensePlate());
            tManager =  new TransactionManager();

            //Set up parking Lot.
            lot = new ParkingLot();
            lot.setAddress(address);
            lot.setId("Lot 1");
            lot.setLotType(ParkingLotType.TYPEA);
            lot.setName("East End Lot");;
      }

      /**
       * This method validates that the transaction is successfully created for the same permit.
       * Test method for {@link TransactionManager#park(java.util.Calendar, ParkingPermit, ParkingLot)}.
       */
      @Test
      void testPark() {
            ParkingTransaction transaction = tManager.park(Calendar.getInstance(), permit, lot);

            assertEquals( permit.getId(), transaction.getPermit().getId());
      }

      /**
       * This method validates the rate present in transaction manager is same as it should be according to lot.
       * Test method for {@link TransactionManager#getParkingCharges(ParkingPermit)}.
       */
      @Test
      void testGetParkingChargesParkingPermit() {
            tManager.park(Calendar.getInstance(), permit, lot);

            assertEquals(lot.getDailyRate(vehicle.getType()).getAmount(), tManager.getParkingCharges(permit).getAmount());
      }

      /**
       * This method validates the rate present in transaction manager is same as it should be according to lot for multiple parkings.
       * Test method for {@link TransactionManager#getParkingCharges(ParkingPermit)}.
       */
      @Test
      void testGetParkingMultipleChargesParkingPermit() {
            tManager.park(Calendar.getInstance(), permit, lot);
            tManager.park(Calendar.getInstance(), permit, lot);

            double expectedCharges = lot.getDailyRate(vehicle.getType()).getAmount() * 2;
            assertEquals(expectedCharges, tManager.getParkingCharges(permit).getAmount());
      }

      /**
       * THis method validates that the rate in transaction manager is same as it should be for the vehicle.
       * Test method for {@link TransactionManager#getParkingCharges(java.lang.String)}.
       */
      @Test
      void testGetParkingChargesLicensePlate() {
            tManager.park(Calendar.getInstance(), permit, lot);
            assertEquals(lot.getDailyRate(vehicle.getType()).getAmount(),
                    tManager.getParkingCharges(vehicle.getLicensePlate()).getAmount());
      }

}