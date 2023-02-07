/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement;

import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @Date: 2/6/23
 * @author lutherchikumba
 *
 */
public class ParkingEvent implements ParkingAction{
      Calendar entryTime;
      Calendar exitTime;
      ParkingPermit parkingPermit;
      ParkingTransaction parkingTransaction;
      public ParkingEvent() {
      }

      public Calendar enter(Calendar entryTime){
            return this.entryTime = entryTime;
      }
      public Calendar exit(Calendar exitTime){
            return this.exitTime = exitTime;
      }

      @Override
      public void update(ParkingLot parkingLot, TransactionManager transactionManager) {

            if (parkingPermit.validateId()){
                  parkingTransaction = transactionManager.park(enter(entryTime),parkingPermit,parkingLot);
            }else if (parkingTransaction.getLot() == parkingLot){
                  parkingTransaction = transactionManager.park(exit(exitTime),parkingPermit,parkingLot);
            } else {
                  System.out.println("Your permit is invalid");
            }

      }
}
