/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.iterator;

import java.util.List;

/**
 *
 * @Date: 2/1/23
 * @author lutherchikumba
 *
 */
public class Data implements INumber{

      private String[ ] originalData;
      private List<String> strings;

      public Data(String[] originalData, List<String> strings) {
            this.originalData = originalData;
            this.strings = strings;
      }
      public String[] getOriginalData() {
            return originalData;
      }

      public void setOriginalData(String[] originalData) {
            this.originalData = originalData;
      }

      public List<String> getStrings() {
            return strings;
      }

      public void setStrings(List<String> strings) {
            this.strings = strings;
      }

      @Override
      public INumberIterator getIterator() {
            return new NumberStringIterator(this);
      }
}
