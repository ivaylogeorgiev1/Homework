import java.util.Scanner;

public class ArraysProblemSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elements = 0;
		int elements2 = 0;
		int i;
		System.out.println("enter the length of the arrays");
		Scanner sc = new Scanner(System.in);
		elements = sc.nextInt();
		elements2 = sc.nextInt();
		int[] array = new int[elements];
		int[] array2 = new int[elements2];
		System.out.println("Enter " + elements
				+ " number(s) for the first array ");
		for (i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter " + elements2
				+ " number(s) for the second array ");
		for (i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}
		if (array.length == array2.length) {
			for (i = 0; i < array.length; i++) {
				if (array[i] != array2[i]) {
					System.out.println("The arrays are not equal");
					break;

				}

			}
			if (i == array.length) {
				System.out
						.println("The arrays have equal length and equal element of each respective index");
			}
		} else {
			System.out.println("The arrays are not equal");
		}

	}

}
