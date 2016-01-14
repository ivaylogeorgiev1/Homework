package test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class TeseArry {
	public static void main(String[] args) {
		// int[][] a={{2,1},{5,4}};
		// System.out.println(Arrays.toString(a[0]));
		// System.out.println((Math.random()*3 + 23)
		// );

		PrintWriter out = null;
		try {
			out = new PrintWriter("asdfilename.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("asd werwer");
		out.close();
	}
}
