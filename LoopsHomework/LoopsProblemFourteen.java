import java.util.Scanner;

//Да се състави програма, която по въведено 
//естествено число 
//N 
//от интервала [10..200] извежда в обратен 
//ред всички числа, които са кратни на 7 и са по-малки от 
//N

public class LoopsProblemFourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 100;
		int n = 0;
		while (n < 10 || n > 200) {
			System.out.println("Enter a number between 10 and 200:");
			n = sc.nextInt();
		}
		// Извежда всички числа кратни на 7 и по- малки от n!!!(Само n>10,но не
		// и изведените числа)
		for (int i = n; i >= 7; i--) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}

	}

}
