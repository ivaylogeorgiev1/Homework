package syd;

public abstract class Grajdanin extends Person {
	private int age;

	Grajdanin(String name, String adres, int age) {
		super(name, adres);
		this.age = age;
	}

	String otgovor() {
		return "az sym " + this.getName() + " ei twa mi e otgovora";
	}
}
