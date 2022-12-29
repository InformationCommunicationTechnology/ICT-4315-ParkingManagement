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

import java.util.ArrayList;

/**
 * <b>Description:</b><br>
 * This class maintains money information like and amount and
 * currency type. Using this class we can create and update amount information.
 *
 * <b>ModifiedOn</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 02/12/2020
 * @author anujpatait
 *
 */
public class Money {

      private Double amount;
      private String currency;

      /**
       * Default Constructor, We will use this constructor create instances
       * without setting any attributes.
       *
       */
      public Money() {

      }


      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       *
       * @param amount
       * @param currency
       */
      public Money(Double amount, String currency) {
            super();
            this.amount = amount;
            this.currency = currency;
      }


      /**
       * This method is the getter method for Amount.
       * @return the amount
       */
      public Double getAmount() {
            return amount;
      }

      /**
       * This method is the getter method for currency.
       *
       * @return the currency
       */
      public String getCurrency() {
            return currency;
      }

      /**
       * This is the setter method for Amount.
       *
       * @param amount the amount to set
       */
      public void setAmount(Double amount) {
            this.amount = amount;
      }

      /**
       * This is the setter method for Currency.
       *
       * @param currency the currency to set
       */
      public void setCurrency(String currency) {
            this.currency = currency;
      }

      /**
       * This method validate if Amount is positive or not. If the Amount
       * is positive double then the method will return TRUE else FALSE.
       * @return boolean, Validation Result
       */
      public boolean validateAmount() {
            boolean result = true;
            if(amount <= 0) {

                  result = false;
            }
            return result;
      }

      /**
       * This method validate if currency is null or empty. If the currency
       * is neither null or empty then the method will return TRUE else FALSE.
       * @return Boolean, Validation Result
       *
       */
      public boolean validateCurrency() {
            boolean result = true;
            ArrayList<String> validCurrency = new ArrayList<String>();
            validCurrency.add("USD");
            validCurrency.add("$");
            validCurrency.add("DOLLAR");

            if(currency == null || currency.isEmpty()) {
                  result = false;
            } else if (!validCurrency.contains(currency.toUpperCase())) {
                  result = false;
            }

            return result;
      }

      @Override
      public String toString() {
            return "Money [amount=" + amount + ", currency=" + currency + "]";
      }



}
