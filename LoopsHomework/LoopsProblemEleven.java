import java.util.Scanner;

public class LoopsProblemEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int q = (a - i); q > 0; q--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= ((1 + (2 * (i - 1)))); j++) {
				// за запълнен триъгълник-в блока на този цикъл оставете само
				//един изхода за *
				if (i != a) {
					if ((j == 1) || (j == (1 + (i - 1) * 2))) {
						System.out.print("*");

					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");

		}
	}
}
// ВАРИАНТ 2- за запълнен
// import java.util.Scanner;
//
// public class LoopsProblemEleven {
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// Scanner sc = new Scanner(System.in);
// int a = 0;
// a = sc.nextInt();
//
// for (int i = 1; i <= a; i++) {
// for (int j = 0; j < ((1 + (2 * (i - 1)))); j++) {
// for (int q = (a-i); q > 0; q--) {
// if(j==0){
// System.out.print(" ");}
// }
// System.out.print("*");
//
// }
// System.out.println("");
//
// }
// }
// }
