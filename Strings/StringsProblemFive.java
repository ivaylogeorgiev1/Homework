import java.util.Scanner;

public class StringsProblemFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		char[] arr2 = sc.next().toCharArray();
		int count = 0;
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[j] == arr[i]) {
					//намирам първия елемент от първата дума, който се съдържа във втората дума
					index1 = i;
					index2 = j;
					count++;
					break;
				}
			
			}
			if (count > 0) {
				break;
			}
		}
		if (count == 0) {
			System.out.println("There is no repeating characters in the words");
		} else {

			for (int i = 0; i < index1; i++) {

				for (int j = 0; j < index2; j++) {
					System.out.print(" ");
				}
				System.out.println(arr[i]);
			}
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(arr2[i]);
			}
			System.out.println();
			for (int i = index1 + 1; i < arr.length; i++) {

				for (int j = 0; j < index2; j++) {
					System.out.print(" ");
				}
				System.out.println(arr[i]);
			}

		}
	}

}