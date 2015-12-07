import java.util.Scanner;

public class ProblemSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = -1;
		while (num < 100 || num > 999) {
			System.out.println("Enter a number between 100 and 999");
			num = sc.nextInt();
		}
		int a, b, c, value = 0;
		a = (num % 1000) / 100;
		b = (num % 100) / 10;
		c = num % 10;

		if (a > b && b > c) {
			value = 1;

		}
		if (a == b && b == c) {
			value = 2;

		}
		if (a < b && b < c) {
			value = 3;

		}
		switch (value) {
		case 1: {
			System.out.println("Descending digits");
			break;
		}
		case 2: {
			System.out.println("equivalent digits");
			break;
		}
		case 3: {
			System.out.println("Ascending digits");
			break;

		}
		default: {
			System.out.println("The digits are not arranged");
			break;
		}
		}
		System.out.println(num);

	}

}
