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


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @Description
 * This is the JUnit test class for Customer.java class. In this class we will
 * write all the test cases related to Customer validation.
 *
 * @ModifiedOn N/A
 * @CreatedOn 01/31/2020
 * @author anujpatait
 *
 */

class CustomerTest {

      /**
       * This test case will validate the Customer information when all the required fields are present.
       *
       * <b>Result:</b>&nbsp; Pass when the executor will get Customer information in below format.
       * 			"ID: Value\n" +
       "Name: Value\n" +
       "Phone Number: Value\n" +
       "Address: Value\n"
       */
      @Test
      void testCustomerInfoWithValidFields() {

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

            String expected = "ID: AB50439\n" +
                    "Name: Anuj Patait\n" +
                    "Phone Number: 303-992-8712\n" +
                    "Address: 525 W Burgundy Street, Unit 622, Highlands Ranch, CO, 80129"
                    ;
            assertEquals(expected, customer.getCustomerInfo());

      }

      /**
       * This test case will validate the Customer Name when all the required fields are present.
       *
       * <b>Result:</b>&nbsp; Pass when the executor will get Customer information in below format.
       * 			"FirstName LastName"
       */
      @Test
      void testCustomerName() {
            String firstName = "Anuj";
            String lastName = "Patait";


            Customer customer = new Customer();
            customer.setFirstName(firstName);
            customer.setLastName(lastName);

            String expected = "Anuj Patait";
            assertEquals(expected, customer.getCustomerName());

      }

      /**
       * This test case will validate the unhappy path where first name is not present.
       *
       * <b>Result:</b>&nbsp; Pass when validateFirstName method will return False.
       */
      @Test
      void testValidateEmptyFirstName() {

            Customer customer = new Customer();
            customer.setFirstName("");

            assertFalse(customer.validateFirstName());


      }

      /**
       * This test case will validate the unhappy path where first name is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateFirstName method will return False.
       */
      @Test
      void testValidateNullFirstName() {

            Customer customer = new Customer();
            customer.setFirstName(null);

            assertFalse(customer.validateFirstName());


      }

      /**
       * This test case will validate the unhappy path where last name is not present.
       *
       * <b>Result:</b>&nbsp; Pass when validateLastName method will return False.
       */
      @Test
      void testValidateEmptyLastName() {

            Customer customer = new Customer();
            customer.setLastName("");

            assertFalse(customer.validateLastName());


      }

      /**
       * This test case will validate the unhappy path where last name is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateLastName method will return False.
       */
      @Test
      void testValidateNullLastName() {

            Customer customer = new Customer();
            customer.setLastName(null);

            assertFalse(customer.validateLastName());


      }


      /**
       * This test case will validate the unhappy path where id is not present.
       *
       * <b>Result:</b>&nbsp; Pass when validateId method will return False.
       */
      @Test
      void testValidateIdNotPresent() {

            Customer customer = new Customer();
            customer.setId("");

            assertFalse(customer.validateId());


      }

      /**
       * This test case will validate the unhappy path where ID is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateId method will return False.
       */
      @Test
      void testValidateNullId() {

            Customer customer = new Customer();
            customer.setId(null);

            assertFalse(customer.validateId());


      }


      /**
       * This test case will validate the Phone Number, when Phone Number is Empty
       *
       * <b>Result:</b>&nbsp; Pass when validatePhoneNumber method will return False.
       */
      @Test
      void testValidateEmptyPhoneNumber() {

            Customer customer = new Customer();
            customer.setPhoneNumber("");

            assertFalse(customer.validatePhoneNumber());


      }

      /**
       * This test case will validate the customer Phone Number, when Phone Number is Null
       *
       * <b>Result:</b>&nbsp; Pass when validatePhoneNumber method will return False.
       */
      @Test
      void testValidateNullPhoneNumber() {

            Customer customer = new Customer();
            customer.setPhoneNumber(null);

            assertFalse(customer.validatePhoneNumber());

      }

      /**
       * This test case will validate the customer Phone Number, when Phone Number is Null
       *
       * <b>Result:</b>&nbsp; Pass when validatePhoneNumber method will return False.
       */
      @Test
      void testValidateIncorrectPhoneNumber() {

            Customer customer = new Customer();
            customer.setPhoneNumber("303-0000-222");

            assertFalse(customer.validatePhoneNumber());

      }


}