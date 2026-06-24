public class WebApp
        implements StockObserver {

    @Override
    public void update(
            String stockName,
            double price) {

        System.out.println(
                "Web App: "
                + stockName
                + " = "
                + price
        );
    }
}