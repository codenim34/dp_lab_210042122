package View;

import Model.*;
import Model.RideType;

import java.util.Scanner;

public class RiderView {
    private Scanner scanner;

    public RiderView() {
        scanner = new Scanner(System.in);
    }

    // Display ride details
    public void displayRideDetails(String pickupLocation, String dropOffLocation, RideType rideType) {
        System.out.println("Ride requested from " + pickupLocation + " to " + dropOffLocation + " with ride type " + rideType + ".");
    }

    // Ask if rider wants to change the payment method


    // Show payment options and get the choice from the rider
    public int showPaymentOptions() {
        System.out.println("Select a Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Digital Wallet");
        return scanner.nextInt();
    }

    // Get Credit Card details from the rider
    public String getCreditCardInfo() {
        System.out.println("Enter Credit Card Number:");
        return scanner.next();
    }

    // Get PayPal details from the rider
    public String getPayPalEmail() {
        System.out.println("Enter PayPal Email:");
        return scanner.next();
    }

    // Get Digital Wallet details from the rider
    public String getWalletId() {
        System.out.println("Enter Wallet ID:");
        return scanner.next();
    }

    // Get pickup location from rider
    public String getPickupLocation() {
        System.out.println("Enter Pickup Location:");
        return scanner.nextLine();
    }

    // Get drop-off location from rider
    public String getDropOffLocation() {
        System.out.println("Enter Drop-Off Location:");
        return scanner.nextLine();
    }

    // Get preferred ride type from rider
    public RideType getRideType() {
        System.out.println("Select Ride Type:");
        System.out.println("1. CARPOOL");
        System.out.println("2. LUXURY");
        System.out.println("3. BIKE");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: return RideType.CARPOOL;
            case 2: return RideType.LUXURY;
            case 3: return RideType.BIKE;
            default:
                System.out.println("Invalid option, defaulting to CARPOOL.");
                return RideType.CARPOOL;
        }
    }

    public PaymentMethod getPreferredPaymentMethod() {
        System.out.println("Select a Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Digital Wallet");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = scanner.nextLine();
                return new CreditCardPayment(cardNumber);
            case 2:
                System.out.print("Enter PayPal Email: ");
                String email = scanner.nextLine();
                return new PayPalPayment(email);
            case 3:
                System.out.print("Enter Digital Wallet ID: ");
                String walletId = scanner.nextLine();
                return new DigitalWalletPayment(walletId);
            default:
                System.out.println("Invalid choice, defaulting to Credit Card.");
                return new CreditCardPayment("default-card");
        }
    }


    public boolean confirmOrChangePaymentMethod() {
        System.out.println("Do you want to change the current payment method?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return choice == 1;
    }
    // Display confirmation of payment
    public void displayPaymentConfirmation(double fare, String paymentMethod) {
        System.out.println("Payment of $" + fare + " made using " + paymentMethod + ".");
    }

    // Display rating confirmation
    public void displayRatingConfirmation(String driverName, double rating) {
        System.out.println("You rated driver " + driverName + " with " + rating + " stars.");
    }
}
