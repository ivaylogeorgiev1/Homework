import java.util.Scanner;


public class ProblexSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chas;
		double sumaPari;
		boolean daliSymZdrav;
		Scanner sc=new Scanner(System.in);
		System.out.println("Час:");
		chas=sc.nextInt();
		System.out.println("Колко пари имам?");
		sumaPari=sc.nextDouble();
		System.out.println("Здрав ли съм?");
		daliSymZdrav=sc.nextBoolean();
		if(daliSymZdrav==false){{
			System.out.println("Няма да излизам");}
			{if(sumaPari>0){
			System.out.println("Ще си купя лекарства");}
			else{
			System.out.println("Ще си стоя вкъщи и ще пия чай");}}}
		else{if(sumaPari>=10) 
			System.out.println("Ще отида на кино");
			if(sumaPari<10 && sumaPari>0){{
			System.out.println("Ще отида на кафе");}
		}
			else if(sumaPari==0)
				System.out.println("Ще си стоя вкъщи и ще пия чай");
		}

	}
}
