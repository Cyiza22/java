package com.example;

public class NotificationService implements MessageSender {
    @Override
    public String send(String message) {
        return message;
    }

    private final MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public String notifyUser(String message) {
        if (message == null || message.isEmpty()) {
            return "Message is empty!";
        }
        sender.send(message);
        return "Notification sent!";
    }
}
