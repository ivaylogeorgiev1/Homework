public class ArraysProblemTwo {
	public static void main(String[] args) {
		//Въведен масив - разбирам, че стойностите на масива са инициализирани
		int[] array = { 2, 4, 6, 1, 7, 15 };
		int[] array2 = new int[6];
		int j=array.length/2;
		for (int i = 0; i < array.length/2; i++) {
			array2[i] = array[i];
			
		}
		for (int i = array.length-1; i > (array.length/2)-1; i--) {
			
			array2[i] = array[j];
			j++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array2[i]+" ");
		}
	}

}
