package edu.du.ict4315.parkingmanagement.iterator; /**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 2/1/23
 * @author lutherchikumba
 *
 */
public class NumberStringIteratorTest {
    private NumberStringIterator numberStringIterator;

      public NumberStringIteratorTest() {
          String[ ] originalData = { "one", "two", "three", "four", "five" };
          List<String> strings = new ArrayList<>(Arrays.asList(originalData));
          numberStringIterator = new NumberStringIterator(new Data(originalData,strings));
      }

      @Test
      public void hasNext() {
          String[ ] originalData = { "one", "two", "three", "four", "five" };
          List<String> strings = new ArrayList<>(Arrays.asList(originalData));
//          while (!numberStringIterator.hasNext()){
//              numberStringIterator.current();
          System.err.print(numberStringIterator.hasNext());
          assertTrue(numberStringIterator.hasNext());
//          }
      }

      @Test
      public void next() {
      }

      @Test
      public void current() {
          assertEquals("one",numberStringIterator.current());
      }
}