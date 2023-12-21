package Registration;

import Vehicle.Vehicle;

import User.User;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Single Responsibility Principle
public class Registeration {

    private static LocalDateTime startingTime, endingTime;

    // Dependency Inversion Principle
    // assign vehicle to a user
    public static void assignVehicle(User user, Vehicle vehicle){

        if(vehicle.isRented()){
            System.out.println("Vehicle is already rented..");
            return;
        }

        if(!(user.getCompareLocation().toLowerCase().equals(vehicle.getCompareLocation().toLowerCase()))){
            System.out.println("Vehicle not in range!");
            return;
        }

        startingTime = LocalDateTime.now();
        user.rentedVehicles.add(vehicle);
        vehicle.setRented(true);

        System.out.println(vehicle.getName()+" is assigned to "+user.getUserName());
        return;
    }

    // take back vehicle to user
    public static void disChargevhicle(User user, Vehicle vehicle){

        if(!(vehicle.isRented())){
            System.out.println("Vehicle Not rented yet rented..");
            return;
        }

        boolean isRentedByUser = false;
        // Liskov Substitution Principle
        for(Vehicle v: user.rentedVehicles){
            if(vehicle==v) isRentedByUser = true;
        }

        if(!isRentedByUser){
            System.out.println("Vehicle is assigned to other not you.");
            return;
        }

        endingTime = LocalDateTime.now();
        user.rentedVehicles.remove(vehicle);
        vehicle.setRented(false);
        float hoursDifference = ChronoUnit.SECONDS.between(startingTime, endingTime);
        vehicle.setRentalTime(hoursDifference);
        System.out.println(user.getUserName()+" pays "+vehicle.rentalFee()+" Rs. for "+vehicle.getName());
        return;
    }

}
