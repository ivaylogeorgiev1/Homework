import java.util.Scanner;


public class ProblemEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int temp;
		int b=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Въведете четири цифрено число:");
		a=sc.nextInt();
		while (a<1000 || a>9999){
			System.out.println("Въведете число между 1000 и 9999");
			a=sc.nextInt();}
			b=a%10;
			temp=(a%10000)/1000;
			b=b+temp*10;
			System.out.println(b);
			c=a%1000/100;
			temp=a%100/10;
			c=c*10+temp;
			System.out.println(c);
			if(b<c)
				System.out.println("по- малко");
			else if (b==c)
				System.out.println("равни");
			else
				System.out.println("по- голямо");			
			
		
		
			
		
		

	}

}
