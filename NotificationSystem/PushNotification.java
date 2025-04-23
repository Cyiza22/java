package NotificationSystem;

public class PushNotification implements NotificationService{

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending push notification: " + message);
    }   
}
class EmailNotification implements NotificationService{
    public void sendNotification(String message) {
        System.out.println("Sending email notification to " + message);
    }
    

}
class SmsPushNotification implements NotificationService{
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
    
    
}