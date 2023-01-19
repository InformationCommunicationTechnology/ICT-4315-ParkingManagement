/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement;

import java.util.Properties;

/**
 *
 * @Date: 1/8/23
 * @author lutherchikumba
 *
 */
public class RegisterCustomerCommand implements Command {

      private ParkingOffice office;
      private String displayName;
      private String commandName;
      private Command command;

      public RegisterCustomerCommand() {

            this.office = new ParkingOffice();
            office.setParkingOfficeAddress(new Address("4581 S Valdai Way", "", "Aurora", "CO", "80016"));
            office.setParkingOfficeName("DU");
            this.displayName = "CustomerCommand";
            this.commandName = "CommandCustomer";
      }
      public ParkingOffice getOffice() {
            return office;
      }

      public void setOffice(ParkingOffice office) {
            this.office = office;
      }

      public String getDisplayName() {
            return displayName;
      }

      public void setDisplayName(String displayName) {
            this.displayName = displayName;
      }

      public String getCommandName() {
            return commandName;
      }

      public void setCommandName(String commandName) {
            this.commandName = commandName;
      }

      public Command getCommand() {
            return command;
      }

      public void setCommand(Command command) {
            this.command = command;
      }
      public void checkParameters(Properties properties){

      }

      public String execute(Properties properties){
            return null;
      }

}
