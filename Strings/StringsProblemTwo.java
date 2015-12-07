import java.util.Scanner;

public class StringsProblemTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("");
		str = sc.next();
		String str2 = new String("");
		str2 = sc.next();

		String temp = "";
		temp = str;
		str = str2.substring(0, 5) + str.substring(5, str.length());
		str2 = temp.substring(0, 5) + str2.substring(5, str2.length());

		if (str.length() > str2.length()) {
			// str = str2.substring(0, 5)+str.substring(5,str.length());
			System.out.println(str.length() + " " + str);

		} else {
			// str2 = str.substring(0, 5)+str2.substring(5,str2.length());
			System.out.println(str2.length() + " " + str2);
		}
	}
}
