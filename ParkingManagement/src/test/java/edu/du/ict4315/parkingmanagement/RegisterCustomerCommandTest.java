package edu.du.ict4315.parkingmanagement; /**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */

import edu.du.ict4315.parkingmanagement.builder.AddressInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @Date: 1/8/23
 * @author lutherchikumba
 *
 */
public class RegisterCustomerCommandTest {
    RegisterCustomerCommand registerCustomerCommand;

      public RegisterCustomerCommandTest() {
          registerCustomerCommand = new RegisterCustomerCommand();
      }

    @Test
    public void getOffice() {
        AddressInfo addressInfo = new AddressInfo.Builder()
                .street1("525 W Burgundy Street")
                .street2("Unit 622")
                .city("Highlands Ranch")
                .state("CO")
                .zip("80129")
                .build();
        assertEquals("DU",registerCustomerCommand.getOffice().getParkingOfficeName());
        assertEquals(new Address(addressInfo).getAddressInfo(),registerCustomerCommand.getOffice().getParkingOfficeAddress().getAddressInfo());
    }

    @Test
    public void setOffice() {
        ParkingOffice parkingOffice = new ParkingOffice();
    }

    @Test
    public void setDisplayName() {
        registerCustomerCommand.setDisplayName("CustomerInfo Command");
        assertEquals("CustomerInfo Command", registerCustomerCommand.getDisplayName());

    }

    @Test
    public void checkParameters() {
    }

    @Test
    public void execute() {
    }

    @Test
    public void getDisplayName() {
        assertEquals("RegisterCustomerName",registerCustomerCommand.getDisplayName());
    }

    @Test
    public void getCommand() {
    }

    @Test
    public void setCommand() {

    }

    @Test
    public void getCommandName() {
        assertEquals("RegisterCustomerName",registerCustomerCommand.getCommandName());
    }

    @Test
    public void setCommandName() {
        registerCustomerCommand.setCommandName("registerCustomerCommand");
        assertEquals("registerCustomerCommand", registerCustomerCommand.getCommandName());
    }
}