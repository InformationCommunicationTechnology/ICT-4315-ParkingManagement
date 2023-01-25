package edu.du.ict4315.parkingmanagement; /**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */

/**
 *
 * @Date: 1/3/23
 * @author lutherchikumba
 *
 */


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.du.ict4315.parkingmanagement.builder.AddressInfo;
import edu.du.ict4315.parkingmanagement.builder.CustomerInfo;
import org.junit.jupiter.api.Test;

/**
 * @Description
 * This is the JUnit test class for CustomerInfo.java class. In this class we will
 * write all the test cases related to CustomerInfo validation.
 *
 * @ModifiedOn N/A
 * @CreatedOn 01/31/2020
 * @author anujpatait
 *
 */

class CustomerTest {

      /**
       * This test case will validate the CustomerInfo information when all the required fields are present.
       *
       * <b>Result:</b>&nbsp; Pass when the executor will get CustomerInfo information in below format.
       * 			"ID: Value\n" +
       "Builder: Value\n" +
       "Phone Number: Value\n" +
       "AddressInfo: Value\n"
       */
      @Test
      void testCustomerInfoWithValidFields() {

//            String id = "AB50439";
//            String firstName = "Anuj";
//            String lastName = "Patait";
//            String phoneNumber = "303-992-8712";

//            String street1 = "525 W Burgundy Street";
//            String street2 = "Unit 622";
//            String city = "Highlands Ranch";
//            String state = "CO";
//            String zip = "80129";

            AddressInfo addressInfo = new AddressInfo.Builder()
                    .street1("525 W Burgundy Street")
                    .street2("Unit 622")
                    .city("Highlands Ranch")
                    .state("CO")
                    .zip("80129")
                    .build();
            CustomerInfo customerInfo = new CustomerInfo.Builder()
                    .id("AB50439")
                    .firstName("Anuj")
                    .lastName("Patait")
                    .phoneNumber("303-992-8712")
                    .address(new Address(addressInfo))
                    .build();

            Customer customer = new Customer(customerInfo);

            String expected = "ID: AB50439\n" +
                    "Builder: Anuj Patait\n" +
                    "Phone Number: 303-992-8712\n" +
                    "AddressInfo: 525 W Burgundy Street, Unit 622, Highlands Ranch, CO, 80129";
            assertEquals(expected, customer.getCustomerInfo());

      }

      /**
       * This test case will validate the CustomerInfo Builder when all the required fields are present.
       *
       * <b>Result:</b>&nbsp; Pass when the executor will get CustomerInfo information in below format.
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