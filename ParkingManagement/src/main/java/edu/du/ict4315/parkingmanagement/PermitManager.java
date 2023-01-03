/**
 * @Course: ICT 4305
 * @Project: ParkingManagement
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4315.parkingmanagement;

/**
 *
 * @Date: 12/29/22
 * @author lutherchikumba
 *
 */
/**
 *
 */

import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;

/**
 * <b>Description:</b><br>
 *This is the manager class which manages all the parking permits.
 *
 * <b>ModifiedOn:</b>&nbsp;N/A
 * <b>CreatedOn</b>&nbsp; 03/02/2020
 * @author anujpatait
 *
 */
public class PermitManager {

      private HashMap<String, ParkingPermit> permits = null;

      /**
       * Default Constructor, We will use this constructor create instances
       * without setting any attributes.
       */
      public PermitManager() {
            permits = new HashMap<String, ParkingPermit>();
      }

      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       *
       * @param permits
       */
      public PermitManager(HashMap<String, ParkingPermit> permits) {
            this.permits = permits;
      }

      /**
       * This method is the getter method for getting all the permits.
       * @return the permits
       */
      public HashMap<String, ParkingPermit> getPermits() {
            return permits;
      }

      /**
       * This method is the getter method for getting the permits from license Plate.
       * @return the ParkingPermit
       */
      public ParkingPermit getPermit(String licensePlate) {
            return permits.get(licensePlate);
      }

      /**
       * This is the setter method for setting all the permits.
       * @param permits the permits to set
       */
      public void setPermits(HashMap<String, ParkingPermit> permits) {
            this.permits = permits;
      }

      /**
       * This method will create an object of ParkingPermit class and will add it
       * to the permits collection.
       * This method assumes that expiration date will be one year from current date.
       * @param vehicle
       * @return Added ParkingPermit Object.
       */
      public ParkingPermit register(Vehicle vehicle) {

            ParkingPermit permit = new ParkingPermit();
            permit.setId(UUID.randomUUID().toString());
            permit.setVehicle(vehicle);

            Calendar expirationDate = Calendar.getInstance();
            expirationDate.add(Calendar.YEAR, 1);

            permit.setExpirationDate(expirationDate);
            permit.setRegistrationDate(Calendar.getInstance());

            permits.put(vehicle.getLicensePlate(), permit);

            return permit;

      }



}

