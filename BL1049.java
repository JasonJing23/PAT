package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1049 {

	public static float sum(float[] data, int n) {
		if (n == 1)
			return data[0];
		else {
			float t = 0;
			for (int i = n - 1; i >= 0; i--) {
				t = t + data[i] * (i + 1);
			}
			return sum(data, n - 1) + t;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] in = br.readLine().split(" ");
		float[] data = new float[n];

		for (int i = n - 1; i >= 0; i--) {
			data[i] = Float.parseFloat(in[i]);
		}
		System.out.printf("%.2f", sum(data, n));
	}

}


/*
 * 

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] in = br.readLine().split(" ");
		
		double total = 0;
		double array;
		for (int i = 0; i < n; i++) {
			array = Float.parseFloat(in[i]);
			total += array * (i + 1) * (n - i);
		}
		
		System.out.printf("%.2f", total);
	}
}



 */

