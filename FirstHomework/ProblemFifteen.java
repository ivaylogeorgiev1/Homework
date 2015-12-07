import java.util.Scanner;


public class ProblemFifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=-1;
		Scanner sc=new Scanner(System.in);
		while (h<0 || h>24){
			System.out.println("въведете час:");
			h=sc.nextInt();
		}
		if((h>=18 && h<=24) || (h>=0 &&h<4)) {
			System.out.println("Добър вечер!");
		}
		if(h>=4 && h<9){
			System.out.println("Добро утро!");
		}
		if(h>=9 && h<18){
			System.out.println("Добър ден!");
		}
	}
// интервалите са приети [18:4) ;[4:9);[9;18)
}
