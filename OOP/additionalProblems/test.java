package additionalProblems;

import java.util.Arrays;

public class test {
	static int getter(){
		return 2;
	}
	
	public static void main(String[] args) {
		int ad=1+getter();
		System.out.println(ad);
		String a = "asd";
		System.out.println(a);
		int c = 1;
		int b = 2;
		int[] q = { 2, 5, 6, 2, 3, 67, 1, 2, 4, 67, 233 };
		Arrays.sort(q);
		System.out.println(Arrays.toString(q));
		if(b==1){
			System.out.println("asddd");
		}
		int asd=1;
		System.out.println(asd);
	}
}
