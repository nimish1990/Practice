package com.data.practice.patterns.singleton;

public class TestDoubleCheckedSingleton {

    public static void main(String args[]) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread3());

        thread1.start();
        thread2.start();
        thread3.start();
        MyClassSingleton myClassSingleton = MyClassSingleton.getInstance();
        System.out.println("main class: myClassSingleton " + myClassSingleton.hashCode());
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        System.out.println("main class: threadSafeSingleton " + threadSafeSingleton.hashCode());
        DoubleLockSingleton doubleLockSingleton = DoubleLockSingleton.getInstance();
        System.out.println("main class: doubleLockSingleton " + doubleLockSingleton.hashCode());

    }
}
