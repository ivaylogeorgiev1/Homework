package school;

public class Student extends Person {

	private School school;
	private Group group;

	Student(String name, String family, Group group) {
		super(name, family);
		if (group != null) {
			this.group = group;
			this.school = group.getSchool();
			group.addStudent(this);
		} else {
			this.group = new Group("Levski", new Teacher("Myri", "Stoilov"),
					new School("AGRUPA", 5, 5));
			this.school = new School("AGRUPA", 5, 5);
		}
	}

	public School getSchool() {
		return this.school;
	}

	public Group getGroup() {
		return this.group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}
