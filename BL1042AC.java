package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1042AC {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] chars = br.readLine().toLowerCase().toCharArray();
		int[] n = new int[26];
		for (char c : chars) {
			if (c >= 'a' && c <= 'z') {
				int t = (int) (c - 'a');
				n[t]++;
			}
		}
		int max = 0;
		for (int i = 1; i < n.length; i++) {
			if (n[max] < n[i]) {
				max = i;
			}
		}
		char c = (char) ('a' + max);
		System.out.println(c + " " + n[max]);
	}
}
