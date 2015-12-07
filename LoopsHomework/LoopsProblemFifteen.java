import java.util.Scanner;
//Задача 15
//Да се състави програма, която да изчисли сумата на 
//всички  числа от 1 до въведено число N.
//Пример: 5
//Изход: 15

public class LoopsProblemFifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		int i = 1;
		int value = 0;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		if (i <= n) {
			value = 1;
		} else {
			value = 2;
		}
		switch (value) {
		case 1: {
			do {
				sum += i;
				i++;
			} while (i <= n);
		}
		break;
		case 2:
			do {
				sum += i;
				i--;
			} while (i >= n);

		}
		System.out
				.println("The sum of the numbers between 1 and " + n + " is:");
		System.out.println(sum);

	}
}
//Вариант 2 с for цикъл
// TODO Auto-generated method stub
// Scanner sc = new Scanner(System.in);
// int n = 0;
// int sum=0;
// System.out.println("Enter a number:");
// n = sc.nextInt();
// for (int i =1; i <= n; i++) {
// sum += i;
// }
// System.out.println("The sum of the numbers between 1 and "+n +" is:");
// System.out.println(sum);
//
// }
