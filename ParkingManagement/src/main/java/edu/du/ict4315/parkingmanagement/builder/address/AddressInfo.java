/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.builder.address;

/**
 * @author lutherchikumba
 * @Date: 1/24/23
 */
public class AddressInfo {

      private String street1;
      private String street2;
      private String city;
      private String state;
      private String zip;

      private AddressInfo(Builder builder) {
            this.street1 = builder.street1;
            this.street2 = builder.street2;
            this.city = builder.city;
            this.state = builder.state;
            this.zip = builder.zip;

      }

      public String getStreet1() {
            return street1;
      }

      public String getStreet2() {
            return street2;
      }

      public String getCity() {
            return city;
      }

      public String getState() {
            return state;
      }

      public String getZip() {
            return zip;
      }

      public static class Builder {
            private String street1;
            private String street2;
            private String city;
            private String state;
            private String zip;

            public Builder street1(String street1) {
                  this.street1 = street1;
                  return this;
            }

            public Builder street2(String street2) {
                  this.street2 = street2;
                  return this;
            }

            public Builder city(String city) {
                  this.city = city;
                  return this;
            }

            public  Builder state(String state){
                  this.state = state;
                  return this;
            }

            public Builder zip(String zip) {
                  this.zip = zip;
                  return this;
            }

            public AddressInfo build() {
                  return new AddressInfo(this);
            }
      }
}
