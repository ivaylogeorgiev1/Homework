import java.util.Scanner;


public class ProblexSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chas;
		double sumaPari;
		boolean daliSymZdrav;
		Scanner sc=new Scanner(System.in);
		System.out.println("���:");
		chas=sc.nextInt();
		System.out.println("����� ���� ����?");
		sumaPari=sc.nextDouble();
		System.out.println("����� �� ���?");
		daliSymZdrav=sc.nextBoolean();
		if(daliSymZdrav==false){{
			System.out.println("���� �� �������");}
			{if(sumaPari>0){
			System.out.println("�� �� ���� ���������");}
			else{
			System.out.println("�� �� ���� ����� � �� ��� ���");}}}
		else{if(sumaPari>=10) 
			System.out.println("�� ����� �� ����");
			if(sumaPari<10 && sumaPari>0){{
			System.out.println("�� ����� �� ����");}
		}
			else if(sumaPari==0)
				System.out.println("�� �� ���� ����� � �� ��� ���");
		}

	}
}
