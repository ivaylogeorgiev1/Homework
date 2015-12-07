import java.util.Scanner;

public class ArraysProblemTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[7];
		double average = 0;
		int i = 0;
		int index=0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < arr.length; i++) {
			System.out.println("Please enter element " + (i + 1));
			arr[i] = sc.nextInt();
			average += arr[i];
		}
		double temp = Integer.MAX_VALUE;
		average /= (i);
		for (i = 0; i < arr.length; i++) {
			if (temp > Math.abs((arr[i]) - average)) {
				temp = Math.abs((arr[i]) - average);
				index=i;
			}
		}
		System.out.println(arr[index]);
	}
}
