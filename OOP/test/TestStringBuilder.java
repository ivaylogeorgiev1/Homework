package test;

public class TestStringBuilder {
	public static void main(String[] args) {
		String a = new String("asd");
		System.out.println(a.charAt(0));

		StringBuilder b = new StringBuilder(a);
		b.insert(1, 2);
		System.out.println(b);
	}
}
