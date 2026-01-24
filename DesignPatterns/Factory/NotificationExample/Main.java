package DesignPatterns.Factory.NotificationExample;

public class Main {
    public static void main(String[] args) {
        NotificationCreator creator;

        // Create and send Email Notification
        creator = new EmailNotificationCreator();
        creator.sendNotification("Hello via Email!");

        // Create and send SMS Notification
        creator = new SmsNotificationCreator();
        creator.sendNotification("Hello via SMS!");
    }
    
}
