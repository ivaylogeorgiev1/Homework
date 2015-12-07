import java.util.Scanner;


public class LoopsProblemNineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num < 10 || num > 99) {
			System.out.println("enter a number between 10 and 99");
			num = sc.nextInt();
		}
		while (num>1){
			if(num%2==0){
				num=num/2;
				System.out.print(num+" ");
			}
			else {
				num=(3*num)+1;
				System.out.print(num+" ");
			}
		}

	}

}
