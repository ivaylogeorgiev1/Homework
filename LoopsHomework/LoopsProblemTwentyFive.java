import java.util.Scanner;

public class LoopsProblemTwentyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 0L;
		do {
			System.out.println("Въведете естествено число");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
		} while (num <= 0);
		long fakt = 1L;
		do {
			fakt = fakt * (num);
			num--;
		} while (num > 0);
		System.out.println(fakt);
	}

}
