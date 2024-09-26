package Model;
// EmailNotificationService.java


import Model.User;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Email sent to " + user.getEmail() + ": " + message);
        // Logic for sending an email notification
    }
}
