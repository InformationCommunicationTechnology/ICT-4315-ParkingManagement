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

import edu.du.ict4315.parkingmanagement.builder.customer.CustomerInfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <b>Description:</b><br>
 * This class maintain all the customer related information like id, first name, last name,
 * and address. Using this class we can create, modify, and print user information.
 *
 * <b>ModifiedOn:</b>&nbsp;03/04/2020
 * <b>CreatedOn</b>&nbsp; 01/31/2020
 * @author anujpatait
 *
 */
public class Customer {

      private String id;
      private String firstName;
      private String lastName;
      private String phoneNumber;
      private Address address;


      /**
       * Default Constructor, We will use this constructor create instances
       * without setting any attributes.
       */
      public Customer() {

      }

      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       * @param id
       * @param firstName
       * @param lastName
       * @param phoneNumber
       * @param address
       * @param vehicleMap
       */

      public Customer(CustomerInfo customerInfo) {
            this.id = customerInfo.getId();
            this.firstName = customerInfo.getFirstName();
            this.lastName = customerInfo.getLastName();
            this.phoneNumber = customerInfo.getPhoneNumber();
            this.address = customerInfo.getAddress();

      }
      /**
       * This method is the getter method for ID.
       * @return the id
       */
      public String getId() {
            return id;
      }

      /**
       * This is the setter method for ID.
       * @param id the id to set
       *
       */
      public void setId(String id) {
            this.id = id;

      }

      /**
       * This method is the getter method for First Builder.
       * @return the firstName
       */
      public String getFirstName() {
            return firstName;
      }

      /**
       * This is the setter method for First Builder.
       * @param firstName the firstName to set
       *
       */
      public void setFirstName(String firstName) {
            this.firstName = firstName;

      }

      /**
       * This method is the getter method for Last  Builder.
       * @return the lastName
       */
      public String getLastName() {
            return lastName;
      }

      /**
       * This is the setter method for Last Builder.
       * @param lastName the lastName to set.
       *
       */
      public void setLastName(String lastName) {
            this.lastName = lastName;

      }

      /**
       * This method is the getter method for AddressInfo.
       * @return the address
       */
      public Address getAddress() {
            return address;
      }

      /**
       * This is the setter method for AddressInfo.
       * @param address the address to set.
       *
       */
      public void setAddress(Address address) {
            this.address = address;
      }

      /**
       * This method is the getter method for phone Number.
       * @return the phoneNumber
       */
      public String getPhoneNumber() {
            return phoneNumber;
      }

      /**
       * This is the setter method for the phone number.
       * @param phoneNumber the phoneNumber to set
       */
      public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
      }

      /**
       * This method returns the customer information in a label and comma separated form.
       * This method first validate all the records.
       * If all records are valid this method will first create the allChecks string in "&amp;&amp;" separated form
       * In the end this method will create the delimited userInfo string.
       * @return String, User Details
       */
      public String getCustomerInfo() {
            String customerInfo = null;

            customerInfo ="ID: "+ id +"\nBuilder: "+ getCustomerName() +"\nPhone Number: "+ getPhoneNumber() +
                    "\nAddressInfo: "+ address.getAddressInfo();

            return customerInfo;
      }

      /**
       * This method concatenate first name and last name using a space.
       * @return  String, CustomerInfo Full Builder.
       */
      public String getCustomerName() {
            String name = null;

            name = firstName +" "+lastName;

            return name;
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
       * This method validate if First Builder is null or empty. If the first name
       * is neither null or empty then the method will return TRUE else FALSE.
       * @return boolean, Validation Result
       */
      public boolean validateFirstName() {

            boolean isValid = true;

            if(firstName == null || firstName.isEmpty()) {
                  isValid = false;
            }

            return isValid;
      }

      /**
       * This method validate if Last Builder is null or empty. If the last name
       * is neither null or empty then the method will return TRUE else FALSE.
       * @return Boolean, Validation Result
       */
      public boolean validateLastName() {

            boolean isValid = true;

            if(lastName == null || lastName.isEmpty()) {
                  isValid = false;
            }

            return isValid;
      }

      /**
       * This method validate if phone number is null or empty. If the phone number
       * is neither null or empty then the method will return TRUE else FALSE.
       * if number is not empty or null then it will validate the phone number format. if format is correct
       * then it will return True else False.
       * @return boolean, Validation Result
       */
      public boolean validatePhoneNumber() {

            String phoneNumberRegx = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
            Pattern validPhoneNumberPattern = Pattern.compile(phoneNumberRegx);

            if(phoneNumber == null || phoneNumber.isEmpty()) {
                  return false;
            }

            Matcher isPhoneNumberValid = validPhoneNumberPattern.matcher(phoneNumber);

            if(!isPhoneNumberValid.matches()) {
                  return false;
            }

            return true;
      }

      @Override
      public String toString() {
            return "CustomerInfo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
                    + phoneNumber + ", address=" + address + "]";
      }




}
