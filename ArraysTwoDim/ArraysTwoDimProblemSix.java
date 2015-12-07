public class ArraysTwoDimProblemSix {
	public static void main(String[] args) {
		int[][] arr = { { 100, 2, 55, 4, 10, 0 }, { 6, 7, 2, 9, 15, 32 },
				{ 5, 8, 7, 4, -12, 1 }, { -1, 8, 7, 8, 0, 1 },
				{ 5, 8, 7, -5, 22, 1 }, { 6, 2, 5, 9, 6, 35 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int sum = 0;
		int maxSum = 0;
		for (int i = 1; i < arr.length; i += 2) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}
			System.out.println("The sum of the row is: " + sum);
			maxSum += sum;
			sum = 0;
		}
		System.out.println("The sum of the even rows is: " + maxSum);
	}
}
