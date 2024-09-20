package Model;

// User.java
public class User {
    private String id;
    private String name;
    private String phoneNumber;
    private String email;
    private NotificationType preferredNotificationType;

    public User(String id, String name, String phoneNumber, String email, NotificationType preferredNotificationType) {
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

    public NotificationType getPreferredNotificationType() {
        return preferredNotificationType;
    }

    public void setPreferredNotificationType(NotificationType preferredNotificationType) {
        this.preferredNotificationType = preferredNotificationType;
    }
}
