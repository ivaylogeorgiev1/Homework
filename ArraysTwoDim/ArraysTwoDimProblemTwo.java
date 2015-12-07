import java.util.Scanner;

public class ArraysTwoDimProblemTwo {
	public static void main(String[] args) {
		int rows;
		Scanner sc = new Scanner(System.in);
		System.out
				.println("How much rows and columns do you want in the matrix?");
		rows = sc.nextInt();
		int[][] arr = new int[rows][rows];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter the elements in row #" + (i + 1));
			for (int j = 0; j < arr[0].length; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		 for (int i = 0; i < arr.length; i++) {
				 for (int j = 0; j < arr[0].length; j++) {
				 System.out.print(arr[i][j] + " ");
				 }
				 System.out.println();
				 }
				 System.out.println();
				 
				 
				 
		int i = 0;
		int j = 0;
		while (i < rows) {
			System.out.print(arr[i][j] + " ");
			i++;
			j++;
		}
		j = rows - 1;
		i = 0;
		System.out.println();
		while (j >= 0) {
			System.out.print(arr[i][j] + " ");
			i++;
			j--;
		}
		
		
		//Вариант 2.
		
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[0].length; j++) {
		// if (i == j) {
		// System.out.print(arr[i][j] + " ");
		// }
		// }
		// }
		// System.out.println(" ");
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = arr[0].length - 1; j >= 0; j--) {
		// if ((j + i) == (arr.length - 1)) {
		// System.out.print(arr[i][j] + " ");
		// }
		// }
		// }
	}
}
