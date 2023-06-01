package n2exercici1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
        StockBroker stockBroker = new StockBroker();

        StockAgency agency1 = new StockAgency("Agency 1");
        StockAgency agency2 = new StockAgency("Agency 2");
        StockAgency agency3 = new StockAgency("Agency 3");

        stockBroker.addObserver(agency1);
        stockBroker.addObserver(agency2);
        stockBroker.addObserver(agency3);

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int stockPrice = random.nextInt(100);
            stockBroker.setStockPrice(stockPrice);
        }

        stockBroker.removeObserver(agency2);

        for (int i = 0; i < 5; i++) {
            int stockPrice = random.nextInt(100);
            stockBroker.setStockPrice(stockPrice);
        }

	}

}
