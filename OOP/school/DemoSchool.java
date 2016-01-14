package school;

import java.util.Arrays;

public class DemoSchool {
	public static void main(String[] args) {
		School paisii = new School("Paisii Hilendarski", 20, 15);
		Teacher chankova = new Teacher("Maria", "Chankova");
		Teacher gocheva = new Teacher("Vanya", "Gocheva");
		Teacher teneva = new Teacher("Teni", "Teneva");
		Teacher nikolova = new Teacher("Nina", "Nikolova");
		Teacher kolarova = new Teacher("Kolara", "Kolarova");
		Group aKlas = new Group("A", chankova, paisii);
		Group bKlas = new Group("B", gocheva, paisii);
		Group cKlas = new Group("C", nikolova, paisii);
		Group gKlas = new Group("G", teneva, paisii);
		Group dKlas = new Group("D", kolarova, paisii);
		paisii.addGruop(aKlas);
		paisii.addGruop(bKlas);
		paisii.addGruop(cKlas);
		paisii.addGruop(gKlas);
		paisii.addGruop(dKlas);
		Student velichko = new Student("velichko", "angelov", aKlas);
		Student vera = new Student("Vera", "Todeva", aKlas);
		Student pesho = new Student("Pesho", "Ivanov", bKlas);

		System.out.println(velichko.getGroup());
		bKlas.addStudent(velichko);
		bKlas.addStudent(velichko);
		chankova.printInfo();
		gocheva.printInfo();

		for (Teacher t : paisii.getTeachers()) {
			if (t != null) {
				System.out.println(t.getName());
			}
		}

	}
}
