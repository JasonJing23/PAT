package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BL1050 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int m = 0,n = 0;
		int min = 100001;
		for (int i = 1; i <= Math.sqrt(length); i++) {
			if (length % i == 0) {
				int j = length / i;
				if (min > j - i) {
					m = j;
					n = i;
					min = m - n;
				}
			}
		}
		String[] in = br.readLine().split(" ");
		int[] d = new int[length];
		for (int i = 0; i < length; i++) {
			d[i] = Integer.parseInt(in[i]);
		}
		Arrays.sort(d);
		int[][] data = new int[m][n];
		data[0][0] = d[length - 1];
		int i = 0, j = 0;
		for (int l = length - 2; l >= 0; l--) {
			boolean up = false, down = false, left = false, right = false;
			if (i - 1 >= 0 && data[i - 1][j] == 0)
				up = true;
			if (i + 1 < m && data[i + 1][j] == 0)
				down = true;
			if (j + 1 < n && data[i][j + 1] == 0)
				right = true;
			if (j - 1 >= 0 && data[i][j - 1] == 0)
				left = true;
			// down right
			if (!up && down && !left && right) {
				j = j + 1;
				data[i][j] = d[l];
				continue;
			}
			// down
			if (!up && down && !left && !right) {
				i = i + 1;
				data[i][j] = d[l];
				continue;
			}
			// left down
			if (!up && down && left && !right) {
				i = i + 1;
				data[i][j] = d[l];
				continue;
			}
			// left
			if (!up && !down && left && !right) {
				j = j - 1;
				data[i][j] = d[l];
				continue;
			}
			// left up
			if (up && !down && left && !right) {
				j = j - 1;
				data[i][j] = d[l];
				continue;
			}
			// up
			if (up && !down && !left && !right) {
				i = i - 1;
				data[i][j] = d[l];
				continue;
			}
			// up right
			if (up && !down && !left && right) {
				i = i - 1;
				data[i][j] = d[l];
				continue;
			}
			// right
			if (!up && !down && !left && right) {
				j = j + 1;
				data[i][j] = d[l];
				continue;
			}
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < n - 1; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println(data[i][n - 1]);
		}
	}
}
