/**
 * @Course: ICT 4315
 * @Project: ParkingManagement
 * @Instructor: Mike Prasad
 */
package edu.du.ict4315.parkingmanagement.builder;

import edu.du.ict4315.parkingmanagement.Address;

/**
 * @author lutherchikumba
 * @Date: 1/24/23
 */
public class CustomerInfo {
      private final String id;
      private final String firstName;
      private final String lastName;
      private final String phoneNumber;
      private final Address address;

      private CustomerInfo(Builder builder) {
            this.id = builder.id;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.phoneNumber = builder.phoneNumber;
            this.address = builder.address;

      }
      public String getId() {
            return id;
      }

      public String getFirstName() {
            return firstName;
      }

      public String getLastName() {
            return lastName;
      }

      public String getPhoneNumber() {
            return phoneNumber;
      }

      public Address getAddress() {
            return address;
      }

      public static class Builder {
            private String id;
            private String firstName;
            private String lastName;
            private String phoneNumber;
            private Address address;

            public Builder id(String id) {
                  this.id = id;
                  return this;
            }

            public Builder firstName(String firstName) {
                  this.firstName = firstName;
                  return this;
            }

            public Builder lastName(String lastName) {
                  this.lastName = lastName;
                  return this;
            }

            public Builder phoneNumber(String phoneNumber) {
                  this.phoneNumber = phoneNumber;
                  return this;
            }

            public Builder address(Address address) {
                  this.address = address;
                  return this;
            }

            public CustomerInfo build() {
                  return new CustomerInfo(this);

            }
      }
}
