package office;

public class OfficeDemo {
	public static void main(String[] args) {
		int day = 1;
		AllWork office = new AllWork();
		Task kopane = new Task("Kopane", 3);
		Task mislene = new Task("Mislene", 8);
		Task nosene = new Task("Nosene", 8);
		Task zarejdane = new Task("Zarejdane na material", 3);
		Task printing = new Task("Printing", 3);
		Task drawing = new Task("Drawing", 10);
		Task writing = new Task("Writing", 9);
		Task reading = new Task("Reading", 2);
		Task planning = new Task("Planning", 20);
		Task organizing = new Task("Organizing", 17);
		office.addTask(kopane);
		office.addTask(mislene);
		office.addTask(nosene);
		office.addTask(zarejdane);
		office.addTask(printing);
		office.addTask(drawing);
		office.addTask(writing);
		office.addTask(reading);
		office.addTask(planning);
		office.addTask(organizing);
		// podawam 11ta zadach, no tq shte e othwyrlena(masiva e ot 10 el)
		office.addTask(organizing);
		Employee ivan = new Employee("Ivan");
		Employee pesho = new Employee("Pesho");
		Employee stoian = new Employee("Stoyan");
		ivan.setAllwork(office);
		pesho.setAllwork(office);
		stoian.setAllwork(office);
		// System.out.println(office.getFreePlaceForTasks());
		while (true) {
			if (office.isAllWorkDone() == false) {
				System.out.println("Day " + day++);
				ivan.startWorkingDay();
				pesho.startWorkingDay();
				stoian.startWorkingDay();
			} else {
				System.out.println("All tasks are done!");
				break;
			}

		}

	}
}
