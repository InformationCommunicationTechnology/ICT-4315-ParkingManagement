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

import java.util.regex.Pattern;

/**
 * <b>Description:</b><br>
 * This class maintains address information like Street1, Street2,
 * City, State, and Zipcode. Using this class we can create, update, or print
 * the address information.
 *
 * <b>ModifiedOn</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 01/31/2020
 * @author anujpatait
 *
 */
public class Address {

      private String street1;
      private String street2;
      private String city;
      private String state;
      private String zip;



      /**
       * Default Constructor, We will use this constructor create instances
       * without setting any attributes.
       */
      public Address() {

      }

      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       *
       * @param street1, Address Stree1
       * @param street2, Address Stree2
       * @param city, Address City
       * @param state, Address State
       * @param zip, Address Zip
       */
      public Address(String street1, String street2, String city, String state, String zip) {
            super();
            this.street1 = street1;
            this.street2 = street2;
            this.city = city;
            this.state = state;
            this.zip = zip;

      }

      /**
       * This method is the getter method for Street1.
       *
       * @return the street1
       */
      public String getStreet1() {
            return street1;
      }

      /**
       * This is the setter method for Street1.
       *
       * @param street1 the street1 to set
       */
      public void setStreet1(String street1) {
            this.street1 = street1;

      }

      /**
       * This method is the getter method for Street2.
       *
       * @return the street2
       */
      public String getStreet2() {
            return street2;
      }

      /**
       * This is the setter method for Street2.
       *
       * @param street2 the street2 to set
       */
      public void setStreet2(String street2) {
            this.street2 = street2;
      }

      /**
       * This method is the getter method for City.
       *
       * @return the city
       */
      public String getCity() {
            return city;
      }

      /**
       * This is the setter method for City.
       *
       * @param city the city to set
       */
      public void setCity(String city) {
            this.city = city;

      }

      /**
       * This method is the getter method for State.
       *
       * @return the state
       */
      public String getState() {
            return state;
      }

      /**
       * This is the setter method for State.
       *
       * @param state the state to set
       */
      public void setState(String state) {
            this.state = state;

      }

      /**
       * This method is the getter method for Zip code.
       *
       * @return the zip
       */
      public String getZip() {
            return zip;
      }

      /**
       * This is the setter method for Zip Code.
       *
       * @param zip the zip to set
       */
      public void setZip(String zip) {
            this.zip = zip;

      }

      /**
       * This method do the following:
       *
       * 1. If street2 is preset then return the address string in command separated format
       *    "street1, street2, city, state, zip
       * 2. If street2 is not present then return
       *	  "street1, city, state, zip."
       *
       * @return Adress String
       */
      public String getAddressInfo() {

            String mailingAddress = null;


            if(street2 != null && !street2.isEmpty()) {
                  mailingAddress = street1 + ", " + street2 + ", "+ city + ", "+ state + ", "+ zip;
            }else {
                  mailingAddress = street1 + ", "+ city + ", "+ state + ", "+ zip;
            }

            return mailingAddress;
      }

      /**
       * This method returns FALSE if the street1 is null or empty else returns TRUE.
       * @return boolean, validation result
       */
      public boolean validateStreet1() {

            boolean result = true;

            if(street1 == null || street1.isEmpty()) {
                  result = false;
            }

            return result;
      }

      /**
       * This method returns FALSE if the city is null or empty else returns TRUE.
       * @return boolean, validation result
       */
      public boolean validateCity() {

            boolean result = true;

            if(city == null || city.isEmpty()) {
                  result = false;
            }

            return result;
      }

      /**
       * This method validates if the state is valid or not. For this, We first check
       * if state string is null or empty, if not, then we check is length of the string is
       * 2 characters or not. if the length is 2 characters then we check if the string contains
       * any number or not. If all the conditions are false then we return TRUE else FALSE.
       * @return boolean, validation result
       */
      public boolean validateState() {

            boolean result = true;

            if(state == null || state.isEmpty()) {
                  result = false;

            }else if (state.length() != 2) {
                  result = false;

            }else if (state.matches(".*\\d.*")) {
                  result = false;
            }

            return result;
      }

      /**
       * This method will validate if the zip code is null or empty.
       * If the zip code is neither null or empty then it will validate if the zip code is in
       * valid US format or not. If the zip code is in valid US format then the
       * method will return TRUE else FALSE.
       * @return boolean, validation result
       */
      public boolean validateZip() {

            String validZipRegx = "^[0-9]{5}(?:-[0-9]{4})?$";
            Pattern validZipPattern = Pattern.compile(validZipRegx);
            boolean validationResult = true;

            if(zip == null || zip.isEmpty()) {
                  validationResult =  false;

            }else if(!validZipPattern.matcher(zip).matches()) {

                  validationResult =  false;
            }

            return validationResult;
      }

      @Override
      public String toString() {
            return "Address [street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", state=" + state + ", zip="
                    + zip + "]";
      }

}



