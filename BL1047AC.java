package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1047AC {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] team = new int[1001];
		int maxIndex = 0;
		for (int i = 0; i < n; i++) {
			String[] in = br.readLine().split("[ -]");
			int temp = Integer.parseInt(in[0]);
			team[temp] += Integer.parseInt(in[2]);
			if (team[maxIndex] < team[temp])
				maxIndex = temp;
		}
		System.out.println(maxIndex + " " + team[maxIndex]);
	}
}
