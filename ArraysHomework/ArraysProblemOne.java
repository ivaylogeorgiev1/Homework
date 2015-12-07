import java.util.Scanner;

public class ArraysProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 7 numbers");
		for (int i = 0; i < 7; i++) {
			array[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE; //or  int min=array[0];
		for (int i = 0; i < 7; i++) {
			if (min > array[i] && array[i] % 3 == 0) {
				min = array[i];
			}
		}
		System.out.println(min);

	}

}
