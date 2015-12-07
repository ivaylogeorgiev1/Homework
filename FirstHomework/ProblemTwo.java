import java.util.Scanner;


public class ProblemTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		double c=0,d=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integer numbers(A and B):");
		System.out.println("Enter number A:");
		a=sc.nextInt();
		System.out.println("Enter number B:");
		b=sc.nextInt();
		// Next --> the input for float numbers
		System.out.println("Enter two numbers(A and B):");
		System.out.println("En"
				+ "ter number A:");
		c=sc.nextDouble();
		System.out.println("Enter number B:");
		d=sc.nextDouble();		
		
		System.out.println("The results for the Integer numbers:");
		System.out.println("The sum of A and B is:"+(a+b));
		System.out.println("The difference of A and B is:"+(a-b));
		System.out.println("The product of A and B is:"+(a*b));
		System.out.println("The reminder of A and B is:"+(a%b));
		System.out.println("The quotient of A and B is:"+(a/b)+"\n");
		System.out.println("The result for float numbers:");
		System.out.println("The sum of A and B is:"+(c+d));
		System.out.println("The difference of A and B is:"+(c-d));
		System.out.println("The product of A and B is:"+(c*d));
		System.out.println("The reminder of A and B is:"+(c%d));
		System.out.println("The quotient of A and B is:"+(c/d));
	}

}
