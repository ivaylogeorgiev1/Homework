package test;

public class AADEMO {
	static void ppp(BB b) {
		System.out.println("BB");
	}

	static void ppp(CC b) {
		System.out.println("CC");
	}

	public static void main(String[] args) {
		CC asd = new CC();
		BB qwe = new CC();
		CC s = (CC) asd;

		Object dd = new Object();
		String xx = new String();
		
		
		BB ee = (BB) asd;
		Object qq = (Object) xx;
		dd=(String)dd;
		ppp((BB) asd);
	}
}
