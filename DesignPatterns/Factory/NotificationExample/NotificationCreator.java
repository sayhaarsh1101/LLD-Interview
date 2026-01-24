package DesignPatterns.Factory.NotificationExample;

abstract class NotificationCreator {

    public abstract Notification createNotification();

    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
    
}
