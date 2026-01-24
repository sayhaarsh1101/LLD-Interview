package DesignPatterns.Factory.NotificationExample;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification with message: " + message);
    }
    
}
