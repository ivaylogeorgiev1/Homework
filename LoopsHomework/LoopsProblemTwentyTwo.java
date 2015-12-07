import java.util.Scanner;

public class LoopsProblemTwentyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (num < 1 || num > 999) {
			System.out.println("enter a number between 1 and 999");
			num = sc.nextInt();
		}
		int count=1;
		while(count<=10){
			if(num % 2==0 ||num %3==0 || num%10==5){
				System.out.print(count+":"+num);
				if (count<10){
					System.out.print(", ");
				}
				count++;
			}
			num++;
		}

	}

}
