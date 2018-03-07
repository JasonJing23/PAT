package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class BL1035AC2 {
	public static void sort(int[] a, int from, int to) {
		for (int i = from; i < to; i++) {
			for (int j = i + 1; j <= to; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] pre = br.readLine().split(" ");
		String[] later = br.readLine().split(" ");
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(pre[i]);
			b[i] = Integer.parseInt(later[i]);
		}
		int i = 0;
		for (; b[i] <= b[i + 1] && i < n; i++)
			;
		boolean isInsert = true;
		for (int j = i + 1; j < n; j++) {
			if (a[j] != b[j]) {
				isInsert = false;
				break;
			}
		}
		if (isInsert) {
			System.out.println("Insertion Sort");
			sort(a, 0, i + 1);
		} else {
			System.out.println("Merge Sort");
			int k = 1;
			boolean flag = false;
			while (flag == false) {
				flag = Arrays.equals(a, b);
				k = k * 2;
				int p = 0;
				for (p = 0; p < n / k; p++)
					sort(a, p * k, (p + 1) * k - 1);
				sort(a, n / k * k, n - 1);
			}
		}
		for (int k = 0; k < n - 1; k++) 
			System.out.print(a[k] + " ");
		System.out.print(a[n - 1]);
	}
}




