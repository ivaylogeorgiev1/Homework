package syd;

public abstract class Person {
	private final String name;
	private final String adres;

	Person(String name, String adres) {
		if (!name.equals("")) {
			this.name = name;
		} else {
			this.name = "Jesus";
		}
		if (!adres.equals("")) {
			this.adres = adres;
		} else {
			this.adres = "JesusStr";
		}

	}

	public String getName() {
		return name;
	}

}
