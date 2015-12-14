package additionalProblems;

import java.util.Scanner;
// da naprawq 1 pyt da izkacha Drwa i WINNer
//restrikcii za whoda i syobshteniq za whod

public class MorskiShah {
	public static void main(String[] args) {
		char[][] arr = new char[3][3];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = '-';
			}
		}
		printBoard(arr);
		
		while (!(checkForEnd(arr))) {
			byte position1 = -1;
			byte position2 = -1;
			while ((position1 < 1 || position1 > 3)
					|| (position2 < 1 || position2 > 3)) {
				System.out.println("Please enter coordinate 1:");
				position1 = sc.nextByte();
				System.out.println("Please enter coordinate 2");
				position2 = sc.nextByte();
			}
			position1--;
			position2--;
			if ((position1 >= 0 && position2 >= 0 && position1 < arr.length && position2 < arr.length)) {
				if (arr[position1][position2] == '-') {
					if (count % 2 == 0) {
						arr[position1][position2] = 'X';
						count++;
					} else {
						arr[position1][position2] = 'O';
						count++;
					}
				} else {
					System.out.println("Filled field");
				}
			}
			printBoard(arr);
			

		}
	}

	static void printBoard(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static boolean checkForEnd(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] != '-' && arr[i][1] == arr[i][0]
					&& arr[i][2] == arr[i][1]) {
				System.out.println("We have a winner");
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[0][i] != '-' && arr[1][i] == arr[0][i]
					&& arr[2][i] == arr[1][i]) {
				System.out.println("We have a winner");
				return true;
			}
		}

		if (arr[1][1] == arr[0][0] && arr[2][2] == arr[1][1]
				&& arr[0][0] != '-') {
			System.out.println("We have a winner");
			return true;

		}
		if (arr[1][1] == arr[0][2] && arr[2][0] == arr[1][1]
				&& arr[0][2] != '-') {
			System.out.println("We have a winner");
			return true;
		}
		boolean filled = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == '-') {
					filled = false;
				}
			}
		}
		if (filled) {
			System.out.println("It's Draw");
			return true;

		} else {
			return false;
		}

	}
}
