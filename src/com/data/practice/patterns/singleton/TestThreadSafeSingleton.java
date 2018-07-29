package com.data.practice.patterns.singleton;

public class TestThreadSafeSingleton {

    public static void main(String args[]) {
       /* MyClassSingleton singleton1= MyClassSingleton.getInstance();

        MyClassSingleton singleton = MyClassSingleton.getInstance();
*/
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        System.out.println(singleton.hashCode());


        //System.out.println(singleton== singleton1);
    }

}
