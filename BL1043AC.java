package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1043AC {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] in = br.readLine().toCharArray();
		int P = 0, A = 0, T = 0, e = 0, s = 0, t = 0;
		for (char c : in) {
			if (c == 'P')
				P++;
			if (c == 'A')
				A++;
			if (c == 'T')
				T++;
			if (c == 'e')
				e++;
			if (c == 's')
				s++;
			if (c == 't')
				t++;
		}
		while (P > 0 || A > 0 || T > 0 || e > 0 || s > 0 || t > 0) {
			if (P > 0) {
				System.out.print("P");
				P--;
			}
			if (A > 0) {
				System.out.print("A");
				A--;
			}
			if (T > 0) {
				System.out.print("T");
				T--;
			}
			if (e > 0) {
				System.out.print("e");
				e--;
			}
			if (s > 0) {
				System.out.print("s");
				s--;
			}
			if (t > 0) {
				System.out.print("t");
				t--;
			}
		}

	}
}
