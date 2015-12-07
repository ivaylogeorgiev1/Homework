import java.util.Arrays;

public class StringsProblemTwelve {
	static int[] numbers(int n) {
		// if (n == 1) {
		// return 1;
		// }
		// if (n == 0) {
		// return 0;
		// }
		// return n+numbers(n-1);
		// }
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (i + 1);
		}
		return arr;
	}

	public static void main(String[] args) {

		int n = 5;
		int[] arr;
		arr = numbers(n);
		System.out.println(Arrays.toString(arr));
	}
}
