package employee;

public class Company {
	public static void main(String[] args) {
		Task kopane = new Task("Kopane", 3);
		Task mislene = new Task("Mislene", 8);
		Task nosene = new Task("Nosene", 8);
		Task zarejdane = new Task("Zarejdane na material", 3);

		Employee ivan = new Employee("Ivan");
		ivan.setHoursLeft(6);
		ivan.setCurrentTask(kopane);
		ivan.work();
		// kopane.setName("KOPANEEE");
		// ivan.setName("IVANNNN");
		// System.out.println(ivan.getName());
		ivan.showReport();
		Employee pesho = new Employee("Pesho");
		pesho.setCurrentTask(mislene);
		pesho.setCurrentTask(nosene);
		pesho.setHoursLeft(8);
		pesho.work();
		pesho.showReport();
		// Employee borisov= new Employee("Boiko");
		// borisov.work();
		// borisov.showReport();
		Employee stoian = new Employee("Stoyan");
		// stoian.work();
		// System.out.println(stoian.getName());
		stoian.setCurrentTask(zarejdane);
		stoian.setHoursLeft(2);
		stoian.work();
		stoian.showReport();
	}
}
