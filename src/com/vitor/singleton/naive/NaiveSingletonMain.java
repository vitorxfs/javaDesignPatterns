package com.vitor.singleton.naive;

public class NaiveSingletonMain {

    public static void main (String[] args){
        int testId = 1;

        NaiveSession session = NaiveSession.getSession(testId);
        NaiveSession tryAgainSession = NaiveSession.getSession(40);

        System.out.println("Should print 1 twice");
        System.out.println(session.getId());
        System.out.println(tryAgainSession.getId());
    }

}
