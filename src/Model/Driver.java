package Model;

// Driver.java
public class Driver extends User {

    private String vehicleType;
    private String location;
    private double rating;
    private boolean availability;

    // Constructor fulfilling attributes from User class and adding Driver-specific attributes
    public Driver(String id, String name, String phoneNumber, String email,
                  NotificationService preferredNotificationType, String vehicleType,
                  String location, double rating, boolean availability) {
        // Call to the superclass (User) constructor
        super(id, name, phoneNumber, email, preferredNotificationType);

        // Initialize Driver-specific attributes
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = rating;
        this.availability = availability;
    }

    // Getters and setters for Driver-specific attributes
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
