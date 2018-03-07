package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1044AC {
	static String[] basic = { "tret", "jan", "feb", "mar", "apr", "may", "jun",
			"jly", "aug", "sep", "oct", "nov", "dec" };
	static String[] high = { "tam", "hel", "maa", "huh", "tou", "kes", "hei",
			"elo", "syy", "lok", "mer", "jou" };

	public static void toEarthLanguage(String mar) {
		String[] mars = mar.split(" ");
		if (mars.length == 1) {
			for (int i = 0; i < basic.length; i++) {
				if (mars[0].equals(basic[i]))
					System.out.println(i);
			}
			for (int i = 0; i < high.length; i++) {
				if (mars[0].equals(high[i]))
					System.out.println((i + 1) * 13);
			}
		} else {
			int total = 0;

			for (int i = 0; i < high.length; i++) {
				if (mars[0].equals(high[i]))
					total = (i + 1) * 13;
			}
			for (int i = 0; i < basic.length; i++) {
				if (mars[1].equals(basic[i]))
					total = total + i;
			}
			System.out.println(total);
		}
	}

	public static void toMarsLanguage(int earth) {
		if (earth < 13) {
			System.out.println(basic[earth]);
		} else if (earth % 13 == 0) {
			System.out.println(high[earth / 13 - 1]);
		} else
			System.out.println(high[earth / 13 - 1] + " " + basic[earth % 13]);

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int j = 0; j < n; j++) {
			String num = br.readLine();
			if (num.matches("[0-9]{1,}")) {
				toMarsLanguage(Integer.parseInt(num));
			} else {
				toEarthLanguage(num);
			}
		}
	}

}
