package com.data.practice.patterns.strategy;

public class PaytmPay implements PaymentType {

    private String userName;
    private String Password;

    public PaytmPay(String userName,String password){
        this.userName=userName;
        this.Password= password;
    }

    @Override
    public void pay(int amount) {
     System.out.println(amount+ " paid by paytm user "+userName);
    }
}
