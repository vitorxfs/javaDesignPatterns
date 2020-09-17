package test;

import com.vitor.singleton.multithread.MultiThreadSession;
import com.vitor.singleton.naive.NaiveSession;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    private AssertionError exc;

    @Test
    public void shouldTestNaiveSingleton() throws Exception {
        int userId = 20;
        NaiveSession session = NaiveSession.getSession(userId);
        NaiveSession tryAgainSession = NaiveSession.getSession(40);

        Assert.assertEquals(userId, session.getId());
        Assert.assertEquals(userId, tryAgainSession.getId());
    }

    @Test
    public void shouldTestMultiThreadSingleton() throws Exception {
        int userId = 1;

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                MultiThreadSession session = MultiThreadSession.getSession(userId);
                try{
                    Assert.assertEquals(1, session.getId());
                } catch (AssertionError e){
                    exc = e;
                }

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                MultiThreadSession session = MultiThreadSession.getSession(2);
                try{
                    Assert.assertEquals(1, session.getId());
                } catch (AssertionError e){
                    exc = e;
                }
            }
        });

        exc = null;
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        if(exc != null){
            throw exc;
        }
    }
}
