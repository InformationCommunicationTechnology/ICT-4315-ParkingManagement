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

import java.util.HashMap;

/**
 * <b>Description:</b><br>
 * This class maintains information about the parking office like it's name, address,
 * customers associated with the office, and parking lots associated with the office.
 * Using this class we can create, update, and retrieve office information.
 *
 * <b>ModifiedOn</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 02/15/2020
 *
 * @author anujpatait
 *
 */
public class ParkingOffice {

      private String parkingOfficeName;
      private HashMap<String, Customer> customers;
      private HashMap<String, ParkingLot> parkingLots;
      private Address parkingOfficeAddress;

      /**
       * Default Constructor, We will use this constructor create instances
       * of the class and also initialize customers and parkingLots attributes.
       */
      public ParkingOffice() {
            customers = new HashMap<String, Customer>();
            parkingLots = new HashMap<String, ParkingLot>();
      }



      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       *
       * @param parkingOfficeName
       * @param customers
       * @param parkingLots
       * @param parkingOfficeAddress
       */
      public ParkingOffice(String parkingOfficeName, HashMap<String, Customer> customers,
                           HashMap<String, ParkingLot> parkingLots, Address parkingOfficeAddress) {
            super();
            this.parkingOfficeName = parkingOfficeName;
            this.customers = customers;
            this.parkingLots = parkingLots;
            this.parkingOfficeAddress = parkingOfficeAddress;
      }

      /**
       * This method is the getter method for name.
       * @return the parkingOfficeName
       */
      public String getParkingOfficeName() {
            return parkingOfficeName;
      }

      /**
       * This method is the getter method for getting all the customers.
       * @return the customers
       */
      public HashMap<String, Customer> getCustomers() {
            return customers;
      }

      /**
       * This method is the getter method for getting all the parking lots.
       * @return the parkingLots
       */
      public HashMap<String, ParkingLot> getParkingLots() {
            return parkingLots;
      }

      /**
       * This method is the getter method for address.
       * @return the parkingOfficeAddress
       */
      public Address getParkingOfficeAddress() {
            return parkingOfficeAddress;
      }

      /**
       * This is the setter method for name.
       *
       * @param parkingOfficeName the parkingOfficeName to set
       */
      public void setParkingOfficeName(String parkingOfficeName) {
            this.parkingOfficeName = parkingOfficeName;
      }

      /**
       * This is the setter method for address.
       * @param parkingOfficeAddress the parkingOfficeAddress to set
       */
      public void setParkingOfficeAddress(Address parkingOfficeAddress) {
            this.parkingOfficeAddress = parkingOfficeAddress;
      }

      /**
       * This method will register the new customer to the Parking office.
       * @param customer
       */
      public void register(Customer customer) {
            customers.put(customer.getId(), customer);

      }

      /**
       * This method will remove the customer from parking office.
       * @param customer
       * @return Removed CustomerInfo
       */
      public Customer removeCustomer(Customer customer) {
            Customer removeCustomer = customers.remove(customer.getId());

            return removeCustomer;
      }

      /**
       * This method will get the customer information from the customer map.
       *
       * @param customerId
       * @return CustomerInfo Object
       */
      public Customer getCustomer(String customerId) {
            Customer customer = customers.get(customerId);

            return customer;
      }

      /**
       * This method will add new parking lot to the parking office.
       * @param parkingLot
       */
      public void addLot(ParkingLot parkingLot) {

            parkingLots.put(parkingLot.getId(), parkingLot);
      }

      /**
       * This method will remove the parking lot from the parking office.
       * @param parkingLot
       * @return Removed Lot
       */
      public ParkingLot removeLot(ParkingLot parkingLot) {
            ParkingLot removedLot = parkingLots.remove(parkingLot.getId());

            return removedLot;
      }

      /**
       * This method will retrieve the parking lot object for the given lot id.
       * @param parkingLotId
       * @return
       */
      public ParkingLot getParkingLot(String parkingLotId) {
            return parkingLots.get(parkingLotId);
      }

      /**
       * This method validate if parkingOfficeName is null or empty. If the parkingOfficeName
       * is neither null or empty then the method will return TRUE else FALSE.
       * @return Boolean, Validation Result
       */
      public boolean validateParkingOfficeName() {
            boolean result = true;

            if(parkingOfficeName == null || parkingOfficeName.isEmpty()) {
                  result = false;
            }
            return result;
      }



      @Override
      public String toString() {
            return "ParkingOffice [parkingOfficeName=" + parkingOfficeName + ", customers=" + customers + ", parkingLots="
                    + parkingLots + ", parkingOfficeAddress=" + parkingOfficeAddress + "]";
      }



}
