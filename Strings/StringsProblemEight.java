import java.util.Scanner;

public class StringsProblemEight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("");
		str = sc.next();
		boolean flag = true;
		str = str.toLowerCase();
		for (int i = 0; i < str.length() / 2; i++) {
			if (!(str.charAt(i) == str.charAt(str.length() - 1 - i))) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Палиндром");
		} else {
			System.out.println("Не е палиндром");
		}
	}
}
