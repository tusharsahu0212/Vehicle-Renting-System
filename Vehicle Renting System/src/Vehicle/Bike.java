package Vehicle;

import Location.Location;

public class Bike extends Location implements Vehicle{

    // Encapsulate attributes (Encapsulation)
    private float rentalFeePerHour;
    private float rentalTime;
    private boolean isRented;
    private String type = "Bike";
    private String name;

    Bike(){
        super();
        System.out.println("Bike is Created...");
    }

    Bike(String name, float rentalFeePerHour, String street, String city, String state, String country) {
        super(street, city, state, country);
        setRented(false);
        setRentalTime(0);
        this.rentalFeePerHour = rentalFeePerHour;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float rentalFee() {
        return getRentalTime()*rentalFeePerHour;
    }

    @Override
    public boolean isRented() {
        return isRented;
    }

    @Override
    public void setRented(boolean rented) {
        this.isRented = rented;
    }

    @Override
    public float getRentalTime() {
        return rentalTime;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setRentalTime(float rentalTime) {
        this.rentalTime = rentalTime;
    }
}
