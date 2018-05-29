package com.data.practice.patterns.strategy;

public class CashPay implements PaymentType {
     String name;
     String address;

    public CashPay(String name, String address){
        this.name= name;
        this.address= address;
    }
    @Override
    public void pay(int amount) {

        System.out.println(amount+ " paid by Mr " +name);

    }
}
