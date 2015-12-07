import java.util.Scanner;

public class ArraysProblemThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int[] array = new int[10];
		array[0] = num;
		array[1] = num;
		for (int i = 2; i < 10; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
