public class ArraysProblemEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		int check = 1;
		int index1 = 0;
		int index2 = 0;
		int[] array = { 1, 2, 2, -1, -1,-1, -1, -1, 4, 43, 3, 1, 3, 3, 0 };

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				count++;
			}
			if (count > check) {
				check = count;
				index1 = array[i];

			}
			if (array[i] != array[i + 1]) {
				count = 1;
			}
		}
//		Вариант 2.- едно тъпо решение.
//		for (int i = 0; i <= array.length - (1 + check); i++) {
//			count = 1;
//			for (int j = 1; j <= check-1 ; j++) {
//				if (array[i] == array[i + j]) {
//					index1 = i;
//					index2 = i + j;
//					count++;
//				} else {
//					break;
//				}
//
//			}
//			if (count == check) {
//				break;
//			}
//		}
//
//		for (int i = index1; i <= index2; i++) {
//			System.out.print(array[i] + " ");
//		}
		for(int i=0;i<check;i++){
		System.out.print(index1+" ");}
	}
}
