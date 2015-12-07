import java.util.Scanner;

public class StringsProblemSeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("");
		str = sc.nextLine();
		String[] arrStr = str.split(" ");
		int max = arrStr[0].length();
		int i = 0;
		for (i = 1; i < arrStr.length; i++) {
			if (max < arrStr[i].length()) {
				max = arrStr[i].length();
			}

		}
		System.out.println((i) + " Words, the longest is with " + max
				+ " symbols!");
	}
}
