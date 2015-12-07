//import java.util.Scanner;
//
//public class LoopsProblemTen {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//
//		int a = 0;
//		a = sc.nextInt();
//		boolean isPrime = true;
//		for (int i = 2; i <= (a / 2); i++) {
//			if (a % i == 0) {
//				System.out.println("Not Prime");
//				isPrime = false;
//				break;
//			}
//		}
//		if (isPrime == true) {
//			System.out.println("Its Prime");
//		}
//
//	}
//}

import java.util.Scanner;

//Така я направих на упражнението
public class LoopsProblemTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		a = sc.nextInt();

		for (int i = 2; i < (a); i++) {

			if (a % i == 0) {
				b++;
				break;

			}
		}
		if (b > 0)

			System.out.println("Not Prime");
		else
			System.out.println("Prime");

	}

}