package Location;

public class Location {

    // Do not Repeat Yourself (DRY principle)
    // Single Respomsibility Principle
    private String street;
    private String city;
   private String state;
    private String country;

    public Location() {
        System.out.println("Location is Created...");
    }

    // set vehicle location
    public Location (String street, String city, String state, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    // get vehicle location
    public String getLocation() {
        return (street+","+city+","+state+","+country);
    }
    public String getCompareLocation() {
        return (city+","+state+","+country);
    }
}
