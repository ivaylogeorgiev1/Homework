package Test;
import java.util.Scanner;
//Да се прочетат 2 числа от клавиатурата А и В. 
//Да се изведат всички числа от А до В на степен 2(разделени с 
//запетая).Ако някое число е кратно на 3, да се изведе съобщение че 
//числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
//пропуснатите) стане по-голяма от 200, да се прекрати извеждането

public class NineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = 0, b = 0, sum = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		while (1 == 1) {
			// в случая може и без този while(1==1) и коригирам вложения цикъл
			// while (а<b^2)(махам равното).тогава втория цикъл ще изпълни
			// условието когато а=b^2
			// По този начин- while(1==1) цялото условие се изпълнява само в
			// единия вложен цикъл.
			while (a <= Math.pow(b, 2)) {
				// От заданието разбирам, че само Б е на степен 2!
				if (a % 3 == 0) {
					System.out.print("skip " + a + ", ");
				} else {
					System.out.print(a + ", ");
					sum += a;
				}

				if (sum > 200) {
					System.out
							.print("\n the sum of the numbers (without the skipped ones) is bigger than 200");
					break;
				}
				if(a== Math.pow(b, 2)){
				    a--;
				    break;}
				a++;

			}
			if (a == Math.pow(b, 2))
				break;

			while (a >= Math.pow(b, 2)) {
				// От заданието разбирам, че само Б е на степен 2!

				if (a % 3 == 0) {
					System.out.print("skip " + a + ", ");
				} else {
					System.out.print(a + ", ");
					sum += a;
				}
				// в случая ще ги изведи в низхдящ ред, ако искам във възходящ
				// ще
				// увеличавам B (вместо да намалям А)
				if (sum > 200) {
					System.out
							.print("\n the sum of the numbers (without the skipped ones) is bigger than 200");
					break;

				}
				a--;
			}
			break;
		}
	}
}
