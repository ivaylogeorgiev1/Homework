import java.util.Scanner;

public class LoopsProblemFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		if (n == m) {
			System.out.println(n);
		}
		if (n > m) {
			System.out.print(m);
			while (n > m) {
				m++;
				System.out.print(m+" ");
			}

		}
		if (n < m) {
			System.out.print(n+" ");
			while (n < m) {
				n++;
				System.out.print(n+" ");

			}

		}
	}

}
