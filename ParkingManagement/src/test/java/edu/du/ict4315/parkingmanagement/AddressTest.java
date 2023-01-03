package edu.du.ict4315.parkingmanagement; /**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 1/3/23
 * @author lutherchikumba
 *
 */


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <b>Description:</b><br/>
 * This is the JUnit test class for Address.java class. In this class we will
 * write all the test cases related to Address validation.
 *
 * <b>ModifiedOn:</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 01/31/2020
 * @author anujpatait
 *
 */
class AddressTest {


      /**
       * This test case will validate the mailing address when street2 is present in the input.
       *
       * <b>Result:</b>&nbsp; Pass when the mailing address is in "street1, street2, city, state, zip" format.
       */
      @Test
      void testAddressInfoWithStreet2() {

            Address address = new Address();

            address.setStreet1("525 W Burgundy Street");
            address.setStreet2("Unit 622");
            address.setCity("Highlands Ranch");
            address.setState("CO");
            address.setZip("80129");

            assertEquals("525 W Burgundy Street, Unit 622, Highlands Ranch, CO, 80129",
                    address.getAddressInfo());
      }

      /**
       * This test case will validate the mailing address when street2 is not present in the input.
       *
       * <b>Result:</b>&nbsp; Pass when the mailing address is in "street1, city, state, zip" format.
       */
      @Test
      void testAddressInfoWithoutStreet2() {

            Address address = new Address();

            address.setStreet1("525 W Burgundy Street Unit 622");
            address.setCity("Highlands Ranch");
            address.setState("CO");
            address.setZip("80129");

            assertEquals("525 W Burgundy Street Unit 622, Highlands Ranch, CO, 80129",
                    address.getAddressInfo());
      }

      /**
       * This test case will validate the unhappy path where Street1 is not present.
       *
       * <b>Result:</b>&nbsp; Pass when validateStreet1() method will return False.
       */
      @Test
      void testValidateEmptyStreet1() {

            Address address = new Address();
            address.setStreet1("");

            assertFalse(address.validateStreet1());
      }

      /**
       * This test case will validate the unhappy path where Street1 is Null.
       *
       * <b>Result:</b>&nbsp; Pass when validateStreet1() method will return False.
       */
      @Test
      void testValidateNullStreet1() {

            Address address = new Address();
            address.setStreet1(null);

            assertFalse(address.validateStreet1());
      }

      /**
       * This test case will validate the unhappy path where city is not present.
       *
       * <b>Result:</b>&nbsp; Pass when validateCity() method will return False.
       */
      @Test
      void testValidateEmptyCity() {

            Address address = new Address();
            address.setCity("");

            assertFalse(address.validateCity());
      }

      /**
       * This test case will validate the unhappy path where city is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateCity() method will return False.
       */
      @Test
      void testValidateNullCity() {

            Address address = new Address();
            address.setCity(null);

            assertFalse(address.validateCity());
      }

      /**
       * This test case will validate the unhappy path where state is not present.
       *
       * <b>Result:</b>&nbsp; Pass when validateState() method will return False.
       */
      @Test
      void testValidateEmptyState() {

            Address address = new Address();
            address.setState("");
            assertFalse(address.validateState());
      }

      /**
       * This test case will validate the unhappy path where state is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateState() method will return False.
       */
      @Test
      void testValidateNullState() {

            Address address = new Address();
            address.setState(null);
            assertFalse(address.validateState());
      }


      /**
       * This test case will validate the unhappy path where state length is not equal to 2.
       *
       * <b>Result:</b>&nbsp; Pass when validateState() method will return False.
       */
      @Test
      void testValidateStateLength() {

            Address address = new Address();
            address.setState("C");
            assertFalse(address.validateState());
      }

      /**
       * This test case will validate the unhappy path where state contains number.
       *
       * <b>Result:</b>&nbsp; Pass when validateState() method will return False.
       */
      @Test
      void testValidateStateCharacterOnly() {

            Address address = new Address();
            address.setState("C1");
            assertFalse(address.validateState());
      }


      /**
       * This test case will validate the unhappy path where zip is not present.
       *
       * <b>Result:</b>&nbsp; Pass when validateZip() method will return False.
       */
      @Test
      void testValidateEmptyZip() {

            Address address = new Address();
            address.setZip("");
            assertFalse(address.validateZip());
      }

      /**
       * This test case will validate the unhappy path where zip is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateZip() method will return False.
       */
      @Test
      void testValidateNullZip() {

            Address address = new Address();
            address.setZip(null);
            assertFalse(address.validateZip());
      }


      /**
       * This test case will validate the unhappy path where zip in invalid format.
       *
       * <b>Result:</b>&nbsp; Pass when validateZip() method will return False.
       */
      @Test
      void testMailingAddressWithInvalidZip() {

            Address address = new Address();
            address.setZip("80134-12345");
            assertFalse(address.validateZip());

      }
}