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
		//������� 1 
		for (int card = num; card <= 52; card++) {
			int cardNumber = (card - 1) / 4 + 1;
			int cardSuit = card % 4;
			switch (cardNumber) {
			case 1:
				System.out.print("������");
				break;
			case 2:
				System.out.print("������");
				break;
			case 3:
				System.out.print("��������");
				break;
			case 4:
				System.out.print("������");
				break;
			case 5:
				System.out.print("�������");
				break;
			case 6:
				System.out.print("�������");
				break;
			case 7:
				System.out.print("������");
				break;
			case 8:
				System.out.print("�������");
				break;
			case 9:
				System.out.print("�������");
				break;
			case 10:
				System.out.print("����");
				break;
			case 11:
				System.out.print("����");
				break;
			case 12:
				System.out.print("���");
				break;
			case 13:
				System.out.print("���");
				break;
			}
			System.out.print(" ");
			switch (cardSuit) {
			case 1:
				System.out.print("������");
				break;
			case 2:
				System.out.print("����");
				break;
			case 3:
				System.out.print("����");
				break;
			case 0:
				System.out.print("����");
				break;
			}
			if (card < 52) {
				System.out.print(", ");
			}
		}
	}
}

// ������� 2
// for (int i = num; i <= 51; i++) {
//
// if (i <= 52 && i >= 49) {
// System.out.print("���");
// }
// if (i <= 48 && i >= 45) {
// System.out.print("���");
// }
// if (i <= 44 && i >= 41) {
// System.out.print("����");
// }
// if (i <= 40 && i >= 37) {
// System.out.print("����");
// }
// if (i <= 36 && i >= 33) {
// System.out.print("�������");
// }
// if (i <= 32 && i >= 29) {
// System.out.print("�������");
// }
// if (i <= 28 && i >= 25) {
// System.out.print("������");
// }
// if (i <= 24 && i >= 21) {
// System.out.print("�������");
// }
// if (i <= 20 && i >= 17) {
// System.out.print("�������");
// }
// if (i <= 16 && i >= 13) {
// System.out.print("������");
// }
// if (i <= 12 && i >= 9) {
// System.out.print("��������");
// }
// if (i <= 8 && i >= 5) {
// System.out.print("������");
// }
// if (i <= 4 && i >= 1) {
// System.out.print("������");
// }
// if (i % 4 == 1) {
// System.out.print(" ������, ");
// }
// if (i % 4 == 2) {
//
// System.out.print(" ����, ");
// }
// if (i % 4 == 3) {
// System.out.print(" ����, ");
// if (i > 48) {
// break;
// }
// }
// if (i % 4 == 0) {
// System.out.print(" ����, ");
// }
//
// }
// System.out.println("��� ����");
// }
//
// }
