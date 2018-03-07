package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1016AC {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] data = input.split(" ");
		String A = data[0];
		int DA = Integer.parseInt(data[1]);
		String B = data[2];
		int DB = Integer.parseInt(data[3]);
		long PA = 0, PB = 0;

		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) - '0' == DA) {
				PA = PA * 10 + (A.charAt(i) - '0');
			}
		}
		for (int i = 0; i < B.length(); i++) {
			if (B.charAt(i) - '0' == DB) {
				PB = PB * 10 + (B.charAt(i) - '0');
			}
		}
		System.out.println(PA + PB);
	}
	
}
