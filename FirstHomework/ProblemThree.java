import java.util.Scanner;


public class ProblemThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=0,b=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers- A and B:");
		System.out.println("Enter number A:");
		a=sc.nextDouble();
		System.out.println("Enter number B:");
		b=sc.nextDouble();
		c=a;
		a=b;
		b=c;
		System.out.println("A="+a);
		System.out.println("B="+b);

	}

}
