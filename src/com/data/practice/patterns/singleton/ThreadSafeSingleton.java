package com.data.practice.patterns.singleton;

public class ThreadSafeSingleton {

    public static ThreadSafeSingleton uniqueInstance;

    private int value;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getUniqueInstance() {
        return uniqueInstance;
    }

    public static synchronized ThreadSafeSingleton getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new ThreadSafeSingleton();
        }
        return uniqueInstance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
