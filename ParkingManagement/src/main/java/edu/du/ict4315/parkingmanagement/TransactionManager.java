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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
 * <b>Description:</b><br>
 *This is the class which manages all the parking transactions.
 *
 * <b>ModifiedOn:</b>&nbsp;N/A
 * <b>CreatedOn</b>&nbsp; 03/02/2020
 * @author anujpatait
 *
 */
public class TransactionManager {

      ArrayList<ParkingTransaction> transactions = null;

      HashMap<String, ArrayList<ParkingTransaction>> vehicleTransaction = null;

      /**
       * Default Constructor, We will use this constructor create instances
       * without setting any attributes.
       */
      public TransactionManager() {
            transactions = new ArrayList<ParkingTransaction>();

            vehicleTransaction = new HashMap<String, ArrayList<ParkingTransaction>>();
      }

      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       *
       * @param transactions
       */
      public TransactionManager(ArrayList<ParkingTransaction> transactions) {
            this.transactions = transactions;
      }

      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       *
       * @param transactions
       */
      public TransactionManager(HashMap<String, ArrayList<ParkingTransaction>> permitTransaction) {
            this.vehicleTransaction = permitTransaction;
      }



      /**
       * This is the getter method for getting all the transactions.
       * @return the transactions
       */
      public ArrayList<ParkingTransaction> getTransactions() {
            return transactions;
      }

      /**
       * This is the setter method for setting all the transactions.
       * @param transactions the transactions to set
       */
      public void setTransactions(ArrayList<ParkingTransaction> transactions) {
            this.transactions = transactions;
      }

      /**
       * This method will create a parking transaction and will add it to the transactions list.
       * @param date
       * @param permit
       * @param lot
       * @return New created Transaction.
       */
      public ParkingTransaction park(Calendar date, ParkingPermit permit, ParkingLot lot) {

            ParkingTransaction transaction = new ParkingTransaction();
            transaction.setLot(lot);
            transaction.setPermit(permit);
            transaction.setTransactionDate(date);

            transactions.add(transaction);
            ArrayList<ParkingTransaction> licenseTransaction = vehicleTransaction.get(permit.getVehicle().getLicensePlate());
            if(licenseTransaction == null) {
                  licenseTransaction = new ArrayList<ParkingTransaction>();

            }
            licenseTransaction.add(transaction);
            vehicleTransaction.put(permit.getVehicle().getLicensePlate(), licenseTransaction);

            return transaction;

      }


      public Money getParkingCharges(ParkingPermit permit) {
            Money charge = null;
            double tempCharge = 0;

            String licensePlate = permit.getVehicle().getLicensePlate();
            ArrayList<ParkingTransaction> licenseTransaction = vehicleTransaction.get(licensePlate);
            for(ParkingTransaction trans : licenseTransaction) {
                  tempCharge += trans.getChargedAmount().getAmount();
            }
            charge = new Money(tempCharge, licenseTransaction.get(0).getChargedAmount().getCurrency());



            return charge;
      }

      public Money getParkingCharges(String licensePlate) {
            Money charge = null;
            double tempCharge = 0;

            ArrayList<ParkingTransaction> licenseTransaction = vehicleTransaction.get(licensePlate);

            for(ParkingTransaction trans : licenseTransaction) {
                  tempCharge += trans.getChargedAmount().getAmount();
            }
            charge = new Money(tempCharge, licenseTransaction.get(0).getChargedAmount().getCurrency());



            return charge;
      }

}
