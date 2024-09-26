package Model;

// User.java
public class User {
    private String id;
    private String name;
    private String phoneNumber;
    private String email;
    private NotificationService preferredNotificationType;

    public User(String id, String name, String phoneNumber, String email, NotificationService preferredNotificationType) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.preferredNotificationType = preferredNotificationType;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public NotificationService getPreferredNotificationType() {
        return preferredNotificationType;
    }

    public void setPreferredNotificationType(NotificationService preferredNotificationType) {
        this.preferredNotificationType = preferredNotificationType;
    }
}
