import java.util.Scanner;


public class ProblemTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		System.out.println("�������� ����� ����� ���� ��� � �����������(�� 10 �� 9999):");
		a=sc.nextInt();
		while(a<10 || a >9999){
			System.out.println("�������� ����� ����� ���� ��� � �����������(�� 10 �� 9999):");
			a=sc.nextInt();
		}
		if(a%5==0){
			System.out.println("���� ���� �� 2�."+(a/5));
			System.out.println("���� ���� �� 3�."+(a/5));}
		if(a%5==1){
			System.out.println("���� ���� �� 2�.="+(((a-6))/5));
			System.out.println("���� ���� �� 3�.="+(((a-6))/5));
			System.out.println("+2 ������������ ���� �� 3�.");}
		if(a%5==2){
			System.out.println("���� ���� �� 2�.="+(a/5));
			System.out.println("���� ���� �� 3�.="+(a/5));
			System.out.println("+1 ������������ ���� �� 2�.");}
		if(a%5==3){
			System.out.println("���� ���� �� 2�.="+(a/5));
			System.out.println("���� ���� �� 3�.="+(a/5));
			System.out.println("+1 ������������ ���� �� 3�.");}		
		if(a%5==4){
			System.out.println("���� ���� �� 2�.="+(a/5));
			System.out.println("���� ���� �� 3�.="+(a/5));
			System.out.println("+2 ������������ ���� �� 2�.");}
			
		}

	

}
