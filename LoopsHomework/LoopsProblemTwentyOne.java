import java.util.Scanner;

public class LoopsProblemTwentyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num < 1 || num > 51) {
			System.out.println("enter a number between 1 and 51");
			num = sc.nextInt();
		}
		//Вариант 1 
		for (int card = num; card <= 52; card++) {
			int cardNumber = (card - 1) / 4 + 1;
			int cardSuit = card % 4;
			switch (cardNumber) {
			case 1:
				System.out.print("Двойка");
				break;
			case 2:
				System.out.print("Тройка");
				break;
			case 3:
				System.out.print("Четворка");
				break;
			case 4:
				System.out.print("Петица");
				break;
			case 5:
				System.out.print("Шестица");
				break;
			case 6:
				System.out.print("Седмица");
				break;
			case 7:
				System.out.print("Осмица");
				break;
			case 8:
				System.out.print("Девятка");
				break;
			case 9:
				System.out.print("Десятка");
				break;
			case 10:
				System.out.print("Вале");
				break;
			case 11:
				System.out.print("Дама");
				break;
			case 12:
				System.out.print("Поп");
				break;
			case 13:
				System.out.print("Асо");
				break;
			}
			System.out.print(" ");
			switch (cardSuit) {
			case 1:
				System.out.print("спатия");
				break;
			case 2:
				System.out.print("каро");
				break;
			case 3:
				System.out.print("купа");
				break;
			case 0:
				System.out.print("пика");
				break;
			}
			if (card < 52) {
				System.out.print(", ");
			}
		}
	}
}

// Вариант 2
// for (int i = num; i <= 51; i++) {
//
// if (i <= 52 && i >= 49) {
// System.out.print("Асо");
// }
// if (i <= 48 && i >= 45) {
// System.out.print("Поп");
// }
// if (i <= 44 && i >= 41) {
// System.out.print("Дама");
// }
// if (i <= 40 && i >= 37) {
// System.out.print("Вале");
// }
// if (i <= 36 && i >= 33) {
// System.out.print("Десятка");
// }
// if (i <= 32 && i >= 29) {
// System.out.print("Девятка");
// }
// if (i <= 28 && i >= 25) {
// System.out.print("Осмица");
// }
// if (i <= 24 && i >= 21) {
// System.out.print("Седмица");
// }
// if (i <= 20 && i >= 17) {
// System.out.print("Шестица");
// }
// if (i <= 16 && i >= 13) {
// System.out.print("Петица");
// }
// if (i <= 12 && i >= 9) {
// System.out.print("Четворка");
// }
// if (i <= 8 && i >= 5) {
// System.out.print("Тройка");
// }
// if (i <= 4 && i >= 1) {
// System.out.print("Двойка");
// }
// if (i % 4 == 1) {
// System.out.print(" Спатия, ");
// }
// if (i % 4 == 2) {
//
// System.out.print(" Каро, ");
// }
// if (i % 4 == 3) {
// System.out.print(" Купа, ");
// if (i > 48) {
// break;
// }
// }
// if (i % 4 == 0) {
// System.out.print(" Пика, ");
// }
//
// }
// System.out.println("Асо Пика");
// }
//
// }
