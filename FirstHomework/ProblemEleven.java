import java.util.Scanner;


public class ProblemEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("�������� ���������� �����, ����� �� ������� ������� 0");
		a=sc.nextInt();
		while((a<100 ||a>999)||(String.valueOf(a).contains("0"))){
			System.out.println("�������� ���������� �����, ����� �� ������� ������� 0");
			a=sc.nextInt();}
		if((a%(a%10)==0) && (a%((a%100)/10)==0) && (a%((a%1000)/100)==0)){
			System.out.println("������� �� ���� �� ����� ���� ������");
		}
		else {
			System.out.println("������� �� �� ���� �� ����� ���� �����");
		}
	}

}
