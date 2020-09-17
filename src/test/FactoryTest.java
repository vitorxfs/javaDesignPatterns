package test;

import com.vitor.factory.*;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void shouldTestSMS(){
        String channel = "SMS";
        NotificationFactory notificationFactory = new SMSCreator();
        Notification notification = notificationFactory.createNotification();
        Assert.assertEquals(channel, notification.notifiesBy());
    }
    @Test
    public void shouldTestEmail(){
        String channel = "EMAIL";
        NotificationFactory notificationFactory = new EmailCreator();
        Notification notification = notificationFactory.createNotification();
        Assert.assertEquals("EMAIL", notification.notifiesBy());
    }

}
