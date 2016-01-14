package test;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfArrayTest {

	@Override
	public String toString() {

		return "asd";
	}

	public static void main(String[] args) {
		String[] a = { "asd", "bcd" };
		a[1] = new Scanner(System.in).next();
		String[] c = Arrays.copyOf(a, a.length);
		String b = "asd";
		if (b == a[0]) {
			System.out.println("da");
		}
		System.out.println(a);
	}
}
