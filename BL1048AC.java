package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1048AC {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split("\\s+");
		char[] A = in[0].toCharArray();
		char[] B = in[1].toCharArray();
		char[] C = new char[A.length > B.length ? A.length : B.length];
		int flag = -1;
		for (int i = A.length, j = B.length, k = C.length; k > 0;) {
			flag++;
			k--;
			i--;
			j--;
			if (flag % 2 == 0) {// odd
				if (i >= 0 && j >= 0) {
					int t = (A[i] - '0' + B[j] - '0') % 13;
					if (t == 12)
						C[flag] = 'K';
					else if (t == 11)
						C[flag] = 'Q';
					else if (t == 10)
						C[flag] = 'J';
					else
						C[flag] = (char) (t + '0');
				} else if (i < 0 && j >= 0)
					C[flag] = B[j];
				else if (i >= 0 && j < 0)
					C[flag] = A[i];
			} else {// even
				if (i >= 0 && j >= 0)
					C[flag] = (char) (((B[j] - A[i] + 10) % 10) + '0');
				else if (i < 0 && j >= 0)
					C[flag] = B[j];
				else if (i >= 0 && j < 0)
					C[flag] = (char) (('0' - A[i] + 10) % 10 + '0');
				;
			}

		}
		for (int i = C.length - 1; i >= 0; i--) {
			System.out.print(C[i]);
		}
		System.out.println();
	}
}
