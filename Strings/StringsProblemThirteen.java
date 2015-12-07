import java.util.Arrays;


public class StringsProblemThirteen {
	static int[] bigArray(int[] a,int[] b){
		int i=0;
		int[] arr=new int[a.length+b.length];
		for(i=0;i<(a.length);i++){
				arr[i]=a[i];}
		for(int j=0;j<(b.length);j++){
			arr[i+j]=b[j];}

		return arr;
	}
	public static void main(String[] args) {
		int[] arr1={1,3,5,22};
		int[] arr2={0,2323,1,-1};
		arr1=bigArray(arr1,arr2);
		System.out.println(Arrays.toString(arr1));
	}
}
