import java.util.Scanner;


public class ProblemNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0,b=0;
		System.out.println("�������� 2 ����a � ��������� �� 10 �� 99");
		a=sc.nextInt();
		b=sc.nextInt();
		while ((a<10 || a>99)||(b<10 || b>99)){
			System.out.println("�������� 2 ����a � ��������� �� 10 �� 99");
			a=sc.nextInt();
			b=sc.nextInt();
		}
		if((a*b)%2==0)
			System.out.println((a*b)%10+" ������� � �����");
		else 
			System.out.println((a*b)%10+"������� � �������");
		
	}

}
