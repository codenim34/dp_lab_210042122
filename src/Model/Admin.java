package Model;

// Admin.java
import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String id;
    private String name;
    private String role;

    private List<Driver> drivers;
    private List<Rider> riders;
    private List<Trip> tripHistory;

    public Admin(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.drivers = new ArrayList<>();
        this.riders = new ArrayList<>();
        this.tripHistory = new ArrayList<>();
    }

    // Admin manages drivers: add, deactivate, or update driver status
    public void manageDriver(Driver driver, boolean activate) {
        if (activate) {
            if (!drivers.contains(driver)) {
                drivers.add(driver);
                System.out.println("Driver " + driver.getName() + " has been activated.");
            }
        } else {
            drivers.remove(driver);
            System.out.println("Driver " + driver.getName() + " has been deactivated.");
        }
    }

    // Admin manages riders: add or deactivate riders
    public void manageRider(Rider rider, boolean activate) {
        if (activate) {
            if (!riders.contains(rider)) {
                riders.add(rider);
                System.out.println("Rider " + rider.getName() + " has been activated.");
            }
        } else {
            riders.remove(rider);
            System.out.println("Rider " + rider.getName() + " has been deactivated.");
        }
    }

    // Admin views the history of all trips
    public void viewTripHistory() {
        if (tripHistory.isEmpty()) {
            System.out.println("No trip history available.");
        } else {
            for (Trip trip : tripHistory) {
                System.out.println("Trip ID: " + trip.getId() + ", Rider: " + trip.getRider().getName() +
                        ", Driver: " + trip.getDriver().getName() + ", Fare: $" + trip.getFare());
            }
        }
    }

    // Admin handles disputes between drivers and riders
    public void handleDispute(Trip trip, String disputeDetails) {
        System.out.println("Handling dispute for Trip ID: " + trip.getId());
        System.out.println("Dispute Details: " + disputeDetails);
        // Logic for dispute resolution
    }

    // Method to log a completed trip into the trip history
    public void logTrip(Trip trip) {
        tripHistory.add(trip);
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }


    public String getRole() {
        return role;
    }
}
