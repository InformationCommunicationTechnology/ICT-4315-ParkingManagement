package edu.du.ict4315.parkingmanagement;

import edu.du.ict4315.parkingmanagement.iterator.Data;
import edu.du.ict4315.parkingmanagement.iterator.NumberStringIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
      }
}