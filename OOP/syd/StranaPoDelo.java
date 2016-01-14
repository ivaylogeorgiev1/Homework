package syd;

public class StranaPoDelo extends Grajdanin {
	private Advokat advokati[];

	StranaPoDelo(String name, String adres, int age) {
		super(name, adres, age);
	}

	public Advokat[] getAdvokati() {
		return advokati;
	}

}
