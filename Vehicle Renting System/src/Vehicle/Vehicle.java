package Vehicle;

public interface Vehicle {
    // return vehicle name
    String getName();
    // return fee
    float rentalFee();
    // return true if vehicle is rented else false
    boolean isRented();
    // set vehicle rented or not
    void setRented(boolean rented);
    // set time the vehicle is rented by user
    void setRentalTime(float rentalTime);
    //get time the vehicle is rented;
    float getRentalTime();
    // get vehicle type
    String getType();
    public String getCompareLocation();
}
