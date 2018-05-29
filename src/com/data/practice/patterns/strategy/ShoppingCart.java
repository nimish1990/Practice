package com.data.practice.patterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;

    public  ShoppingCart(){
        this.itemList= new ArrayList<>();
    }

    public void addItem( Item item){

        this.itemList.add(item);
    }

    public void removeItem( Item item){

        this.itemList.remove(item);
    }

    public  int calculateTotal(){
        int sum =0;
        for(Item item:itemList){
            sum +=item.getItemPrice();
        }
        return sum;

    }

    public void pay(PaymentType paymentType){

        int amount=calculateTotal();

        paymentType.pay(amount);
    }
}
