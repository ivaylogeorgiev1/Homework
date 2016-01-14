package student;

public class College {
	public static void main(String[] args) {
		StundetGroup java = new StundetGroup("Java");
		Student ivan = new Student("Ivan", "Java", (byte) 22);
		Student berbo = new Student("Berbatov", "Java", (byte) 34);
		Student yoda = new Student("Yoda", "Space Logistic", (byte) 2323);
		Student putin = new Student("Putin", "World rulling", (byte) 53);
		Student goro = new Student("Goro", "Java", (byte) 24);
		ivan.grade = 1;
		berbo.grade = 6;
		yoda.grade = 5;
		putin.grade = 9;
		goro.grade = 10;
		ivan.receiveScholarship(7, 500);
		goro.receiveScholarship(7, 500);
		goro.upYear();
		goro.upYear();
		ivan.upYear();
		ivan.upYear();
		ivan.upYear();
//		ivan.upYear();
		// goro.upYear();
		// goro.upYear();
		putin.upYear();

		java.addStudent(goro);
		java.addStudent(berbo);
		java.addStudent(yoda);
		java.addStudent(putin);
		java.addStudent(ivan);
		java.printStudentsInGroup();
		System.out.println("the best student in group " + java.groupSubject
				+ " is " + java.theBestStudent());
		// java.emptyGroup();
		// System.out.println();
		// java.printStudentsInGropu();

	}
}
