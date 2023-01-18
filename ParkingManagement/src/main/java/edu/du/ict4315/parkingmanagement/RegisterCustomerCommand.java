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
public class RegisterCustomerCommand {
    private ParkingOffice office;

      public RegisterCustomerCommand(ParkingOffice office) {

          this.office = office;
      }
    public void checkParameters(Properties properties){

    }
    public String execute (Properties properties){
        return null;
    }
    public  String getCommandName(){
        return null;
    }
    public String getDisplayName(){
        return null;
    }
}
