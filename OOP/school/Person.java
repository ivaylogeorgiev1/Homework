package school;

public class Person {
	private final String name;
	private final String family;

	Person(String name, String family) {
		if (!name.equals("")) {
			this.name = name;
		} else {
			this.name = "Jesus";
		}
		if (!family.equals("")) {
			this.family = family;
		} else {
			this.family = "Christ";
		}
	}

	public final String getName() {
		return name;
	}

	public String getFamily() {
		return family;
	}

}
