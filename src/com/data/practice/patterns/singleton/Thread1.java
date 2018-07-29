package com.data.practice.patterns.singleton;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        MyClassSingleton myClassSingleton = MyClassSingleton.getInstance();
        System.out.println(myClassSingleton.hashCode());
    }
}
