package DesignPatterns.Factory.NotificationExample;

public class EmailNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
    
}
