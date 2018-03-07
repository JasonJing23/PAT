package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1032 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()),maxIndex = 1;

		int[] scores = new int[100001];
		String[] temp;
		for (int i = 0; i < n; i++) {
			temp = br.readLine().split("\\s+");
			int tno = Integer.parseInt(temp[0]);
			int tscore = Integer.parseInt(temp[1]);
			scores[tno] += tscore;
			if (scores[maxIndex] < scores[tno])
				maxIndex = tno;
		}
		System.out.println(maxIndex + " " + scores[maxIndex]);
	}
}
