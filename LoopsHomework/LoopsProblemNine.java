import java.util.Scanner;
//�� �� �������� 2 ����� �� ������������ � � �. 
//�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� � 
//�������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� �� 
//������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
//������������) ����� ��-������ �� 200, �� �� �������� �����������

public class LoopsProblemNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = 0, b = 0, sum = 0;
		a = sc.nextInt();
		b = sc.nextInt();

		while (a <= Math.pow(b, 2)) {
			// �� ��������� ��������, �� ���� � � �� ������ 2!
			if (a % 3 == 0) {
				System.out.print("skip " + a + ", ");
			} else {
				System.out.print(a + ", ");
				sum += a;
			}

			if (sum > 200) {
				System.out
						.print("\n the sum of the numbers (without the skipped ones) is bigger than 200");
				a--;// �� �� �� ����� ��� ������ �����(������ ������)
				break;
			}
			// ���� � ��� ��, �� ������ while(a<b^2)(��� �����) � ������ �������
			// ����� �� ������� ��������� ��� ����� �==b
			if (a == Math.pow(b, 2)) {
				a--; //�� �� �� ����� ��� ������ �����
				break;
			}
			a++;

		}

		while (a >= Math.pow(b, 2)) {
			// �� ��������� ��������, �� ���� � � �� ������ 2!

			if (a % 3 == 0) {
				System.out.print("skip " + a + ", ");
			} else {
				System.out.print(a + ", ");
				sum += a;
			}
			// � ������ �� �� ������ � ������� ���, ��� ����� ��� ��������
			// ��
			// ���������� B (������ �� ������� �)
			if (sum > 200) {
				System.out
						.print("\n the sum of the numbers (without the skipped ones) is bigger than 200");
				break;

			}

			a--;

		}
	}
}
