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

/**
 * <b>Description:</b><br>
 * This class maintain all the Vehicle related information like its type, number,
 * and owner details. Using this class we can create, modify, and print vehicle information.
 *
 * <b>ModifiedOn:</b>&nbsp;N/A
 * <b>CreatedOn</b>&nbsp; 03/02/2020
 * @author anujpatait
 *
 */
public class Vehicle {

      private VehicleType type;
      private String licensePlate;
      private Customer owner;

      /**
       * Default Constructor, We will use this constructor create instances
       * without setting any attributes.
       */
      public Vehicle() {

      }

      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       * @param type
       * @param licensePlate
       * @param owner
       */
      public Vehicle(VehicleType type, String licensePlate, Customer owner) {
            this.type = type;
            this.licensePlate = licensePlate;
            this.owner = owner;
      }

      /**
       * This method is the getter method for Vehicle type.
       * @return the type
       */
      public VehicleType getType() {
            return type;
      }

      /**
       * This method is the getter method for license plate.
       * @return the licensePlate
       */
      public String getLicensePlate() {
            return licensePlate;
      }

      /**
       * This method is the getter method for owner.
       * @return the owner
       */
      public Customer getOwner() {
            return owner;
      }

      /**
       * This is the setter method for Vehicle type.
       * @param type the type to set
       */
      public void setType(VehicleType type) {
            this.type = type;
      }

      /**
       * This is the setter method for license plate.
       * @param licensePlate the licensePlate to set
       */
      public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
      }

      /**
       * This is the setter method for owner.
       * @param owner the owner to set
       */
      public void setOwner(Customer owner) {
            this.owner = owner;
      }

      /**
       * This method validate if license plate is null or empty. If the license plate
       * is neither null or empty then the method will return TRUE else FALSE.
       * @return Boolean, Validation Result
       */
      public boolean validateLicensePlate() {

            boolean isValid = true;

            if(licensePlate == null || licensePlate.isEmpty()) {
                  isValid = false;
            }

            return isValid;
      }

      /**
       * This method validate if type is null. If the type
       * is neither null or empty then the method will return TRUE else FALSE.
       * @return Boolean, Validation Result
       */
      public boolean validateType() {

            boolean isValid = true;

            if(type == null ) {
                  isValid = false;
            }

            return isValid;
      }

      /**
       * This method validate if owner is null. If the owner
       * is neither null or empty then the method will return TRUE else FALSE.
       * @return Boolean, Validation Result
       */
      public boolean validateOwner() {

            boolean isValid = true;

            if(owner == null ) {
                  isValid = false;
            }

            return isValid;
      }

}

