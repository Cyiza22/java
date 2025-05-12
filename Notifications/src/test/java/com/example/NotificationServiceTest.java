package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.anyString;


public class NotificationServiceTest {

    private MessageSender mockSender;
    private NotificationService service;

    @BeforeEach
    void setUp() {
        //  mock(): create mock object
        mockSender = mock(MessageSender.class);
        service = new NotificationService(mockSender);
    }

    @Test
    void testNotifyUser_withValidMessage() {
        //  doNothing(): do nothing when send() is called (default for void methods)
        doNothing().when(mockSender).send("Hello!");

        // Call the method under test
       String result = service.notifyUser("Hello!");
        //String result = service.notifyUser("");

        //  verify(): check if send() was called with correct argument
        verify(mockSender).send("Hello!");

        // Assert result
        assert result.equals("Notification sent!");
    }

    @Test
    void testNotifyUser_withEmptyMessage() {
        String result = service.notifyUser("");

        // verify(): ensure send() was **never** called
        verify(mockSender, never()).send(anyString());

        assert result.equals("Message is empty!");
    }

    @Test
    void testWithWhenThenReturn() {
        // when().thenReturn(): stub a method that returns a value (e.g., in an extended example)
        // Let's assume we had a method like: mockSender.getType() -> "SMS"
        MessageSenderWithType senderWithReturn = mock(MessageSenderWithType.class);

        when(((MessageSenderWithType)senderWithReturn).getType()).thenReturn("SMS");

        assert ((MessageSenderWithType)senderWithReturn).getType().equals("SMS");

        // verify() still works here
        verify(senderWithReturn).getType();
    }

    // Extra interface to show return example
    interface MessageSenderWithType extends MessageSender {
        String getType();
    }
}
