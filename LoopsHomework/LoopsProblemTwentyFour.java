import java.util.Scanner;

public class LoopsProblemTwentyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int check = 0;
		int firstNum = 0;

		do {
			System.out.println("enter a number between 10 and 30000");
			num = sc.nextInt();
			firstNum = num;
		} while (num < 10 || num > 30000);
		do {
			check = check * 10 + num % 10;
			num = num / 10;

		} while (num > 0);
		if (check == firstNum) {
			System.out.println("Числото е палиндром");
		} else {
			System.out.println("Числото не е палиндром");
		}
	}

}
