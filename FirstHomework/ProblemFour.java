import java.util.Scanner;


public class ProblemFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers- A and B:");
		System.out.println("Enter number A:");
		a=sc.nextDouble();
		System.out.println("Enter number B:");
		b=sc.nextDouble();
		if(a>b){
			System.out.println(b);
			System.out.println(a);}
		else{
			System.out.println(a);
			System.out.println(b);
		}

	}

}
