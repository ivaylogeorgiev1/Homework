package additionalProblems;

import java.util.Scanner;

public class KoncheShah {
	static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void hod(int[][] arr, int coor1, int coor2) {
		if (coor1 >= arr.length || coor1 < 0 || coor2 >= arr[0].length
				|| coor2 < 0) {
			return;
		}
		if (arr[coor1][coor2] == 7) {
			return;
		}
		arr[coor1][coor2] = 7;
		hod(arr, coor1 + 1, coor2 + 2);
		hod(arr, coor1 - 1, coor2 + 2);

		hod(arr, coor1 + 1, coor2 - 2);
		hod(arr, coor1 - 1, coor2 - 2);

		hod(arr, coor1 + 2, coor2 - 1);
		hod(arr, coor1 + 2, coor2 + 1);

		hod(arr, coor1 - 2, coor2 - 1);
		hod(arr, coor1 - 2, coor2 + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number of rows of the array.");
		int rows = sc.nextInt();
		System.out.println("Please input number of columns of the array.");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = 0;
			}
		}
		print(arr);
		System.out.println();
		System.out
				.println("Please input number of the starting position's row.");
		int coor1 = sc.nextInt();
		System.out
				.println("Please input number of the starting position's column.");
		int coor2 = sc.nextInt();
		hod(arr, coor1 - 1, coor2 - 1);
		print(arr);

	}
}