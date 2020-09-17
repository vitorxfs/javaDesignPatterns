package com.vitor.singleton.multithread;

public class MTSingletonMain {

    public static void main(String[] args){
        System.out.println("Should print 1 twice.");
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }

    static class Thread1 implements Runnable{
        @Override
        public void run() {
            MultiThreadSession session = MultiThreadSession.getSession(1);
            System.out.println(session.getId());
        }
    }
    static class Thread2 implements Runnable{
        @Override
        public void run() {
            MultiThreadSession session = MultiThreadSession.getSession(2);
            System.out.println(session.getId());
        }
    }
}
