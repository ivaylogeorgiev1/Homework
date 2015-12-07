public class StringsProblemFourteen {
	static double fact(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}

		if (n < 0) {
			if (n == -1) {
				return -1;
			}
			return Math.abs(fact(n + 1) / n);
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		int num = 5;
		double fact = fact(num);
		System.out.println(fact);
	}
}
