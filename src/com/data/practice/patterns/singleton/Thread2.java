package com.data.practice.patterns.singleton;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        MyClassSingleton myClassSingleton = MyClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " myClassSingleton: " + myClassSingleton.hashCode());

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " threadSafeSingleton: " + threadSafeSingleton.hashCode());

        DoubleLockSingleton doubleLockSingleton = DoubleLockSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " doubleLockSingleton: " + doubleLockSingleton.hashCode());

    }
}
