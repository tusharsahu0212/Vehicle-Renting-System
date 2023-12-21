import Registration.Registeration;
import User.User;
import Vehicle.Vehicle;
import Vehicle.VehicleFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Aman","Sangam Chowk","Durg","Chhattisgarh","India");
        User user2 = new User("Raman","MG Road","Bengaluru","Karnataka","India");

        VehicleFactory vehicleFactory = new VehicleFactory();
        // In range (in same city,state,country)
        Vehicle bike1 = vehicleFactory.createVehicle("Honda","Bike",50,"RamNagar","Durg","Chhattisgarh","India");
        Vehicle car1 = vehicleFactory.createVehicle("Tesla","Car",500,"Bannerghatta Road","Bengaluru","Karnataka","India");

        // Not in range (in different city,state,country)
        Vehicle bike2 = vehicleFactory.createVehicle("Splender","Bike",60,"Jindal Road","Raipur","Chhattisgarh","India");
        Vehicle car2 = vehicleFactory.createVehicle("BMW","Car",600,"Adarsh Nagar","Hyderabad","Telangana","India");

        // trying to return vehicle before rented
        Registeration.disChargevhicle(user1,bike1);

        Registeration.assignVehicle(user1,bike1);
        Registeration.assignVehicle(user2,car1);
        Registeration.assignVehicle(user1,bike2);
        Registeration.assignVehicle(user1,car2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("In my world time is too mush precious, here 1 seconds equivalent to 1 hour");
        System.out.println("Press any key and Enter to return bike.");
        String temp = scanner.next();
        Registeration.disChargevhicle(user1,bike1);
        // trying to return vehicle which is not assigned to that user
        Registeration.disChargevhicle(user1,car1);
    }
}