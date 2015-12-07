import java.util.Scanner;


public class ProblemEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Въведете трицифрено число, което не съдържа цифрата 0");
		a=sc.nextInt();
		while((a<100 ||a>999)||(String.valueOf(a).contains("0"))){
			System.out.println("Въведете трицифрено число, което не съдържа цифрата 0");
			a=sc.nextInt();}
		if((a%(a%10)==0) && (a%((a%100)/10)==0) && (a%((a%1000)/100)==0)){
			System.out.println("Числото се дели на всяка своя цифриа");
		}
		else {
			System.out.println("Числото не се дели на всяка своя цифра");
		}
	}

}
