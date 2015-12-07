import java.util.Scanner;

public class ProblemFourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int co1 = 0;
		int co2 = 0;
		int co3 = 0;
		int co4 = 0;

		System.out.println("coordinate 1");
		co1 = sc.nextInt();
		System.out.println("coordinate 2");
		co2 = sc.nextInt();
		System.out.println("coordinate 3");
		co3 = sc.nextInt();
		System.out.println("coordinate 4");
		co4 = sc.nextInt();
		while ((co1 < 1 || co1 > 8) || (co2 < 1 || co2 > 8)
				|| (co3 < 1 || co3 > 8) || (co4 < 1 || co4 > 8)) {
			System.out
					.println("Some of the coordinate(s) is not in the inverval [1;8]");
			System.out.println("coordinate 1");
			co1 = sc.nextInt();
			System.out.println("coordinate 2");
			co2 = sc.nextInt();
			System.out.println("coordinate 3");
			co3 = sc.nextInt();
			System.out.println("coordinate 4");
			co4 = sc.nextInt();
		}
		if (((co1 % 2 == 0 && co2 % 2 == 0) || (co1 % 2 == 1 && co2 % 2 == 1))
				&& ((co3 % 2 == 0 && co4 % 2 == 0) || (co3 % 2 == 1 && co4 % 2 == 1))
				|| ((co1 % 2 == 1 && co2 % 2 == 0) || (co1 % 2 == 0 && co2 % 2 == 1))
				&& ((co3 % 2 == 1 && co4 % 2 == 0) || (co3 % 2 == 0 && co4 % 2 == 1))) {
			System.out.println("Позициите са с еднакъв цвят");
		} else {
			System.out.println("Позициите са с различни цветове");
		}
	}
}
