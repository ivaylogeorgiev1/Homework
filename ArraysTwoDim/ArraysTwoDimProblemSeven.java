public class ArraysTwoDimProblemSeven {
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
		int i = 0;
		int j = 0;
		int sum = 0;
		int maxSum = 0;
		while (i < arr.length) {
			if ((i + j) % 2 == 0) {
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}
			j++;
			if (j == arr.length) {
				j = 0;
				i++;
				System.out.println("  The sum of the row is: " + sum);
				maxSum += sum;
				sum = 0;
			}
		}
		System.out.println("\nThe sum of the elements is : " + maxSum);
	}
}
