import java.util.Scanner;

public class ProblemThirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = -101;
		while (a < -100 || a > 100) {
			System.out.println("�������� ������������ � ������ �� -100 �� 100");
			a = sc.nextInt();
		}
		if (a < -20) {
			System.out.println("������ �������");
		}
		if (a >= -20 && a < 0) {
			System.out.println("�������");
		}
		if (a >= 0 && a < 15) {
			System.out.println("������");
		}
		if (a >= 15 && a < 25) {
			System.out.println("�����");
		}
		if (a > 25) {
			System.out.println("������");
		}
	}

}
