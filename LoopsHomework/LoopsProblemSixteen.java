import java.util.Scanner;

//������ 16
//�� �� ������� ��������, ���� ����� �� �������� 2 ���������� 
//����� N, M �� ��������� [10..5555].
//����������, ���� ����� 
//for  �� ������� ������ ����� �� 
//���������, ����� �� ������ �� 50 � �������� ���.
//������: 25,249 
//�����: 200,150,100, 50.
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
