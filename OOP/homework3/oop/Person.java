package homework3.oop;

public class Person {
	private static final int AGE_TO_SET_IN_CASE_OF_WRONG_INPUT = 33;
	private final String name;
	private final boolean isMale;
	private int age;

	Person(String name, int age, String isMale) {
		if (name.equalsIgnoreCase("")) {
			this.name = "Enter a valid name";
		} else {
			this.name = name;
		}
		setAge(age);
		if (isMale.equalsIgnoreCase("yes")) {
			// preobrazuwam string w boolean
			this.isMale = true;
		} else {
			this.isMale = false;
		}

	}

	void showPersonInfo() {
		System.out.print(" Name: " + this.getName() + ",");
		System.out.print(" Age: " + this.getAge() + ",");
		System.out.print(" Sex: " + this.isMale());

	}

	String getName() {
		return this.name;
	}

	int getAge() {
		return this.age;
	}

	void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else
			this.age = AGE_TO_SET_IN_CASE_OF_WRONG_INPUT;
	}

	String isMale() {
		if (this.isMale) {
			return "Man";
		} else
			return "Woman";
	}
}
