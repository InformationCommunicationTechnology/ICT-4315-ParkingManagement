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

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * <b>Description:</b><br>
 * This class maintain all the Parking permit related information like its it, vehicle,
 * and expiration date details. Using this class we can create, modify, and print parking permit information.
 *
 * <b>ModifiedOn:</b>&nbsp;N/A
 * <b>CreatedOn</b>&nbsp; 03/02/2020
 * @author anujpatait
 *
 */
public class ParkingPermit {

      private String id;
      private Vehicle vehicle;
      private Calendar expirationDate;
      private Calendar registrationDate;

      /**
       * Default Constructor, We will use this constructor create instances
       * without setting any attributes.
       */
      public ParkingPermit() {

      }

      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       *
       * @param id
       * @param vehicle
       * @param expirationDate
       * @param registrationDate
       */
      public ParkingPermit(String id, Vehicle vehicle, Calendar expirationDate, Calendar registrationDate) {
            this.id = id;
            this.vehicle = vehicle;
            this.expirationDate = expirationDate;
            this.registrationDate = registrationDate;
      }

      /**
       * This method is the getter method for id.
       * @return the id
       */
      public String getId() {
            return id;
      }

      /**
       * This method is the getter method for vehicle.
       * @return the vehicle
       */
      public Vehicle getVehicle() {
            return vehicle;
      }

      /**
       * This method is the getter method for expiration date.
       * @return the expirationDate
       */
      public Calendar getExpirationDate() {
            return expirationDate;
      }

      /**
       * This method is the getter method for registration date.
       * @return the registrationDate
       */
      public Calendar getRegistrationDate() {
            return registrationDate;
      }

      /**
       * This is the setter method for id.
       * @param id the id to set
       */
      public void setId(String id) {
            this.id = id;
      }

      /**
       * This is the setter method for vehicle.
       * @param vehicle the vehicle to set
       */
      public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
      }

      /**
       * This is the setter method for expiration date.
       * @param expirationDate the expirationDate to set
       */
      public void setExpirationDate(Calendar expirationDate) {
            this.expirationDate = expirationDate;
      }

      /**
       * This is the setter method for registration date.
       * @param registrationDate the registrationDate to set
       */
      public void setRegistrationDate(Calendar registrationDate) {
            this.registrationDate = registrationDate;
      }

      /**
       * This method convert the date from Calendar to String in format MM/dd/yyyy.
       * @param date as Calendar
       * @return Date as String
       */

      public String getDateString(Calendar date) {
            String dateString = "";

            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            dateString = sdf.format(date.getTime());

            return dateString;
      }


      /**
       * This method validate if ID is null or empty. If the ID
       * is neither null or empty then the method will return TRUE else FALSE.
       * @return boolean, Validation Result
       *
       */
      public boolean validateId() {

            boolean isValid = true;

            if(id == null || id.isEmpty()) {
                  isValid = false;
            }

            return isValid;
      }

      /**
       * This method validate if date is null. If the date
       * is not null then the method will return TRUE else FALSE.
       * @return boolean, Validation Result
       */
      public boolean validateRegistrationDate() {
            boolean result = true;

            if(registrationDate == null) {

                  result = false;
            }

            return result;
      }

      /**
       * This method validate if date is null. If the date
       * is not null then the method will return TRUE else FALSE.
       * @return boolean, Validation Result
       */
      public boolean validateExpirationDate() {
            boolean result = true;

            if(expirationDate == null) {

                  result = false;
            }

            return result;
      }

}

