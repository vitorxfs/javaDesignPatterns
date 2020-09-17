package com.vitor.factory;

public class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
    public String notifiesBy(){
        return "EMAIL";
    }
}
