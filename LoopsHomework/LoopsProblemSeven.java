import java.util.Scanner;

/*������ 7
 : ���������� �� 3, �� �� ������� �� ������ ������� 
 n 
 ����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.*/

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
			// �� �� �� ���� ������� ���� ���������� �����, ����� �� ���� �� 3
			if (num % 3 == 0 && br == n) {
				System.out.print((num + 3));
				br++;
			}
			num++;
		}

	}

}
