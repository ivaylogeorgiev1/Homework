package homework3.oop;

public class Student extends Person {

	private static final int MAX_SCORE = 6;
	private static final int MIN_SCORE = 2;
	private double score;

	Student(String name, int age, String isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}

	// Ako konstruktoryt e bez parametyr to trqbwa da dadem
	// stoinosti(inicializirame)
	// v konstruktora,
	// inache konstruktoryt ne znae kakvo stoinosti da zadade na poletata i
	// reve.
	// no trqbwa da e sys Scanneri zashtoto sym napravil name i
	// drugi poleta da sa
	// final (za da nqma vseki edno i syshto
	// ime i danni)
	// super(new Scanner(System.in).nextLine(), ...... );

	void showStudentInfo() {
		super.showPersonInfo();
		System.out.println(" Score: " + this.score);
	}

	void setScore(double score) {
		if (score > MIN_SCORE && score <= MAX_SCORE) {
			this.score = score;
		} else {
			this.score = MIN_SCORE;
		}
	}
}
