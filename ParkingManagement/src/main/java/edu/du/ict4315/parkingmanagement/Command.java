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

      String getCommandName();
      String getDisplayName();
      String execute(Properties params);
}
