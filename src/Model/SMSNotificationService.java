package Model;

import Model.User;

public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("SMS sent to " + user.getPhoneNumber() + ": " + message);
        // Logic for sending an SMS notification
    }
}
