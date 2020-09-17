package com.vitor.singleton.multithread;

public class MultiThreadSession {
    // This class uses the Singleton Design Pattern.
    // This is used when it's needed to have a global and unique instance of a class.
    // The thread-safe version needs a double check lock (dcl)

    private static MultiThreadSession instance;
    private final int userId;

    private MultiThreadSession(int userId) {
        this.userId = userId;
    }

    public static MultiThreadSession getSession(int userId) {
        MultiThreadSession result = instance;
        if(result != null){
            return result;
        }
        synchronized (MultiThreadSession.class) {
            if(instance == null){
                instance = new MultiThreadSession(userId);
            }
            return instance;
        }

    }

    public int getId(){
        return this.userId;
    }
}