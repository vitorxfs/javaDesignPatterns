package com.vitor.factory;

public class FactoryMain {
    public static void main (String[] args){
        NotificationFactory notificationFactory = new EmailCreator();
        Notification notification = notificationFactory.createNotification();
        notification.notifyUser();
    }
}
