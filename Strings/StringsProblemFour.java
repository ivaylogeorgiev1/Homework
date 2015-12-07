import java.util.Scanner;

public class StringsProblemFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("");
		str = sc.nextLine();
		int count = 0;
		int count2 = 0;
		String[] arrStr = str.split(",");
		arrStr[0] = arrStr[0].trim();
		arrStr[1] = arrStr[1].trim(); // Ако искаме да не броим интервалите
										// преди и след имената.
		// Предполагам, че името ще се въведе само с един интервал между трите
		// имена на човек. Иначе трябва повече код да се пише.
		for (int i = 0; i < arrStr[0].length(); i++) {
			count += arrStr[0].charAt(i);
		}
		for (int i = 0; i < arrStr[1].length(); i++) {
			count2 += arrStr[1].charAt(i);
		}
		if (count > count2) {
			System.out.println(arrStr[0]);
		}
		if ((count == count2)) {
			System.out.println("Равен брой ASCII символи");
		}
		if ((count < count2)) {
			System.out.println(arrStr[1]);
		}
		System.out.println(count + " " + count2);
	}
}
