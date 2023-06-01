package n2exercici1;

public interface Observable {

	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}
