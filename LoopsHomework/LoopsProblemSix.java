//		Да се прочете число от екрана(конзолата) и да се 
//		изведе сбора на всички числа между 1 и въведеното число.
import java.util.Scanner;

public class LoopsProblemSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 1;
		num = sc.nextInt();
		if (num >= 0) {
			for (int i = 2; i <= num; i++) {
				sum += i;
			}
		} else {
			for (int i = 0; i >= num; i--) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
