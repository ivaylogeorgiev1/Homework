package school;

public class Teacher extends Person implements IGroup {

	private static final int MAX_POSSIBLE_GRUOPS_THAT_TEACHER_CAN_HAVE = 3;
	private Group groupsThatThisTeacherLeads[] = new Group[MAX_POSSIBLE_GRUOPS_THAT_TEACHER_CAN_HAVE];

	Teacher(String name, String family) {
		super(name, family);
	}

	@Override
	public void addGruop(Group group) {
		boolean isAdded = false;
		for (int i = 0; i < this.groupsThatThisTeacherLeads.length; i++) {
			if (this.groupsThatThisTeacherLeads[i] == null) {
				this.groupsThatThisTeacherLeads[i] = group;
				isAdded = true;
				return;
			}
		}
		if (!isAdded) {
			System.out.println("Ei taq grupa ne beshe dobavena : "
					+ group.getName() + " kym wodenite grupi ot uchitel:"
					+ this.getName() + ". Toi ne moje da wodi poweche grupi");
		}
	}

	void printInfo() {
		for (Group g : groupsThatThisTeacherLeads) {
			if (g != null) {
				for (Student s : g.getStudentsInThatGroup()) {
					if (s != null) {
						System.out.println("Uchitelqt " + this.getName() + " "
								+ getFamily() + " wodi na " + s.getName() + " "
								+ s.getFamily() + " ot " + g.getName());
					}
				}

			}
		}
	}

}
