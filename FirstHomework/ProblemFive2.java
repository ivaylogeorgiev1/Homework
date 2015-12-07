import java.util.Scanner;


public class ProblemFive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a=new double[3];
		double c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers- A,B and C:");
		System.out.println("Enter number A:");
		for(int i=0;i<3;i++){
			a[i]=sc.nextDouble();
			}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				if(a[j]>a[j+1]){
					c=a[j];
				a[j]=a[j+1];
				a[j+1]=c;}
			}
			}
			for(int i=2;i>=0;i--){
			System.out.println(a[i]);
			}
		
		}}