public class LoopsProblemTwenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			for (int j = i; j < 10; j++) {
				System.out.print(j);
			}
			for (int q = 0; q < i; q++) {
				System.out.print(q);
			}
			System.out.println(" ");
		}
	}
}
//Вариант 2
// int i;
// int j = 0;
// int num;
// for (i = 1; i <= 10; i++) {
// num = i;
// if (num == 10) {
// num = 0;
// }
// for (j = 1; j <= 10; j++) {
// if (num == 9) {
// System.out.print(num);
// num = 0;
// } else {
// System.out.print(num);
// num++;
// }
//
// }
// System.out.println();
// }
// }
// }
