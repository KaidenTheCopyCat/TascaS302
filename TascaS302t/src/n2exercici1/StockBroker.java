package n2exercici1;

import java.util.ArrayList;
import java.util.List;

public class StockBroker implements Observable {

	private List<Observer> observers;
	private int stockPrice;

	public StockBroker() {
		observers = new ArrayList<>();
		stockPrice = 0;
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(stockPrice);
		}
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
		notifyObservers();
	}

}
