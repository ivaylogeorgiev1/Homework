import java.util.Scanner;


public class ProblemFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=0,b=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers- A,B and C:");
		System.out.println("Enter number A:");
		a=sc.nextDouble();
		System.out.println("Enter number B:");
		b=sc.nextDouble();
		System.out.println("Enter number C:");
		c=sc.nextDouble();
		if(a>b){
			if(a>c && c>b){
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);}
			else if(a>c&&c<b){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			else if(a<c && c>b){
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}
			}
		else if(a<b){
			if(b>c&&a>c){
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);}
			else if(b>c&&a<c){
				System.out.println(b);
				System.out.println(c);
				System.out.println(a);
			}
			else if (b<c && c>a){
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
		}


		

}}}
