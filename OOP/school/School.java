package school;

public class School implements IGroup, IStudent {
	private final String name;
	private Group groupsSchool[];
	private Teacher teachers[];
	private Student[] studentsSchool;

	School(String name, int maxPossibleGroups, int maxTeacherWorkingPlace) {
		if (!name.equals("")) {
			this.name = name;
		} else {
			this.name = "Jesus";
		}
		if (maxPossibleGroups > 0 && maxPossibleGroups < 100) {
			this.groupsSchool = new Group[maxPossibleGroups];
		} else {
			this.groupsSchool = new Group[50];
		}
		if (maxTeacherWorkingPlace > 0 && maxTeacherWorkingPlace < 80) {
			this.teachers = new Teacher[maxTeacherWorkingPlace];
		} else {
			this.teachers = new Teacher[40];
		}
		if (maxPossibleGroups * 20 > 0 && maxPossibleGroups * 20 < 2000) {
			this.studentsSchool = new Student[maxPossibleGroups * 20];
		} else {
			this.studentsSchool = new Student[1000];
		}
	}

	@Override
	public void addGruop(Group group) {
		boolean isAdded = false;
		for (int i = 0; i < this.groupsSchool.length; i++) {
			if (this.groupsSchool[i] == null) {
				this.groupsSchool[i] = group;
				isAdded = true;
				return;
			}
		}
		if (!isAdded) {
			System.out.println("Ei taq grupa ne beshe dobavena "
					+ group.getName() + " kym uchilishteto: " + this.getName());
		}
	}

	public void addStudent(Student student) {
		boolean isAdded = false;
		for (int i = 0; i < this.studentsSchool.length; i++) {
			if (this.studentsSchool[i] == null) {
				this.studentsSchool[i] = student;
				isAdded = true;
				return;
			}
		}
		if (!isAdded) {
			System.out.println("Ei toq uchenik ne beshe dobaven : "
					+ student.getName() + " kym uchilishte: " + this.getName());
		}
	}

	public void addTeacher(Teacher teacher) {
		boolean isAdded = false;
		for (int i = 0; i < this.teachers.length; i++) {
			if (this.teachers[i] != null) {
				if (this.teachers[i].equals(teacher)) {
					return;
				}
			}
		}

		for (int i = 0; i < this.teachers.length; i++) {
			if (this.teachers[i] == null) {
				this.teachers[i] = teacher;
				isAdded = true;
				break;

			}
		}
		if (!isAdded) {
			System.out.println("Ei toq uchitel ne beshe dobavena "
					+ teacher.getName() + " kym uchilishteto: "
					+ this.getName());
		}
	}

	public String getName() {
		return this.name;
	}

	public Teacher[] getTeachers() {
		return teachers;
	}

}