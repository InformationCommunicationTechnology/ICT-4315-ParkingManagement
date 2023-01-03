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
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * <b>Description:</b><br/>
 * This is the JUnit test class for Money.java class. In this class we will
 * write all the test cases related to Money validation.
 *
 * <b>ModifiedOn:</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 02/15/2020
 * @author anujpatait
 *
 */
class MoneyTest {

      /**
       * This test case will validate the amount when amount is negative.
       *
       * <b>Result:</b>&nbsp; Pass when validateAmount() method will return False.
       */
      @Test
      void testValidateNegativeAmount() {
            Money money = new Money();
            money.setAmount(-1.0);
            assertFalse(money.validateAmount());
      }

      /**
       * This test case will validate the amount when amount is zero.
       *
       * <b>Result:</b>&nbsp; Pass when validateAmount() method will return False.
       */
      @Test
      void testValidateZeroAmount() {
            Money money = new Money();
            money.setAmount(0.0);
            assertFalse(money.validateAmount());
      }

      /**
       /**
       * This test case will validate the amount when amount is positive double.
       *
       * <b>Result:</b>&nbsp; Pass when validateAmount() method will return True.
       */
      @Test
      void testValidatePositiveAmount() {
            Money money = new Money();
            money.setAmount(1.0);
            assertTrue(money.validateAmount());
      }

      /**
       * This test case will validate the unhappy path where currency is empty.
       *
       * <b>Result:</b>&nbsp; Pass when validateCurrency() method will return False.
       */
      @Test
      void testValidatEmptyCurrency() {
            Money money = new Money();
            money.setCurrency("");
            assertFalse(money.validateCurrency());
      }

      /**
       * This test case will validate the unhappy path where currency is null.
       *
       * <b>Result:</b>&nbsp; Pass when validateCurrency() method will return False.
       */
      @Test
      void testValidatNullCurrency() {
            Money money = new Money();
            money.setCurrency(null);
            assertFalse(money.validateCurrency());
      }

      /**
       * This test case will validate the unhappy path where currency is invalid.
       *
       * <b>Result:</b>&nbsp; Pass when validateCurrency() method will return False.
       */
      @Test
      void testValidatInvalidCurrency() {
            Money money = new Money();
            money.setCurrency("USAD");
            assertFalse(money.validateCurrency());
      }

      /**
       * This test case will validate the happy path where currency is valid.
       *
       * <b>Result:</b>&nbsp; Pass when validateCurrency() method will return true.
       */
      @Test
      void testValidatCurrency() {
            Money money = new Money();
            money.setCurrency("Dollar");
            assertTrue(money.validateCurrency());
      }
}