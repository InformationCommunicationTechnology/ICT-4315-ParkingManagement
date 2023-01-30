/**
 * @Course: ICT 4305
 * @Project: ParkingManagement
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4315.parkingmanagement;

/**
 * @Date: 12/29/22
 * @author lutherchikumba
 */
/**
 *
 */

import edu.du.ict4315.parkingmanagement.factory.strategy.FactoryParkingCharges;
import edu.du.ict4315.parkingmanagement.factory.strategy.charges.ParkingChargeStrategy;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

/**
 * <b>Description:</b><br>
 * This class maintains information about the parking lot like it's id, name, address, and
 * type of lot. Using this class we can create and update lot information. Using this class
 * we can retrieve the daily rate of the parking lot.
 *
 * <b>ModifiedOn</b>&nbsp; N/A
 * <b>CreatedOn</b>&nbsp; 02/14/2020
 *
 * @author anujpatait
 *
 */
public class ParkingLot {

      private String id;
      private String name;
      private Address address;
      private ParkingLotType lotType;

      private ParkingChargeStrategy parkingChargeStrategy;
      private LocalDate date;

      /**
       * Default Constructor, We will use this constructor create instances
       * without setting any attributes.
       */
      public ParkingLot() {

      }

      /**
       * Parameterized constructor, This constructor will set below parameters while
       * creating the instance.
       *
       * @param id
       * @param name
       * @param address
       */
      public ParkingLot(String id, String name, Address address, ParkingChargeStrategy parkingChargeStrategy) {
            super();
            this.id = id;
            this.name = name;
            this.address = address;
            this.parkingChargeStrategy = parkingChargeStrategy;
      }

      /**
       * This method is the getter method for id.
       *
       * @return the id
       */
      public String getId() {
            return id;
      }

      /**
       * This method is the getter method for name.
       *
       * @return the name
       */
      public String getName() {
            return name;
      }

      /**
       * This method is the getter method for address.
       *
       * @return the address
       */
      public Address getAddress() {
            return address;
      }

      /**
       * This method is the getter method for lotType.
       *
       * @return the lotType
       */
      public ParkingLotType getLotType() {
            return lotType;
      }

      /**
       * This is the setter method for id.
       *
       * @param id the id to set
       */
      public void setId(String id) {
            this.id = id;
      }

      /**
       * This is the setter method for name.
       *
       * @param name the name to set
       */
      public void setName(String name) {
            this.name = name;
      }

      /**
       * This is the setter method for address.
       *
       * @param address the address to set
       */
      public void setAddress(Address address) {
            this.address = address;
      }

      /**
       * This is the setter method for lotType.
       *
       * @param lotType the lotType to set
       */
      public void setLotType(ParkingLotType lotType) {
            this.lotType = lotType;
      }

      public ParkingChargeStrategy getParkingChargeStrategy() {
            return parkingChargeStrategy;
      }

      public void setParkingChargeStrategy(ParkingChargeStrategy parkingChargeStrategy) {
            this.parkingChargeStrategy = parkingChargeStrategy;
      }

      /**
       * This method will return the daily rate for each vehicleType
       * according to the discount rate of vehicle and base rate of parking lot.
       *
       * @param vechicle
       * @return Money, daily rate.
       */
      public Money getDailyRate(VehicleType vechicle) {
            Money money = new Money();
            money.setCurrency("$");
            double base_rate = lotType.getRate();
            double discountRate = base_rate - ((vechicle.getDiscount() / 100) * base_rate);
            money.setAmount(discountRate);
            return money;

      }

//      public Money getDiscountRate(VehicleType vehicleType, LocalDate Time) {
//            Money money = new Money();
//            date = date.now();
//            money.setCurrency("$");
//            double base_rate = lotType.getRate();
//            if(vehicleType.equals(VehicleType.COMPACT)){
//                  double discountRate = base_rate -(( parkingChargeStrategy.getDiscount(vehicleType,Time) /100) * base_rate);
//                  money.setAmount(discountRate);
//            }else if(vehicleType.equals(VehicleType.SUV)){
//                  double discountRate = base_rate -(( parkingChargeStrategy.getDiscount(vehicleType,Time) /100) * base_rate);
//                  money.setAmount(discountRate);
//            }else if(Time.equals(date.with(firstInMonth(DayOfWeek.MONDAY)).equals(true) && date.getMonth().toString().equals("September"))){
//                  double discountRate = base_rate -(( parkingChargeStrategy.getDiscount(vehicleType,Time) /100) * base_rate);
//                  money.setAmount(discountRate);
//            }
//
//            return money;
//      }

      public Money getDiscountRate(String strategyName, double discountStrategy) {
            FactoryParkingCharges factoryParkingCharges = new FactoryParkingCharges();
            Money money = new Money();
            if (parkingChargeStrategy.getStrategy().equals(strategyName)) {
                  ParkingChargeStrategy parkingChargeStrategy = factoryParkingCharges.makeStrategy(strategyName, discountStrategy);
                  if (parkingChargeStrategy != null) {
                        money = parkingChargeStrategy.getDiscountRate();
                  }
                  return money;
            } else {
                  throw new IllegalArgumentException("Today is not " + strategyName);
            }

      }


      /**
       * This method validate if id is null or empty. If the id
       * is neither null or empty then the method will return TRUE else FALSE.
       *
       * @return Boolean, Validation Result
       */
      public boolean validateId() {
            boolean result = true;

            if (id == null || id.isEmpty()) {
                  result = false;
            }
            return result;
      }

      /**
       * This method validate if name is null or empty. If the name
       * is neither null or empty then the method will return TRUE else FALSE.
       *
       * @return Boolean, Validation Result
       */
      public boolean validateName() {
            boolean result = true;

            if (name == null || name.isEmpty()) {
                  result = false;
            }
            return result;
      }

      /**
       * This method validate if parkingLotType is null. If the parkingLotType
       * is neither null then the method will return TRUE else FALSE.
       *
       * @return Boolean, Validation Result
       */
      public boolean validateLotType() {
            boolean result = true;

            if (lotType == null) {
                  result = false;
            }
            return result;
      }

      @Override
      public String toString() {
            return "ParkingLot [id=" + id + ", name=" + name + ", address=" + address + ", discountStrategy" + parkingChargeStrategy + "]";
      }
}

