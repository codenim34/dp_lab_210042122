// DriverController.java
package Controller;

import Model.Driver;
import View.DriverView;

public class DriverController {
    private Driver driver;
    private DriverView driverView;

    public DriverController(Driver driver, DriverView driverView) {
        this.driver = driver;
        this.driverView = driverView;
    }

    public void handleDriverActions() {
        boolean running = true;
        while (running) {
            int choice = driverView.showDriverMenu();
            switch (choice) {
                case 1:
                    updateLocation();
                    break;
                case 2:
                    acceptRide();
                    break;
                case 3:
                    startTrip();
                    break;
                case 4:
                    completeTrip();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void updateLocation() {
        String newLocation = driverView.getLocationUpdate();
        driver.setLocation(newLocation);
        System.out.println("Location updated to: " + newLocation);
    }

    private void acceptRide() {
        // Logic for accepting a ride
        System.out.println("Ride accepted.");
    }

    private void startTrip() {
        // Logic for starting a trip
        System.out.println("Trip started.");
    }

    private void completeTrip() {
        // Logic for completing a trip
        System.out.println("Trip completed.");
    }
}
