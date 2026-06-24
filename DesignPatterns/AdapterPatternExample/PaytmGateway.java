package DesignPatterns.AdapterPatternExample;

public class PaytmGateway {

    public void makePayment(double amount) {
        System.out.println("Paytm payment: " + amount);
    }
}