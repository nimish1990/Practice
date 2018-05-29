package com.data.practice.patterns.strategy;

public class SalesTerminal {
    public static void main(String args[]){


        ShoppingCart shoppingCart= new ShoppingCart();
        shoppingCart.addItem(new Item("shoes",1110));
        shoppingCart.addItem(new Item("shirt",5200));

        shoppingCart.pay(new CreditCardPay("nimish","***","22/09/2022","1652652"));
        shoppingCart.pay(new CashPay("raj","gurgaon"));
        shoppingCart.pay(new PaytmPay("nimish1990","******"));
    }
}
