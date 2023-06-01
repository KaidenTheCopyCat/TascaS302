package n2exercici1;

public class StockAgency implements Observer {

	private String name;

	public StockAgency(String name) {
		this.name = name;
	}

	@Override
	public void update(int stockPrice) {
		System.out.println(name + ": Nou preu de les accions - " + stockPrice);
	}

}
