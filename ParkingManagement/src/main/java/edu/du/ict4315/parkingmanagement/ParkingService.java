/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement;

import java.util.Map;

/**
 *
 * @Date: 1/4/23
 * @author lutherchikumba
 *
 */
public class ParkingService {
    private ParkingOffice office;
    private Map<String, Command> commands;

      public ParkingService(ParkingOffice office, Map<String, Command> commands) {
          this.office = office;

          this.commands = commands;
      }

      public void register(Command command){

      }
      public String performCommand(String command, String [] commands){
          return null;
      }
}
