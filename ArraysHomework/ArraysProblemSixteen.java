import java.util.Arrays;


public class ArraysProblemSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = {-1.12,-2.43,3.1,4.2,0,6.4,-7.5,8.6,9.1,-4};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++){
			if(arr[i]<-0.231){
				arr[i]=Math.pow((i+1),2)+41.25;
			}
			else{
				arr[i]=(i+1)*arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.printf("%.2f",arr[i]);
			System.out.print(" ");

		}
	}

}
