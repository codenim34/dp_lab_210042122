package Model;

// Trip.java
public class Trip {
    private String id;
    private Rider rider;
    private Driver driver;
    private String pickupLocation;
    private String dropOffLocation;
    private RideType rideType;
    private String status;
    private double fare;
    private double distance;
    private Admin admin; // Admin associated with logging trips

    // Constructor
    public Trip(String id, Rider rider, String pickupLocation, String dropOffLocation, RideType rideType, Admin admin) {
        this.id = id;
        this.rider = rider;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.status = "Pending";
        this.admin = admin; // Assign admin to log the trip

        // Calculate distance (For now, we'll assume some calculation logic)
        this.distance = calculateDistance(pickupLocation, dropOffLocation);

        // Calculate fare based on ride type
        this.fare = calculateFare();
    }
    NotificationService notificationService;
    // Calculate fare based on distance and ride type
    private double calculateFare() {
        switch (rideType) {
            case CARPOOL:
                return distance * 1.0; // Carpool has a lower rate
            case LUXURY:
                return distance * 3.0; // Luxury ride has a higher rate
            case BIKE:
                return distance * 0.8; // Bike has the lowest rate
            default:
                return distance * 1.5; // Default fare rate
        }
    }

    // Stub for distance calculation logic
    private double calculateDistance(String pickupLocation, String dropOffLocation) {
        // For simplicity, we'll assume distance is some arbitrary value
        return Math.random() * 10; // Random distance for the example
    }

    // Assign a driver to the trip
    public void assignDriver(Driver driver) {
        this.driver = driver;
        this.status = "Driver Assigned";
        notificationService.sendNotification(rider, "Driver has been assigned for your trip.");
        notificationService.sendNotification(driver, "You have been assigned a new trip.");
    }

    // Start the trip
    public void startTrip() {
        if (driver != null) {
            this.status = "In Progress";
            notificationService.sendNotification(rider, "Your trip has started.");
            notificationService.sendNotification(driver, "Trip has started.");
        } else {
            System.out.println("Driver is not assigned yet.");
        }
    }

    // Complete the trip
    public void completeTrip() {
        this.status = "Completed";
        notificationService.sendNotification(rider, "Your trip is complete!");
        notificationService.sendNotification(driver, "Trip has been completed.");

        // Admin logs the trip
        admin.logTrip(this);
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public Rider getRider() {
        return rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public double getFare() {
        return fare;
    }

    public double getDistance() {
        return distance;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public RideType getRideType() {
        return rideType;
    }

    public String getStatus() {
        return status;
    }

    public Admin getAdmin() {
        return admin;
    }
}
