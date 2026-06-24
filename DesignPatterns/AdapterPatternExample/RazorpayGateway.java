package DesignPatterns.AdapterPatternExample;

public class RazorpayGateway {

    public void makePayment(double amount) {
        System.out.println("Razorpay payment: " + amount);
    }
}