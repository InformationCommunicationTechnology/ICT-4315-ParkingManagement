package edu.du.ict4315.parkingmanagement;

import edu.du.ict4315.parkingmanagement.charges.decorator.CompactCarDiscountDecorator;
import edu.du.ict4315.parkingmanagement.charges.decorator.FlatRateCalculator;
import edu.du.ict4315.parkingmanagement.charges.decorator.ParkingChargeCalculator;
import edu.du.ict4315.parkingmanagement.iterator.Data;
import edu.du.ict4315.parkingmanagement.iterator.NumberStringIterator;

import java.util.*;

public class Main {
      public static void main(String[] args) {
            System.out.println("Hello world!");
            String[ ] originalData = { "one", "two", "three", "four", "five" };
            List<String> strings = new ArrayList<>(Arrays.asList(originalData));
            NumberStringIterator numberStringIterator = new NumberStringIterator(new Data(originalData,strings));
            Iterator<String>iteratorString = strings.iterator();
            Iterator<String>iteratorOriginalData = strings.iterator();
            System.out.println(iteratorString.next());
            System.out.println(iteratorOriginalData.next());
            System.out.println(numberStringIterator);
            double amount = 40;
            ParkingChargeCalculator parkingChargeCalculator = new ParkingChargeCalculator() {
                  @Override
                  public Money getParkingCharge(Calendar entryTime, Calendar exitTime, ParkingLot parkingLot, ParkingPermit parkingPermit) {
                        return new Money(amount,"$");
                  }
            };
            ParkingChargeCalculator compactCarDiscount = new CompactCarDiscountDecorator(parkingChargeCalculator,20,new Money(40.0,"$"));
            ParkingChargeCalculator flateRate = new FlatRateCalculator(parkingChargeCalculator, new Money(40.0,"$"));
            System.out.println(compactCarDiscount.getParkingCharge(Calendar.getInstance(),Calendar.getInstance(),new ParkingLot(),new ParkingPermit( "id", new Vehicle(), Calendar.getInstance(), Calendar.getInstance())));
            System.out.println(flateRate.getParkingCharge(Calendar.getInstance(),Calendar.getInstance(),new ParkingLot(),new ParkingPermit( "id", new Vehicle(), Calendar.getInstance(), Calendar.getInstance())));

      }
}