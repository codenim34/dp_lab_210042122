package Model;

import Model.User;

public class InAppNotificationService implements NotificationService {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("In-app notification to " + user.getName() + ": " + message);
        // Logic for sending an in-app notification
    }
}
