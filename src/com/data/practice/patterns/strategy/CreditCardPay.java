package com.data.practice.patterns.strategy;

public class CreditCardPay implements PaymentType {

    String nameOnCard;
    String cvv;
    String expiryDate;
    String cardNumber;

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CreditCardPay(String nameOnCard, String cvv, String expiryDate, String cardNumber){
        this.cardNumber=cardNumber;
        this.cvv= cvv;
        this.expiryDate= expiryDate;
        this.nameOnCard =nameOnCard;
    }
    @Override
    public void pay(int amount) {

        System.out.println(amount+ " paid with credit card number " +getCardNumber());

    }
}
