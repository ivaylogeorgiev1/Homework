import java.util.Scanner;


public class ProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=0,b=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers(A and B):");
		System.out.println("Enter number A:");
		a=sc.nextDouble();
		System.out.println("Enter number B:");
		b=sc.nextDouble();
		System.out.println("Enter a number to check whether it is between A and B");
		c=sc.nextDouble();
		if (a>c && b<c)  {
			System.out.println("The number is between A and B");
		}
		else if (b>c && a<c)  {
			System.out.println("The number is between A and B");
		}
		else {
			System.out.println("The number is not between A and B");
		}
		
		
		

	}

}
