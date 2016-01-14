package homework3.oop;

public class Employee extends Person {
	private static final int FULL_LEGAL_AT_AGE = 18;
	private static final int OVERTIME_FOR_UNDER_AGE = 0;
	private static final int MIN_SALARY = 20;
	private static final double COEFF_FOR_OVERTIME = 1.5;
	private static final int LENGTH_OF_WORKING_DAY = 8;

	private int daySalary;

	Employee(String name, int age, String isMale, int daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}

	void calculateOvertime(double overtimeHours) {
		double moneyPerHour = this.daySalary / LENGTH_OF_WORKING_DAY;
		if (this.getAge() >= FULL_LEGAL_AT_AGE) {
			System.out
					.println(this.getName()
							// koe e po pravilno super.getName(); ili
							// this.getName(); ?
							+ " specheli ei tolkova pari ot overtime: "
							+ (double) (COEFF_FOR_OVERTIME * overtimeHours * moneyPerHour)
							+ " lv");
		} else
			System.out.println(this.getName()
					+ " specheli ei tolkova pari ot overtime: "
					+ OVERTIME_FOR_UNDER_AGE + " lv");
	}

	void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println(" Day Salara: " + this.daySalary);
	}

	void setDaySalary(int daySalary) {
		if (daySalary > MIN_SALARY) {
			this.daySalary = daySalary;

		} else
			this.daySalary = MIN_SALARY;
	}
}
