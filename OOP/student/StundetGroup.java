package student;

public class StundetGroup {
	String groupSubject;
	Student[] students;
	byte freePlaces;
	int count = 0;

	StundetGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	StundetGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if (this.groupSubject.equalsIgnoreCase(s.subject) && freePlaces > 0) {
			this.students[count] = s;
			count++;
			freePlaces--;
		}
	}

	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	String theBestStudent() {
		if (this.students == null) {
			System.out.println("No students!");
		}
		String name = this.students[0].name;
		float max = this.students[0].grade;
		for (int i = 1; i < this.students.length; i++) {
			if (this.students[i] == null) {
				continue;
			}
			if (max < this.students[i].grade) {
				name = this.students[i].name;
				max = this.students[i].grade;
			}
		}
		return name;
	}

	void printStudentsInGroup() {
		if (this.students == null) {
			System.out.println("No student");
		}
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] == null || this.students[i].name == null
					|| this.students[i].subject == null) {
				System.out.println("No student at place " + (i + 1)
						+ " in the group");
				continue;
			}
			System.out.print("Name: " + this.students[i].name + ", ");
			System.out.print("Grade: " + this.students[i].grade + ", ");
			System.out.print("Age: " + this.students[i].age + ", ");
			System.out.print("Year in Gollege: "
					+ this.students[i].yearInCollege + " ");
			System.out.print("Graduated?: " + this.students[i].isDegree + ", ");
			System.out.print("Money: " + this.students[i].money + " ");
			System.out.println();
		}
	}
}
