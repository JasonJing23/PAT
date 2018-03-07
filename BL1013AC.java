package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1013AC {

	public static boolean isPrimeNum(int a) {
		if (a == 1) 
			return false;
		if (a % 2 == 0 && a != 2) 
			return false;
		double half = Math.sqrt(a);
		for (int i = 3; i <= half; i += 2) {
			if (a % i == 0) 
				return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int left, right;
		String str = br.readLine();
		String[] data = str.split(" ");
		left = Integer.parseInt(data[0]);
		right = Integer.parseInt(data[1]);
		int times = 0;
		for (int i = 1;; i++) {
			if (isPrimeNum(i)) {
				times++;
				if (times >= left && times <= right) {
					if ((times - left + 1) % 10 == 0 || times - left == right - left)
						System.out.println(i);
					else 
						System.out.printf("%d ", i);
				}
				if (times == right) 
					break;
			}
		}
	}
}
