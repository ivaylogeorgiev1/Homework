import java.util.Scanner;

public class ArraysProblemEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[7];
		int i;
		int comma = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < arr.length; i++) {
			System.out.println("Please enter element " + (i + 1));
			arr[i] = sc.nextInt();
		}
		for (i = 0; i < arr.length; i++) {
			// Това го правя за да няма запетая след последното число, иначе е
			// проста задачата :)
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				count++;
			}
		}
		for (i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				System.out.print(arr[i]);
				comma++;
				if (comma < count) {
					System.out.print(", ");
				}
			}
		}
		System.out.println(" - " + count + " Number(s)");
	}

}
