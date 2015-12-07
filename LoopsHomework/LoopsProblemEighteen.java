import java.util.Scanner;

public class LoopsProblemEighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num < 1 || num > 9) {
			System.out.println("enter a number between 1 and 9");
			num = sc.nextInt();
		}
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(i + "*" + j + "=" + (i * j));
				System.out.println(" ");
			}

		}

	}

}
