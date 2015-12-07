import java.util.Scanner;


public class LoopsProblemSeventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b=0;
		char symbl;
		while (b<3 || b>20){
			System.out.println("enter the side of the square");
			b=sc.nextInt();
		}
		System.out.println("Enter a prefered symbol for the inside of the square");
		symbl=sc.next().charAt(0);
		for (int i=1;i<=b;i++){
			for(int j=1;j<=b;j++){
				if(i==b || i ==1 || j==b || j==1){
				System.out.print("*");
			}
				else{System.out.print(symbl);}
				
			}
			System.out.println(" ");
		}
	}

}
