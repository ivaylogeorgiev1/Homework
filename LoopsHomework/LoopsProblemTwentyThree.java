
public class LoopsProblemTwentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=1;
		while(i<=9){
			while(i<=j && j<=9){
				System.out.print(i+"*"+j+"="+(i*j)+"; ");
				j++;
			}
			i++;
			j=i;;
			System.out.println(" ");
		}
		
	}

}
