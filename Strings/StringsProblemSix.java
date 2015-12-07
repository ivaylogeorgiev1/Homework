import java.util.Scanner;

public class StringsProblemSix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("");
		str = sc.nextLine();
		String[] arrStr = str.split(" ");
		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = arrStr[i].substring(0, 1).toUpperCase()
					+ arrStr[i].substring(1, arrStr[i].length()).toLowerCase();
			System.out.print(arrStr[i] + " ");
		}
	}
}
