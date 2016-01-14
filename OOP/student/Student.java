package student;

public class Student {

	String name;
	String subject;
	float grade;
	byte yearInCollege;
	byte age;
	boolean isDegree;
	double money;

	Student() {
		this.grade = 4.0f;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0.0;
	}

	Student(String name, String subject, byte age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {
		if (this.isDegree == true) {
			System.out.println(this.name + " already did graduate");
		}
		if (this.yearInCollege < 4) {
			this.yearInCollege++;
		}
		if (this.yearInCollege == 4) {
			this.isDegree = true;
		}
	}

	double receiveScholarship(double min, double amount) {
		if (this.age < 30 && this.grade > min) {
			this.money += amount;
		}
		return this.money;
	}

}
