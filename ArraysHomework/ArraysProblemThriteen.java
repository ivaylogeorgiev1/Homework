import java.util.Arrays;
import java.util.Scanner;


public class ArraysProblemThriteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal=0;
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		decimal=sc.nextInt();
		int forCount=decimal;
		while(forCount>0){
			forCount/=2;
			count++;
			}
		int[] arr=new int[count];
		for(int i=(count-1);i>=0;i--){
			arr[i]=decimal%2;
			decimal/=2;
		}
		for(int i=0;i<count;i++){
			System.out.print(arr[i]);
		}
		//System.out.println(Arrays.toString(arr));
	}

}
