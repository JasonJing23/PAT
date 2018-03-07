package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1014AC {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String one = br.readLine(), two = br.readLine(), three = br.readLine(), four = br.readLine();
		boolean isDay = false;
		boolean isHour = false;
		for (int i = 0; i < one.length() && i < two.length(); i++) {
			char c = one.charAt(i);
			if (c == two.charAt(i)) {
				if (isDay && !isHour && ((c >= 'A' && c <= 'N') || Character.isDigit(c))) {
					isHour = true;
					if (c >= '0' && c <= '9') {
						System.out.print("0" + c);
					} else {
						System.out.print(c - 'A' + 10);
					}
				}
				if (!isDay && c >= 'A' && c <= 'G') {
					isDay = true;
					switch (one.charAt(i)) {
					case 'A':
						System.out.print("MON ");
						break;
					case 'B':
						System.out.print("TUE ");
						break;
					case 'C':
						System.out.print("WED ");
						break;
					case 'D':
						System.out.print("THU ");
						break;
					case 'E':
						System.out.print("FRI ");
						break;
					case 'F':
						System.out.print("SAT ");
						break;
					case 'G':
						System.out.print("SUN ");
						break;
					}
				}

			}
		}
		for (int i = 0; i < three.length() && i < four.length(); i++) {
			char c = three.charAt(i);
			if (c == four.charAt(i) && (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
				System.out.printf(":%02d", i);
			}
		}
		
	}
}
