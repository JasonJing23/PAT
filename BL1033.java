package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1033 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		char[] broken = in.toCharArray();
		char[] supposed = br.readLine().toCharArray();
		boolean shiftKey = true;
		if (in.contains("+"))
			shiftKey = false;

		for (int i = 0; i < supposed.length; i++) {
			boolean flag = true;
			for (int j = 0; j < broken.length; j++) {
				if (Character.toUpperCase(supposed[i]) == Character
						.toUpperCase(broken[j])) {
					flag = false;
					break;
				}
				if (shiftKey == false && Character.isUpperCase(supposed[i])) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				System.out.print(supposed[i]);
		}
	}
}
