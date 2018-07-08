package com.data.practice.patterns.decorator;

public class BasicCar implements Car {


    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
