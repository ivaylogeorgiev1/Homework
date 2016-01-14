package homework3.oop;

public class Demo {
	public static void main(String[] args) {
		Person[] person = new Person[10];
		Person putin = new Person("Putin", -55, "yes");
		Person obama = new Person("Obama", 49, "yes");
		Student ivan = new Student("Ivan", 20, "yes", 5.65);
		Student poli = new Student("Poli", 18, "no", 7);
		Employee vyglar = new Employee("Vyglar", 17, "yes", 35);
		Employee hasanka = new Employee("Hasanka", 35, "no", 30);
		ivan.showPersonInfo();
		person[0] = putin;
		person[1] = obama;
		person[2] = ivan;
		person[3] = poli;
		person[4] = vyglar;
		person[5] = hasanka;
		for (int i = 0; i < person.length; i++) {
			if (person[i] instanceof Employee) {
				((Employee) person[i]).showEmployeeInfo();
			}
			if (person[i] instanceof Student) {
				((Student) person[i]).showStudentInfo();
			}
			if (person[i] instanceof Person
					&& (!((person[i] instanceof Employee) || (person[i] instanceof Student)))) {
				((Person) person[i]).showPersonInfo();
				System.out.println();
			}
		}
		for (int i = 0; i < person.length; i++) {
			if (person[i] instanceof Employee) {
				((Employee) person[i]).calculateOvertime(2);

			}

		}
	}
}
