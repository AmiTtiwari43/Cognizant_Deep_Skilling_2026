package DesignPatterns.ObserverPatternExample;

public class MobileApp implements StockObserver{

    @Override
    public void update(String stockName, double price) {
        System.out.println("Mobile App: " + stockName + " = "+price);
    }
    
}