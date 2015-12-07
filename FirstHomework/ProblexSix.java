import java.util.Scanner;


public class ProblexSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a=new double[3];
		double c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers- A1,A2 and A3:");
		System.out.println("Enter number A:");
		for(int i=0;i<3;i++){
			a[i]=sc.nextDouble();
			}
		
		c=a[0];
		a[0]=a[1];
		a[1]=a[2];
		a[2]=c;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		

	}

}
