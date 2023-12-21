package User;

import Location.Location;
import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class User extends Location {
   public List<Vehicle> rentedVehicles = new ArrayList<Vehicle>();
   private String userName;

   User(){
      System.out.println("User Created...");
   }

   public User(String userName, String street, String city, String state, String country) {
      super(street, city, state, country);
      this.userName = userName;
   }

   public String getUserName() {
      return userName;
   }
}
