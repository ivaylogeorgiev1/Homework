package syd;

public class Sydiq extends Urist {

	Sydiq(String name, String adres, int staj, int broiDela) {
		super(name, adres, staj, broiDela);

	}
	int otsydiGodini() {
		return (int) (Math.random() * 38 + 3);
	}
}
