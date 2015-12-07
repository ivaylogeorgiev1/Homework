import java.util.Scanner;

public class LoopsProblemThirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 100;
		int sum = 0;
		while (sum < 2 || sum > 27) {
			System.out.println("Enter a number between 2 and 27:");
			sum = sc.nextInt();
		}
		while (a < 1000) {
			if (((a % 100) / 10) + a % 10 + ((a % 1000) / 100) == sum) {
				System.out.println(a);
			}
			a++;
		}

	}

}
