package com.vitor.factory;

public class EmailCreator extends NotificationFactory {
    public Notification createNotification() {
        return new EmailNotification();
    }
}
