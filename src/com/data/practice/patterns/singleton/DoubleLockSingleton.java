package com.data.practice.patterns.singleton;

public class DoubleLockSingleton {
    public static volatile DoubleLockSingleton uniqueInstance;

    private int value;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getUniqueInstance() {
        return uniqueInstance;
    }

    public static DoubleLockSingleton getInstance() {

        if (uniqueInstance == null) {
            synchronized (DoubleLockSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleLockSingleton();
                }
            }
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
