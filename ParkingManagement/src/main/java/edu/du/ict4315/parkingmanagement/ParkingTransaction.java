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

import java.util.Calendar;

/**
 * <b>Description:</b><br>
 *This is the class which manages the parking transactions. It stores which permit
 *and which lot the vehicle is using.
 *
 * <b>ModifiedOn:</b>&nbsp;N/A
 * <b>CreatedOn</b>&nbsp; 03/02/2020
 * @author anujpatait
 *
 */
public class ParkingTransaction {

      private Calendar transactionDate;
      private ParkingPermit permit;
      private ParkingLot lot;
      private Money feeCharged;

      /**
       * Default Constructor, We will use this constructor create instances
       * without setting any attributes.
       */
      public ParkingTransaction() {

      }

      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       *
       * @param transactionDate
       * @param permit
       * @param lot
       */
      public ParkingTransaction(Calendar transactionDate, ParkingPermit permit, ParkingLot lot) {
            this.transactionDate = transactionDate;
            this.permit = permit;
            this.lot = lot;

      }

      /**
       * This method is the getter method for transaction date.
       * @return the transactionDate
       */
      public Calendar getTransactionDate() {
            return transactionDate;
      }

      /**
       * This method is the getter method for parking permit.
       * @return the permit
       */
      public ParkingPermit getPermit() {
            return permit;
      }

      /**
       * This method is the getter method for parking lot.
       * @return the lot
       */
      public ParkingLot getLot() {
            return lot;
      }

      /**
       * This is the setter method for transaction date.
       * @param transactionDate the transactionDate to set
       */
      public void setTransactionDate(Calendar transactionDate) {
            this.transactionDate = transactionDate;
      }

      /**
       * This is the setter method for parking permit.
       * @param permit the permit to set
       */
      public void setPermit(ParkingPermit permit) {
            this.permit = permit;
      }

      /**
       * This is the setter method for parking lot.
       * @param lot the lot to set
       */
      public void setLot(ParkingLot lot) {
            this.lot = lot;
      }

      /**
       * This method return the parking fee based on the parking lot
       * and parking permit details.
       * @return Amount charged for parking.
       */
      public Money getChargedAmount() {

            feeCharged = lot.getDailyRate(permit.getVehicle().getType());

            return feeCharged;
      }

      /**
       * This method validate if date is null. If the date
       * is not null then the method will return TRUE else FALSE.
       * @return boolean, Validation Result
       */
      public boolean validateTransactionDate() {
            boolean result = true;

            if(transactionDate == null) {

                  result = false;
            }

            return result;
      }

      /**
       * This method validate if permit is null. If the permit
       * is not null then the method will return TRUE else FALSE.
       * @return boolean, Validation Result
       */
      public boolean validatePermit() {
            boolean result = true;

            if(permit == null) {

                  result = false;
            }

            return result;
      }

      /**
       * This method validate if lot is null. If the lot
       * is not null then the method will return TRUE else FALSE.
       * @return boolean, Validation Result
       */
      public boolean validateLot() {
            boolean result = true;

            if(lot == null) {

                  result = false;
            }

            return result;
      }
}

