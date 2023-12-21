package Vehicle;

import java.util.Locale;

public class VehicleFactory {
    // Factory Design Pattern
    public Vehicle createVehicle(String name, String type,float rentalFeePerHour, String street, String city, String state, String country){

        switch (type.toLowerCase()){
            case "car":
                return new Car(name, rentalFeePerHour, street, city, state, country);
            case "bike":
                return new Bike(name, rentalFeePerHour, street, city, state, country);
            default:
                throw new IllegalArgumentException("Invalid Vehicle Type "+type);
        }
    }

}
