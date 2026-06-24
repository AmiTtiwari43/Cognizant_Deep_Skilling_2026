import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{

    private List<StockObserver> observers = new ArrayList<>();

    private String stockName;

    private double price;

    @Override
    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (StockObserver observer : observers) {
            observer.update(stockName, price);
        }
    }

    public void setStockPrice(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        notifyObserver();
    }

    
}