package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1046AC {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int jiaWin = 0, yiWin = 0;
		for (int i = 0; i < n; i++) {
			String[] in = br.readLine().split(" ");
			if (Integer.parseInt(in[0]) + Integer.parseInt(in[2]) == Integer
					.parseInt(in[1])
					&& Integer.parseInt(in[0]) + Integer.parseInt(in[2]) != Integer
							.parseInt(in[3]))
				jiaWin++;
			if (Integer.parseInt(in[0]) + Integer.parseInt(in[2]) != Integer
					.parseInt(in[1])
					&& Integer.parseInt(in[0]) + Integer.parseInt(in[2]) == Integer
							.parseInt(in[3]))
				yiWin++;
		}
		System.out.println(yiWin + " " + jiaWin);
	}
}
