import java.util.Scanner;

public class ArraysProblemSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elements = 0;
		System.out.println("Enter the number of elements of the array:");
		Scanner sc = new Scanner(System.in);
		elements = sc.nextInt();
		int[] array = new int[elements];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int[] array2 = new int[elements];
		array2[0] = array[0];
		array2[array2.length - 1] = array[array.length - 1];
		for (int i = 1; i < array.length - 1; i++) {
			array2[i] = array[i - 1] + array[i + 1];

		}
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array2[i] + " ");
		}
	}

}
