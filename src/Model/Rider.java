package Model;

// Rider.java
public class Rider extends User {

    private String location;
    private double rating;
    private PaymentMethod preferredPaymentMethod;

    // Constructor fulfilling attributes from User class and adding Rider-specific attributes
    public Rider(String id, String name, String phoneNumber, String email,
                 NotificationType preferredNotificationType, String location,
                 double rating, PaymentMethod preferredPaymentMethod) {
        // Call to the superclass (User) constructor
        super(id, name, phoneNumber, email, preferredNotificationType);

        // Initialize Rider-specific attributes
        this.location = location;
        this.rating = rating;
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    // Business logic for requesting a ride
    public void requestRide(String pickupLocation, String dropOffLocation, RideType rideType) {
        // Business logic for requesting a ride
        System.out.println(getName() + " requested a " + rideType + " from " + pickupLocation + " to " + dropOffLocation);
        // Actual ride-request logic would go here
    }

    // Method for rating a driver
    public void rateDriver(Driver driver, double rating) {
        driver.setRating(rating); // Update driver's rating
        System.out.println(getName() + " rated driver " + driver.getName() + " with a " + rating + " star rating.");
    }

    // Method to set a new payment strategy dynamically
    public void setPreferredPaymentMethod(PaymentMethod preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    // Payment method for completing a trip
    public void makePayment(Trip trip) {
        preferredPaymentMethod.processPayment(trip.getFare());
        System.out.println("Payment of " + trip.getFare() + " made by " + getName() + " using " + preferredPaymentMethod.getClass().getSimpleName());
    }

    // Getters and setters for Rider-specific attributes
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

    public PaymentMethod getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }


}
