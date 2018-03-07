package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1036AC {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int row = Integer.parseInt(in[0]);
		String s = in[1];

		int line = (int) (row * 0.5 + 0.5);

		for (int i = 0; i < line; i++) {
			if (i == 0 || i == line - 1) {
				for (int j = 0; j < row; j++) {
					System.out.print(s);
				}
				System.out.println();
			} else {
				System.out.print(s);
				for (int j = 1; j < row - 1; j++) {
					System.out.print(" ");
				}
				System.out.println(s);
			}
		}

	}
}
