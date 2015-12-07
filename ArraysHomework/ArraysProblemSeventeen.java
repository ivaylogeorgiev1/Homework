import java.text.DecimalFormat;

public class ArraysProblemSeventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] arr = {1,3,2,6,4,7,-1,2,0,66,-2};
		int[] arr = {3,1,5,2,7,-1,1,0};
		boolean flag=true;
		for(int i=1;i<arr.length-1;i++){
			boolean a=	arr[i]<arr[i-1] && arr[i]<arr[i+1];
			boolean b = arr[i]>arr[i-1] && arr[i]>arr[i+1];
				if(!(a || b)){
//			if(!(arr[i]<arr[i-1] && arr[i]<arr[i+1] || arr[i]>arr[i-1] && arr[i]>arr[i+1])){
				flag=false;
			}
						
		}
		if (flag){
			System.out.println("Zigz");
		}
		else {
			System.out.println("Nezigz");
		}
	}
}
