// DriverView.java
package View;

import java.util.Scanner;

public class DriverView {
    private Scanner scanner;

    public DriverView() {
        scanner = new Scanner(System.in);
    }

    // Display the driver menu and get the driver's choice
    public int showDriverMenu() {
        System.out.println("\nDriver Menu:");
        System.out.println("1. Update Location");
        System.out.println("2. Accept Ride");
        System.out.println("3. Start Trip");
        System.out.println("4. Complete Trip");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        return choice;
    }

    // Prompt the driver to enter a new location
    public String getLocationUpdate() {
        System.out.print("Enter your new location: ");
        return scanner.nextLine();
    }

    // Show a message to the driver
    public void showMessage(String message) {
        System.out.println(message);
    }
}
