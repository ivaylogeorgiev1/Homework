import java.util.Arrays;

public class ArraysProblemEighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 2, 6, 4, 7, 4, 2, 0, 66, 2 };
		int[] arr2 = { 2, 66, 1, 6, 8, 7, 9, 9, 4, 626, 1 };
		int[] arr3 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= arr2[i]) {
				arr3[i] = arr[i];
			} else {
				arr3[i] = arr2[i];
			}
		}
		System.out.println(Arrays.toString(arr3));
	}

}
