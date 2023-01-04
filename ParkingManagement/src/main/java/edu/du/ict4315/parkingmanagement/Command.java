/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement;

import java.util.Properties;

/**
 *
 * @Date: 1/4/23
 * @author lutherchikumba
 *
 */
public interface Command {

      public default String execute(Properties properties){
            return null;
      }
      public default String getCommandName(){
            return null;
      }
      public default String getDisplayName(){
            return null;
      }
}
