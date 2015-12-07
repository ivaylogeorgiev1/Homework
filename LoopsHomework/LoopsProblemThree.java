public class LoopsProblemThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -11;
		while (num >= -11 && num < 10) {
			num++;
			if (Math.abs(num) % 2 == 1) {
				System.out.println(num);
			}
		}
	}

}
