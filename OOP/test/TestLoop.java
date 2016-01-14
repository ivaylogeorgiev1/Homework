package test;

public class TestLoop {
	int x;

	TestLoop() {
		this(1);
	}

	TestLoop(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		TestLoop a=new TestLoop();
		System.out.println(a.x);
//		String a = "asd";
//
//		a: for (int i = 0; i < 3; i++)
//			System.out.println("a");
//		System.out.println("asd");
}}
