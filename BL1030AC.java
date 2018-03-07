package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BL1030AC {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int n = Integer.parseInt(in[0]);
		int p = Integer.parseInt(in[1]);
		String[] data = br.readLine().split(" ");
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = Integer.parseInt(data[i]);
		}
		br.close();
		Arrays.sort(d);
		int M = d[n-1];
		
		int result = 1 ;
		for (int i = n - 1; i >= 0; i--) {
			int max = 1;
			M = d[i];
			for (int j = i - max; j >= 0 &&  M*1.0/d[j] <=  p; j--) {
				max = i - j + 1;
			}
			result = result > max ? result : max;
		}
		System.out.println(result);
	}
}
