import java.util.Scanner;

//Задача 16
//Да се състави програма, чрез която се въвеждат 2 естествени 
//числа N, M от интервала [10..5555].
//Програмата, чрез цикъл 
//for  да извежда всички числа от 
//интервала, които са кратни на 50 в низходящ ред.
//Пример: 25,249 
//Изход: 200,150,100, 50.
public class LoopsProblemSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0, m = 0;
		while (n < 10 || n > 5555 || m > 5555 || m < 10) {
			System.out.println("Enter two numbers between 10 and 5555:");
			n = sc.nextInt();
			m = sc.nextInt();
		}
		if (m >= n) {
			for (int i = m; i >= n; i--) {
				if (i % 50 == 0) {
					System.out.println(i);
				}
			}
		} else {
			for (int i = n; i >= m; i--) {
				if (i % 50 == 0)
					System.out.println(i);
			}
		}
	}

}
