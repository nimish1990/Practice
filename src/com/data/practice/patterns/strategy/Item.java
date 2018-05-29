package com.data.practice.patterns.strategy;

public class Item {
    private String itemCode;
    private int itemPrice;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Item(String itemCode, int itemPrice){
        this.itemCode = itemCode;
        this.itemPrice = itemPrice;
    }
}
