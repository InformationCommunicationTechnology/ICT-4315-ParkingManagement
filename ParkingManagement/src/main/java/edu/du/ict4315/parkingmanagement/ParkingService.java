/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lutherchikumba
 * @Date: 1/4/23
 */
public class ParkingService {
      private ParkingOffice office;
      private Map<String, Command> commands;
      RegisterCarCommand registerCarCommand = new RegisterCarCommand();
      RegisterCustomerCommand registerCustomerCommand = new RegisterCustomerCommand();

      /**
       * @param office
       * @param commands
       */
      public ParkingService() {
            this.office = new ParkingOffice();
            office.setParkingOfficeName("DU");
            office.setParkingOfficeAddress(new Address());
            this.commands = new HashMap<>();

      }

      /**
       * @param command
       */
      private void register(Command command) {
            commands.put(command.getCommandName(), command);

      }

      /**
       * @param command
       */

      /**
       * @param command
       * @param commands
       * @return
       */
      public String performCommand(String command, String[] commands) {

            for (String comm: commands) {
                  if(comm.equals(command)){
                        return comm;
                  }
            }
            throw new IllegalArgumentException("Cannot perform command");
      }

}
