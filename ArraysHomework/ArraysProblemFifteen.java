import java.util.Locale;
import java.util.Scanner;

public class ArraysProblemFifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = new double[5];
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		double temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (Math.abs(arr[j]) < Math.abs(arr[j + 1])) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}

	}

}
