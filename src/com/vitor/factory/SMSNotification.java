package com.vitor.factory;

public class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
    public String notifiesBy(){
        return "SMS";
    }
}
