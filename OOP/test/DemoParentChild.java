package test;

import java.util.Arrays;

public class DemoParentChild {
public static void main(String[] args) {
//	Child az=new Child();
//	az.play();
	int[] w=new int[3];
	w[0]=1;
	w[1]=2;
	w[2]=3;
	int[] o;
	o=Arrays.copyOf(w,2);
	System.out.println(o[1]);
}
}
