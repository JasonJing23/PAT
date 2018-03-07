package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1051AC {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		double R1 = Double.parseDouble(in[0]);
		double P1 = Double.parseDouble(in[1]);
		double R2 = Double.parseDouble(in[2]);
		double P2 = Double.parseDouble(in[3]);

		double a = R1 * R2 * Math.cos((P1 + P2));
		double b = R1 * R2 * Math.sin(P1 + P2);
		System.out.printf("%.2f%.2fi", a, b);
		if (Math.abs(a) <= 0.001) {
			System.out.print("0.00");
		} else {
			System.out.printf("%.2f", a);
		}

		if (b > 0) {
			System.out.printf("+%.2fi", b);
		} else if (Math.abs(b) <= 0.001) {
			System.out.print("+0.00i");
		} else {
			System.out.printf("%.2fi", b);
		}
	}

}





