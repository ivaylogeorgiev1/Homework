
public class LoopsProblemTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=0;
		while(a<1000){				
				if(((a%100)/10)!=a%10 &&a%10!=(a%1000)/100 && ((a%100)/10)!=((a%1000)/100)){
					System.out.println(a);
				}
				a++;
		}

	}

}
