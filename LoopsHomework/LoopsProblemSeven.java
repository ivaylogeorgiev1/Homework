import java.util.Scanner;

/*Задача 7
 : Започвайки от 3, да се изведат на екрана първите 
 n 
 числа които се делят на 3. Числата да са разделени със запетая.*/

public class LoopsProblemSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int num = 3;
		n = sc.nextInt();
		int br = 1;
		while (br <= n) {
			if (num % 3 == 0 && br < n) {
				System.out.print(num + ",");
				br++;
			}
			// за да не вади запетая след последната цифра, която се дели на 3
			if (num % 3 == 0 && br == n) {
				System.out.print((num + 3));
				br++;
			}
			num++;
		}

	}

}
