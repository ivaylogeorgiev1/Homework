import java.util.Arrays;
import java.util.Scanner;

public class ArrayasProblemNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		int[] arr2 = new int[6]; //този масив ни е нужен за варианта с допълнителен масив
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter element " + (i + 1));
			arr[i] = sc.nextInt();
		}
		// Вариант с допълнителен масив
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = temp;

		}
		// Вариант с допълнителен масив
		// for (int i = 0; i < arr.length; i++) {
		// arr2[arr.length - 1 - i] = arr[i];
		//
		// }
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = arr2[i];
		// }
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
