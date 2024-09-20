package Controller;

import Model.Rider;
import Model.*;
import Model.PaymentMethod;
import View.RiderView;

public class RiderController {
    private Rider rider;
    private RiderView riderView;

    public RiderController(Rider rider, RiderView riderView) {
        this.rider = rider;
        this.riderView = riderView;
    }

    public void handleRideRequest() {
        String pickupLocation = riderView.getPickupLocation();
        String dropOffLocation = riderView.getDropOffLocation();

        // Get the preferred payment method from the rider
        PaymentMethod preferredPaymentMethod = riderView.getPreferredPaymentMethod();
        rider.setPreferredPaymentMethod(preferredPaymentMethod);  // Set preferred payment method

        // Request ride
        rider.requestRide(pickupLocation, dropOffLocation, RideType.CARPOOL);  // Example ride type

        // After booking confirmation, check if the rider wants to change payment method
        boolean changePaymentMethod = riderView.confirmOrChangePaymentMethod();
        if (changePaymentMethod) {
            int paymentChoice = riderView.showPaymentOptions();
            switch (paymentChoice) {
                case 1:
                    String creditCardNumber = riderView.getCreditCardInfo();
                    rider.setPreferredPaymentMethod(new CreditCardPayment(creditCardNumber));
                    break;
                case 2:
                    String paypalEmail = riderView.getPayPalEmail();
                    rider.setPreferredPaymentMethod(new PayPalPayment(paypalEmail));
                    break;
                case 3:
                    String walletId = riderView.getWalletId();
                    rider.setPreferredPaymentMethod(new DigitalWalletPayment(walletId));
                    break;
                default:
                    System.out.println("Invalid payment option selected. Defaulting to Credit Card.");
                    rider.setPreferredPaymentMethod(new CreditCardPayment("default-card"));
            }
        }

        // Proceed to payment with the selected payment method
        Trip trip = new Trip("trip001", rider, pickupLocation, dropOffLocation, RideType.CARPOOL, null);
        rider.makePayment(trip);

        // Display payment confirmation
        riderView.displayPaymentConfirmation(trip.getFare(), rider.getPreferredPaymentMethod().getClass().getSimpleName());

        // Example of rating the driver
        //rider.rateDriver(new Driver("Jane Smith"), 5.0);
        //riderView.displayRatingConfirmation("Jane Smith", 5.0);
    }
}
