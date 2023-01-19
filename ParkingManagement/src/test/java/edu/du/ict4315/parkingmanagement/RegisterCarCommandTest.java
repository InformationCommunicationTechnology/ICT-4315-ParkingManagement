package edu.du.ict4315.parkingmanagement; /**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 1/8/23
 * @author lutherchikumba
 *
 */
public class RegisterCarCommandTest {
    private RegisterCarCommand registerCarCommand;

      public RegisterCarCommandTest() {
        registerCarCommand = new RegisterCarCommand();
      }

      @Test
      public void getOffice() {
          assertEquals("DU",registerCarCommand.getOffice().getParkingOfficeName());
          assertEquals(new Address("4581 S Valdai Way", "", "Aurora", "CO", "80016").getAddressInfo(),registerCarCommand.getOffice().getParkingOfficeAddress().getAddressInfo());
      }

      @Test
      public void setOffice() {
            ParkingOffice parkingOffice = new ParkingOffice();
      }

      @Test
      public void setDisplayName() {
            registerCarCommand.setDisplayName("Car Command");
            assertEquals("Car Command", registerCarCommand.getDisplayName());

      }

      @Test
      public void checkParameters() {
      }

      @Test
      public void execute() {
      }

      @Test
      public void getDisplayName() {
          assertEquals("RegisterCarName",registerCarCommand.getDisplayName());
      }

      @Test
      public void getCommand() {
      }

      @Test
      public void setCommand() {

      }

      @Test
      public void getCommandName() {
            assertEquals("RegisterCarName",registerCarCommand.getCommandName());
      }

      @Test
      public void setCommandName() {
            registerCarCommand.setCommandName("RegisterCarCommand");
            assertEquals("RegisterCarCommand", registerCarCommand.getCommandName());
      }
}