package com.vitor.singleton.naive;

public class NaiveSession {
    // This class uses the Singleton Design Pattern.
    // This is used when it's needed to have a global and unique instance of a class.

    private static NaiveSession instance = null;
    private final int userId;

    private NaiveSession(int userId) {
        this.userId = userId;
    }

    public static NaiveSession getSession(int userId) {
        if(instance == null){
            instance = new NaiveSession(userId);
            return instance;
        }
        return instance;
    }

    public int getId(){
        return this.userId;
    }
}
