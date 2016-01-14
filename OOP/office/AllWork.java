package office;

public class AllWork implements IAllWork {
	private static final int INDEX_OF_THE_FIRST_TASK = 0;
	static final int MAX_POSSIBLE_TASKS = 10;
	private Task[] tasks;
	private int freePlaceForTasks;
	private static int currentUnassignedTask;

	AllWork() {
		this.tasks = new Task[MAX_POSSIBLE_TASKS];
		freePlaceForTasks = MAX_POSSIBLE_TASKS;
		currentUnassignedTask = INDEX_OF_THE_FIRST_TASK;
	}

	@Override
	public void addTask(Task task) {
		if (this.freePlaceForTasks <= 0) {
			System.out
					.println("The Office is too busy and cant take your task "
							+ task.getName());
		}
		for (int i = 0; i < this.tasks.length; i++) {
			if (this.tasks[i] == null) {
				this.tasks[i] = task;
				freePlaceForTasks--;
				return;
			}
		}
	}

	@Override
	public Task getNextTask() {
		if (this.tasks[currentUnassignedTask] != null
				&& this.tasks.length > currentUnassignedTask) {
			return this.tasks[currentUnassignedTask++];

		}

		return null;
	}

	@Override
	public boolean isAllWorkDone() {
		for (int i = 0; i < this.tasks.length; i++) {
			if (tasks[i] == null) {
				continue;
			}
			if (this.tasks[i].getWorkingHours() != 0) {
				return false;
			}
		}
		return true;
	}

	int getFreePlaceForTasks() {
		return freePlaceForTasks;
	}

	int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

}
