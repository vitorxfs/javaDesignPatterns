package com.vitor.factory;

public class SMSCreator extends NotificationFactory {
    public Notification createNotification() {
        return new SMSNotification();
    }
}
