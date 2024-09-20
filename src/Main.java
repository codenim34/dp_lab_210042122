// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Main.java
import Model.*;
import Controller.*;
import View.*;
import Model.Rider;
import View.RiderView;
import Controller.RiderController;

public class Main {
    public static void main(String[] args) {
        // Create a Rider instance
        Rider rider = new Rider("1", "John Doe", "123-456-7890", "john@example.com", NotificationType.EMAIL, "Downtown", 4.5, null);

        // Create a RiderView instance
        RiderView riderView = new RiderView();

        // Create a RiderController instance
        RiderController riderController = new RiderController(rider, riderView);

        // Handle the ride request
        riderController.handleRideRequest();
    }
}

