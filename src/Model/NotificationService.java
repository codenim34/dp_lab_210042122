package Model;

// NotificationService.java
// NotificationService.java
public class NotificationService {

    public static void sendNotification(User user, String message) {
        NotificationType preferredType = user.getPreferredNotificationType();

        switch (preferredType) {
            case SMS:
                sendSMS(user, message);
                break;
            case EMAIL:
                sendEmail(user, message);
                break;
            case IN_APP:
                sendInAppNotification(user, message);
                break;
            default:
                System.out.println("Unknown notification type for user: " + user.getName());
        }
    }

    private static void sendSMS(User user, String message) {
        System.out.println("Sending SMS to " + user.getPhoneNumber() + ": " + message);
        // Logic to send SMS using a service provider (e.g., Twilio, Nexmo)
    }

    private static void sendEmail(User user, String message) {
        System.out.println("Sending email to " + user.getEmail() + ": " + message);
        // Logic to send email using an email service provider (e.g., SendGrid, Amazon SES)
    }

    private static void sendInAppNotification(User user, String message) {
        System.out.println("Sending in-app notification to " + user.getName() + ": " + message);
        // Logic for showing in-app notifications
    }
}
