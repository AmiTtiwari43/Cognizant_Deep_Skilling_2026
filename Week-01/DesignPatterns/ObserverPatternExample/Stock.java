public interface Stock {

    void registerObserver(StockObserver observer);

    void deregisterObserver(StockObserver observer);

    void notifyObserver();

}