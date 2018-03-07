package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1037AC {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		String[] P = in[0].split("\\.");
		String[] A = in[1].split("\\.");

		long pay = Integer.parseInt(P[0]) * 17 * 29 + Integer.parseInt(P[1])
				* 29 + Integer.parseInt(P[2]);
		long actualPay = Integer.parseInt(A[0]) * 17 * 29
				+ Integer.parseInt(A[1]) * 29 + Integer.parseInt(A[2]);
		long back = actualPay - pay;
		if (back < 0) {
			System.out.print("-");
			back = -back;
		}

		System.out.println(back / (17 * 29) + "." + back % (17 * 29) / 29 + "."
				+ back % (17 * 29) % 29);

	}
}