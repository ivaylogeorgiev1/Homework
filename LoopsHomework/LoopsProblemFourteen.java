import java.util.Scanner;

//�� �� ������� ��������, ����� �� �������� 
//���������� ����� 
//N 
//�� ��������� [10..200] ������� � ������� 
//��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� 
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
		// ������� ������ ����� ������ �� 7 � ��- ����� �� n!!!(���� n>10,�� ��
		// � ���������� �����)
		for (int i = n; i >= 7; i--) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}

	}

}
