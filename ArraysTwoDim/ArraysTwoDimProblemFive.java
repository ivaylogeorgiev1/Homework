public class ArraysTwoDimProblemFive {
	public static void main(String[] args) {
		int[][] arr = { { 100, 2,55, 4 }, { 6, 7, 2, 9 }, { 5, 8, 7, 8 },
				{ 6, 2, 5, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int sum = 0;
		int sumCol = Integer.MIN_VALUE;
		int sumRow = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
			if (sumRow < sum) {
				sumRow = sum;
			}
			sum = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[j][i];
			}
			if (sumCol < sum) {
				sumCol = sum;
			}
			sum = 0;
		}
		System.out.println("the biggest value of the sum of a row is: "+sumRow);
		System.out.println("the biggest value of the sum of a column is: "+sumCol);
		if (sumRow > sumCol) {
			System.out
					.println("The sum of the row is bigger than the sum of the column");
		} else {
			System.out
					.println("The sum of the column is bigger than the sum of the row");
		}
	}
}
