import java.util.Scanner;

public class ArraysLProblemFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elements = 0;
		int count = 0;
		System.out.println("enter the length of the array");
		Scanner sc = new Scanner(System.in);
		elements = sc.nextInt();
		int[] array = new int[elements];
		System.out.println("Enter " + elements + " number(s)");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] == array[(array.length - 1-i)]) {
				count++;
			}
		}
		if (count == (array.length) / 2) {
			System.out.println("specular array");
			
		} else {
			System.out.println("not specular array");
			

		}

	}
}
