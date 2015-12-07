import java.util.Scanner;

public class StringsProblemThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("");
		str = sc.next();
		String str2 = new String("");
		str2 = sc.next();
		int length = 0;
		int flagCount = 0;
		if (str.length() > str2.length()) {
			System.out.println("The first words has more characters");
			length = str2.length();
		}
		if (str.length() == str2.length()) {
			System.out.println("The words have equal characters");
			length = str.length();
		}
		if (str.length() < str2.length()) {
			System.out.println("The second words has more characters");
			length = str.length();
		}

		str = str.toLowerCase();
		str2 = str2.toLowerCase(); // за да не прави разлика от голяма и малка
									// буква
		System.out.print("Character difference by positions: ");
		for (int i = 0; i < length; i++) {
			// сравнявам до броя символи на по-малката дума
			if (str.charAt(i) == str2.charAt(i)) {
			} else {
				System.out.print((i + 1) + " ");
				System.out.println(str.charAt(i) + "-" + str2.charAt(i));
				flagCount++;
			}

		}
		if (flagCount == 0) {
			System.out.println("No character difference by positions");
		}
	}
}
