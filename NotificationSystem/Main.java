package NotificationSystem;

public class Main {
    public static void main(String[] args) {

        NotificationService pushNotification = new PushNotification();
        pushNotification.sendNotification("Hello World!");

        NotificationService emailNotification = new PushNotification();
        emailNotification.sendNotification( "Hello from Backend!");

        NotificationService smsNotification = new PushNotification();
        smsNotification.sendNotification("Hello from push!");
 
    }
    
}
