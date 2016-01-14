package office;

public class Employee {
	private static final int WORKING_DAY_IN_HOURS = 8;
	private final String name;
	private Task currentTask;
	private int hoursLeft;
	private AllWork allWork;
	private boolean takingVeryFirstTask;

	Employee(String name) {
		if (name.equals("")) {
			this.name = "Jesus";
		} else {
			this.name = name;
		}
	}

	void startWorkingDay() {
		this.setHoursLeft(WORKING_DAY_IN_HOURS);

		work();

	}

	void work() {
		if (this.allWork != null) {
			if (this.currentTask == null && this.takingVeryFirstTask == false) {

				this.currentTask = this.allWork.getNextTask();
				System.out.println(this.name + " got new task:"
						+ this.currentTask.getName() + " "
						+ this.currentTask.getWorkingHours() + "h");
				this.takingVeryFirstTask = true;
			}
			if (this.currentTask != null) {
				if (this.hoursLeft < this.currentTask.getWorkingHours()) {
					this.currentTask.setWorkingHours(this.currentTask
							.getWorkingHours() - this.hoursLeft);
					this.hoursLeft = 0;
					System.out
							.println(this.name
									+ " finished his working day and will continue with this task tomorrow with "
									+ this.currentTask.getName() + " he has "
									+ this.currentTask.getWorkingHours()
									+ " hour(s) left to finish the task "
									+ this.currentTask.getName());
					return;
				} else {
					this.hoursLeft = this.hoursLeft
							- this.currentTask.getWorkingHours();
					this.currentTask.setWorkingHours(0);
					System.out.println(this.name + " finished with his task "
							+ this.currentTask.getName() + " and  has "
							+ this.hoursLeft + " hours left");
					if (this.allWork.getCurrentUnassignedTask() < AllWork.MAX_POSSIBLE_TASKS) {
						this.currentTask = this.allWork.getNextTask();
						if (this.currentTask != null) {
							System.out.println(this.name + " got new task:"
									+ this.currentTask.getName() + " "
									+ this.currentTask.getWorkingHours() + "h");
							work();

						}
					} else {
						return;
					}

				}
			}
		} else {
			System.out.println(this.getName() + " doesnt have office and work");
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

	String getName() {
		return name;
	}

	Task getCurrentTask() {
		return currentTask;
	}

	void setCurrentTask(Task currentTask) {
		if (currentTask == null) {
			System.out
					.println("You have entered not existing task, please take a look at the code!");
			this.currentTask = currentTask;
		} else {
			this.currentTask = currentTask;
		}
	}

	AllWork getAllwork() {
		return allWork;
	}

	void setAllwork(AllWork allWork) {
		this.allWork = allWork;
	}

}
