import java.util.Arrays;

public class ArraysProblemFourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = { 5.3, 7.35, 1.31, 2.1, 5.33, 0.8, 3.12, -2.4, -1.4,
				0.4, 0 };
		int j=0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 3 && arr[i] > -3) {
				count++;
			}
		}
		double[] newArr = new double[count];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 3 && arr[i] > -3) {
				newArr[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}

}
