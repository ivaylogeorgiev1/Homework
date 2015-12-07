import java.util.Scanner;

public class StringsProblemNine {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = new String("");
		str = sc.next();
		int num = 0;
		int index = 0;
		int sum = 0;
		// System.out.println((int)(test));
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 48 && str.charAt(i) <= 57)
					|| str.charAt(i) == 45) {
				if (str.charAt(i) == 45) {
					index = 1;
				} else {
					num = ((10 * num) + Character
							.getNumericValue(str.charAt(i)));
				}
				if (i < (str.length() - 1)) {
					if (!(str.charAt(i + 1) >= 48 && str.charAt(i + 1) <= 57)) {
						if (index == 0) {
							sum += num;
							System.out.println(num);
						} else {
							sum += -num;
							System.out.println(-num);
							index = 0;
						}

						num = 0;
					}
				}
				if (i == str.length() - 1) {
					if (index == 0) {
						sum += num;
						System.out.println(num);
					} else {
						if (num != 0) {
							sum += -num;
							System.out.println(-num);
						}
					}
				}
			}
		}
		System.out.println("The sum is: " + sum);
	}
}