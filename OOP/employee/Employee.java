package employee;

public class Employee {
	private String name;
	// name bih go napravil final i da nqma setter, no po zadanie
	// pishe da se napravqt setters i getters za poletata
	private Task currentTask;
	private int hoursLeft;

	Employee(String name) {
		setName(name);
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		if (name.equals("")) {
			this.name = "Please set name to this guy again!";
		} else {
			this.name = name;
		}
	}

	Task getCurrentTask() {
		return currentTask;
	}

	void setCurrentTask(Task currentTask) {
		if (currentTask == null) {
			System.out
					.println("You have entered not existing task, please take a look at the code!");
			// какво стойност да задам на currentTask?
			this.currentTask = currentTask;
		} else {
			this.currentTask = currentTask;
		}
	}

	int getHoursLeft() {
		return hoursLeft;
	}

	void setHoursLeft(int hoursLeft) {
		if (hoursLeft < 0) {
			System.out.println(this.name + " Wrong input for horus left");
			this.hoursLeft = 0;
		} else {
			this.hoursLeft = hoursLeft;
		}
	}

	void work() {
		if (this.currentTask == null) {
			System.out
					.println("Error! Please check whether you work a real task!");
			this.hoursLeft = 0;
			return;
		}
		if (this.hoursLeft < this.currentTask.getWorkingHours()) {
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()
					- this.hoursLeft);
			this.hoursLeft = 0;
		} else {
			this.hoursLeft = this.hoursLeft
					- this.currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);
		}
	}

	void showReport() {
		System.out.println("Employee: "
				+ (name != null ? "Name=" + name + ", " : "")
				+ (currentTask != null ? "Current Task="
						+ currentTask.getName() + ", " : "")
				+ "Hour(s) left to the end of the working day="
				+ hoursLeft
				+ ", "
				+ (this.currentTask != null ? this.currentTask
						.getWorkingHours()
						+ " hour(s) left to finish the task " : ""));
	}

}
