import java.util.Scanner;

public class LoopsProblemEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		
		int br = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
//	2ри вариант с while (br < n) {  и  br++; след условеито if ((n + (br - 1)) % 2 == 1) { 
			for (br=0;br<(n+(n-1));br++) {
			if (n % 2 == 0) {
				if ((n + (br - 1)) % 2 == 1) {
					
					for (int j = 1; j <= n; j++) {
						System.out.print(n + (br - 1));
						if (j == n) {
							System.out.println();
						}

					}
				}
			} else {
				if ((n + (br - 1)) % 2 == 0) {
					
					for (int j = 1; j <= n; j++) {
						System.out.print(n + (br - 1));

						if (j == n) {
							System.out.println();
						}

					}

				}

			}
//			check++;
		}

	}
}
