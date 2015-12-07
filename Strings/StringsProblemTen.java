import java.util.Scanner;

public class StringsProblemTen {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = new String("");
		str = sc.next();
		String a = "";
		int l = str.length();
		for (int i = 0; i < l; i++) {

			a = a + "" + (char) (str.charAt(i) + 5);
		}
		System.out.println(a);

	}
}
