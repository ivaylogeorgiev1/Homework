public class ArraysTwoDimProblemThree {
	public static void main(String[] args) {
		int[][] arr = { { 3, 54, 2, 42, 23 }, { 9, 58, 2, 9, 16 },
				{ 5, 8, 22, 8, 45 }, { 6, 22, 45, 9, 11 } };
		double sum = 0;
		int i;
		int j = 0; // защо иска инициализация на j, а не иска на i.
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("The sum is: " + sum);
		sum = sum / (i * j);
		System.out.println("The average value is: " + sum);
	}
}
