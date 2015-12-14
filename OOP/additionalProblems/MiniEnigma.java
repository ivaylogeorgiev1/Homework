package additionalProblems;

import java.util.Scanner;

public class MiniEnigma {
	public static void main(String[] args) {
		char[][] arr = { { 'q', 'w', 'e', 'r', 't' },
				{ 'y', 'u', 'i', 'o', 'p' }, { 'a', 's', 'd', 'f', 'g' },
				{ 'h', 'j', 'k', 'l', 'x' }, { 'c', 'v', 'b', 'n', 'm' } };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text:");
		String text = sc.nextLine();
		if (text.length() % 2 == 1) {
			text = text + 'p';
		}
		System.out.println(text);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = Character.toUpperCase(arr[i][j]);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		text = encrypt(arr, text);
		System.out.println("Encrypted: " + text);
		text = decrypt(arr, text);
		System.out.println("Decrypted: " + text);
	}

	static String encrypt(char[][] arr, String text) {
		String twoLetter;
		String encryptedWord = "";
		int indexRowFirstLetter = -1;
		int indexColFirstLetter = -1;
		int indexRowSecondLetter = -1;
		int indexColSecondLetter = -1;
		text = text.toUpperCase();
		for (int i = 0; i < text.length(); i += 2) {

			twoLetter = text.substring(i, i + 2);
			if (twoLetter.charAt(0) == 'Z' || twoLetter.charAt(1) == 'Z') {
				encryptedWord += "" + twoLetter.charAt(0) + twoLetter.charAt(1);
				continue;
			}
			for (int q = 0; q < arr.length; q++) {
				for (int w = 0; w < arr[0].length; w++) {
					if (twoLetter.charAt(0) == arr[q][w]) {
						indexRowFirstLetter = q;
						indexColFirstLetter = w;
					}
					if (twoLetter.charAt(1) == arr[q][w]) {
						indexRowSecondLetter = q;
						indexColSecondLetter = w;
					}
				}

			}

			boolean rows = indexRowFirstLetter == indexRowSecondLetter;
			boolean cols = indexColFirstLetter == indexColSecondLetter;
			if (rows) {
				indexColFirstLetter++;
				indexColFirstLetter = eHelp(arr.length, indexColFirstLetter);
				indexColSecondLetter++;
				indexColSecondLetter = eHelp(arr.length, indexColSecondLetter);
			}
			if (cols) {
				indexRowFirstLetter++;
				indexRowFirstLetter = eHelp(arr[0].length, indexRowFirstLetter);
				indexRowSecondLetter++;
				indexRowSecondLetter = eHelp(arr[0].length,
						indexRowSecondLetter);
			}
			if (!(cols || rows)) {
				int temp;
				temp = indexColFirstLetter;
				indexColFirstLetter = indexColSecondLetter;
				indexColSecondLetter = temp;
			}
			encryptedWord += "" + arr[indexRowFirstLetter][indexColFirstLetter]
					+ arr[indexRowSecondLetter][indexColSecondLetter];
			// indexRowFirstLetter = -1;
			// indexColFirstLetter = -1;
			// indexRowSecondLetter = -1;
			// indexColSecondLetter = -1;
			// gyrmi li ako ima z, ili continue
			// kak da kaja po lesen na4in, ako masiva e out of bounds bez da
			// proverqwam wseki index?
		}
		return encryptedWord;
	}

	static String decrypt(char[][] arr, String text) {
		String twoLetter;
		String decryptedWord = "";
		int indexRowFirstLetter = -1;
		int indexColFirstLetter = -1;
		int indexRowSecondLetter = -1;
		int indexColSecondLetter = -1;
		text = text.toUpperCase();
		for (int i = 0; i < text.length(); i += 2) {
			twoLetter = text.substring(i, i + 2);
			if (twoLetter.charAt(0) == 'Z' || twoLetter.charAt(1) == 'Z') {
				decryptedWord += "" + twoLetter.charAt(0) + twoLetter.charAt(1);
				continue;
			}
			for (int q = 0; q < arr.length; q++) {
				for (int w = 0; w < arr[0].length; w++) {
					if (twoLetter.charAt(0) == arr[q][w]) {
						indexRowFirstLetter = q;
						indexColFirstLetter = w;
					}
					if (twoLetter.charAt(1) == arr[q][w]) {
						indexRowSecondLetter = q;
						indexColSecondLetter = w;
					}

				}

			}
			boolean rows = indexRowFirstLetter == indexRowSecondLetter;
			boolean cols = indexColFirstLetter == indexColSecondLetter;
			if (rows) {
				indexColFirstLetter--;
				indexColFirstLetter = deHelp(arr.length, indexColFirstLetter);
				indexColSecondLetter--;
				indexColSecondLetter = deHelp(arr.length, indexColSecondLetter);
			}
			if (cols) {
				indexRowFirstLetter--;
				indexRowFirstLetter = deHelp(arr[0].length, indexRowFirstLetter);
				indexRowSecondLetter--;
				indexRowSecondLetter = deHelp(arr[0].length,
						indexRowSecondLetter);
			}
			if (!(cols || rows)) {
				int temp;
				temp = indexColFirstLetter;
				indexColFirstLetter = indexColSecondLetter;
				indexColSecondLetter = temp;
			}
			decryptedWord += "" + arr[indexRowFirstLetter][indexColFirstLetter]
					+ arr[indexRowSecondLetter][indexColSecondLetter];
			// indexRowFirstLetter = -1;
			// indexColFirstLetter = -1;
			// indexRowSecondLetter = -1;
			// indexColSecondLetter = -1;
		}
		return decryptedWord;
	}

	static int eHelp(int arrLength, int index) {
		if (index >= arrLength) {
			return 0;
		} else
			return index;
	}

	static int deHelp(int arrLength, int index) {
		if (index < 0) {
			return arrLength-1;
		} else
			return index;
	}

}
