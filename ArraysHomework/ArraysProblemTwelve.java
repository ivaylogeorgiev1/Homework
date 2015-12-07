import java.util.Arrays;
import java.util.Scanner;


public class ArraysProblemTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[7];
		int i;
		int temp=0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < arr.length; i++) {
			System.out.println("Please enter element " + (i + 1));
			arr[i] = sc.nextInt();
		}
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];

		System.out.println(Arrays.toString(arr));
	}

}
