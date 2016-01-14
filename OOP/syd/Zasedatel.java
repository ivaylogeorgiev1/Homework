package syd;

public class Zasedatel extends Urist {

	Zasedatel(String name, String adres, int staj, int broiDela) {
		super(name, adres, staj, broiDela);
	}

	boolean takeDecision() {
		return (Math.random() > 0.5);
	}
}
