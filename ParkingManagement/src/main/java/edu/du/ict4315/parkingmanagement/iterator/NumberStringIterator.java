/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.iterator;

/**
 *
 * @Date: 2/1/23
 * @author lutherchikumba
 *
 */
public class NumberStringIterator implements INumberIterator {
      private Data data;
      private int index;

      public NumberStringIterator(Data data) {
            this.data = data;
            index = 0;
      }

      @Override
      public boolean hasNext() {
            return this.index < data.getOriginalData().length;
      }

      @Override
      public void next() {
            this.index += 1;
      }

      @Override
      public String current() {
            return this.data.getStrings().get(index);
      }
}
