public class ArraysTwoDimProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 3, 54, 2, 42, 23 }, { 9, 59, 2, 9, 16 },
				{ 5, 8, 22, 8, 45 }, { 6, 22, 45, 9, 11 },
				{ 5, 23, 42, 3, 29 }, { 2, 6, 2, 22, 2 } };
		 for (int i = 0; i < arr.length; i++) {
			 for (int j = 0; j < arr[0].length; j++) {
			 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
			 }
			 System.out.println();
		int min = arr[0][0];
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("The minimum value is: " + min);
		System.out.println("The maximum value is: " + max);
	}

}
