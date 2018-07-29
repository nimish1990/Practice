package com.data.practice.patterns.singleton;

public class MyClassSingleton {
    public static MyClassSingleton uniqueInstance;

    private int value;

    private MyClassSingleton() {
    }

    public static MyClassSingleton getUniqueInstance() {
        return uniqueInstance;
    }

    public static MyClassSingleton getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new MyClassSingleton();
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

