import java.util.Scanner;


public class ProblemTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		System.out.println("Въведете колко литра вода има в цинстерната(от 10 до 9999):");
		a=sc.nextInt();
		while(a<10 || a >9999){
			System.out.println("Въведете колко литра вода има в цинстерната(от 10 до 9999):");
			a=sc.nextInt();
		}
		if(a%5==0){
			System.out.println("брой кофи по 2л."+(a/5));
			System.out.println("брой кофи по 3л."+(a/5));}
		if(a%5==1){
			System.out.println("брой кофи по 2л.="+(((a-6))/5));
			System.out.println("брой кофи по 3л.="+(((a-6))/5));
			System.out.println("+2 допълнителни кофи от 3л.");}
		if(a%5==2){
			System.out.println("брой кофи по 2л.="+(a/5));
			System.out.println("брой кофи по 3л.="+(a/5));
			System.out.println("+1 допълнителни кофа от 2л.");}
		if(a%5==3){
			System.out.println("брой кофи по 2л.="+(a/5));
			System.out.println("брой кофи по 3л.="+(a/5));
			System.out.println("+1 допълнителни кофа от 3л.");}		
		if(a%5==4){
			System.out.println("брой кофи по 2л.="+(a/5));
			System.out.println("брой кофи по 3л.="+(a/5));
			System.out.println("+2 допълнителни кофа от 2л.");}
			
		}

	

}
