import java.util.Scanner;

import Model.*;
import View.RiderView;
import View.DriverView;
import View.AdminView;
import Controller.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailNotificationService emailNotificationService= new EmailNotificationService();
        InAppNotificationService inAppNotificationService= new InAppNotificationService();
        SMSNotificationService smsNotificationService = new SMSNotificationService();


        // Create initial objects for Rider, Driver, and Admin
        Rider rider = new Rider("1", "John Doe", "123-456-7890", "john@example.com",  emailNotificationService, "Downtown", 4.5, null);
        Driver driver = new Driver("2", "Jane Smith", "987-654-3210", "jane@example.com", smsNotificationService, "SUV", "Uptown", 4.8, true);
        Admin admin = new Admin("admin1", "Admin User", "Administrator");

        // Display the main menu to choose between Rider, Driver, and Admin
        while (true) {
            System.out.println("Welcome to the Ride-Sharing System");
            System.out.println("Please select your role:");
            System.out.println("1. Rider");
            System.out.println("2. Driver");
            System.out.println("3. Admin");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Initialize the Rider view and controller
                    RiderView riderView = new RiderView();
                    RiderController riderController = new RiderController(rider, riderView);
                    riderController.handleRideRequest();
                    break;

                case 2:
                    // Initialize the Driver view and controller
                    DriverView driverView = new DriverView();
                    DriverController driverController = new DriverController(driver, driverView);
                    driverController.handleDriverActions();  // Replace this with the appropriate method for the driver functionality
                    break;

                case 3:
                    // Initialize the Admin view and controller
                    AdminView adminView = new AdminView();
                    AdminController adminController = new AdminController(admin, adminView,driver,rider);
                    adminController.handleAdminActions();  // Replace this with the appropriate method for admin functionality
                    break;

                case 4:
                    System.out.println("Thank you for using the Ride-Sharing System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
