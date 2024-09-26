// AdminController.java
package Controller;

import Model.Admin;
import Model.Driver;
import Model.Rider;
import Model.Trip;
import View.AdminView;

public class AdminController {
    private Admin admin;
    private AdminView adminView;
    private Driver driver;

    private Rider rider;

    public AdminController(Admin admin, AdminView adminView, Driver driver,Rider rider) {
        this.admin = admin;
        this.adminView = adminView;
        this.driver=driver;
        this.rider=rider;
    }

    public void handleAdminActions() {
        boolean running = true;
        while (running) {
            int choice = adminView.showAdminMenu(admin);
            switch (choice) {
                case 1:
                    manageDrivers();
                    break;
                case 2:
                    manageRiders();
                    break;
                case 3:
                    viewTripHistory();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to manage drivers
    private void manageDrivers() {
        int choice = adminView.showManageDriverMenu();
        String driverName = adminView.getNameForManagement("Driver");

        // Simulate looking up driver by name

        boolean activate = (choice == 1);
        admin.manageDriver(driver, activate);
    }

    // Method to manage riders
    private void manageRiders() {
        int choice = adminView.showManageRiderMenu();
        String riderName = adminView.getNameForManagement("Rider");

        // Simulate looking up rider by name

        boolean activate = (choice == 1);
        admin.manageRider(rider, activate);
    }

    // Method to view trip history
    private void viewTripHistory() {
        admin.viewTripHistory();
    }

    // Method to handle disputes
//    private void handleDisputes() {
//        String tripId = adminView.getNameForManagement("Trip ID");
//        String disputeDetails = adminView.getDisputeDetails();
//
//        // Normally, you'd look up the trip by ID
//
//        admin.handleDispute(trip, disputeDetails);
//    }
}
