package View;

import Model.Admin;
import Model.Driver;
import Model.Rider;
import Model.Trip;

import java.util.Scanner;

public class AdminView {
    private Scanner scanner = new Scanner(System.in);

    // Displays the admin menu and returns the choice
    public int showAdminMenu(Admin admin) {
        System.out.println("Welcome, " + admin.getName() + "!");
        System.out.println("Admin Panel");
        System.out.println("1. Manage Drivers");
        System.out.println("2. Manage Riders");
        System.out.println("3. View Trip History");
        System.out.println("4. Handle Disputes");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // Menu for managing drivers
    public int showManageDriverMenu() {
        System.out.println("Manage Drivers:");
        System.out.println("1. Activate Driver");
        System.out.println("2. Deactivate Driver");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // Menu for managing riders
    public int showManageRiderMenu() {
        System.out.println("Manage Riders:");
        System.out.println("1. Activate Rider");
        System.out.println("2. Deactivate Rider");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // Get driver or rider name for management
    public String getNameForManagement(String entity) {
        System.out.print("Enter the " + entity + "'s name: ");
        return scanner.next();
    }

    // Display trip history
    public void displayTripHistory(Admin admin) {
        System.out.println("Viewing Trip History...");
        admin.viewTripHistory();
    }

    // Handle dispute input
    public String getDisputeDetails() {
        System.out.print("Enter dispute details: ");
        return scanner.next();
    }

    public void displayExitMessage() {
        System.out.println("Exiting Admin Panel...");
    }
}

