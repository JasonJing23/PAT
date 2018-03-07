package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1031AC {
	public static int[] weight = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5,
			8, 4, 2 };
	public static int[] Z = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	public static String[] M = { "1", "0", "X", "9", "8", "7", "6", "5", "4",
			"3", "2" };

	public static boolean isValid(String id) {
		int w = 0;
		for (int i = 0; i < 17; i++) {
			w = w + (id.charAt(i) - '0') * weight[i];
		}
		int z = w % 11;
		if (M[Z[z]].compareToIgnoreCase(id.charAt(17) + "") == 0)
			return true;
		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			String id = br.readLine();
			if (isValid(id)) {

			} else {
				flag = false;
				System.out.println(id);
			}
		}
		if (flag)
			System.out.println("All passed");
	}
}