public class ArraysTwoDimProblemFour {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 2, 9, 9 },
				{ 5, 8, 7, 8, 1 }, { 6, 2, 5, 9, 0 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
