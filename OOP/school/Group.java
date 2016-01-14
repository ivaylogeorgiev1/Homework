package school;

public class Group implements IStudent {

	private static final int MAX_POSSIBLE_STUDENTS_IN_GROUP = 20;

	private final String name;
	private Student studentsInThatGroup[] = new Student[MAX_POSSIBLE_STUDENTS_IN_GROUP];

	private Teacher teacherLeadingThatGroup;
	private School school;

	public Group(String name, Teacher teacher, School school) {
		// ne sym slojil validaciq...
		this.name = name;
		this.school = school;
		this.teacherLeadingThatGroup = teacher;
		teacher.addGruop(this);
		school.addGruop(this);
		school.addTeacher(teacher);
	}

	@Override
	public void addStudent(Student student) {
		boolean isAdded = false;
		if (student.getGroup() != null) {
			for (int i = 0; i < student.getGroup().getStudentsInThatGroup().length; i++) {
				if (student.getGroup().getStudentsInThatGroup()[i] == student) {
					student.getGroup().studentsInThatGroup[i] = null;
					break;
				}
			}
		}
		for (int i = 0; i < this.studentsInThatGroup.length; i++) {
			if (this.studentsInThatGroup[i] == null) {
				this.studentsInThatGroup[i] = student;
				// da zapisha studenta i w school
				student.setGroup(this);
				isAdded = true;
				return;
			}
		}

		if (!isAdded) {
			System.out
					.println("Ei toq uchenik ne beshe dobaven : "
							+ student.getName() + " kym ei taq grupa:"
							+ this.getName());
		}
	}

	public String getName() {
		return this.name;
	}

	public School getSchool() {
		return school;
	}

	public Student[] getStudentsInThatGroup() {
		return studentsInThatGroup;
	}

}
