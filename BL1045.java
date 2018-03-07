package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BL1045 {
	public static void main(String[] args) throws Exception {
		int max = 0, index = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n], b = new int[n], v = new int[n];
		String[] in = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(in[i]);
			b[i] = a[i];
		}
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i] && b[i] > max)
				v[index++] = b[i];
			if (b[i] > max)
				max = b[i];
		}
		System.out.println(index);
		for (int i = 0; i < index - 1; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println(v[index - 1]);
	}
}

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static boolean isBigger(int[] a, int n, int num) {
		for (int i = 0; i < n; i++) {
			if (a[i] > num)
				return false;
		}
		return true;
	}

	static boolean isLower(int[] a, int from, int num) {
		for (int i = from + 1; i < a.length; i++) {
			if (num > a[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] in = br.readLine().split(" ");
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(in[i]);
		}
		int total = 0,max = 0,index = 0;
		int[] r = new int[n];
		for (int i = 0; i < n; i++) {
			if(max < num[i]){
				max = num[i];
				if (isBigger(num, i, num[i]) && isLower(num, i, num[i])) {
					r[index++]=num[i];
					total++;
				}
			}
		}
		System.out.println(total);
		
		for(int i = 0;i<index-1;i++){
			System.out.print(r[i] + " ");
		}
		System.out.println(r[index-1]);
	}
}


*/