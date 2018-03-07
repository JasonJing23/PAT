package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1040AC {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[] s = in.readLine().toCharArray();
		in.close();
		int len = s.length, countp = 0, countt = 0;
		long total = 0;
		for (int i = 0; i < len; i++) {
			if (s[i] == 'T')
				countt++;
		}
		for (int i = 0; i < len; i++) {
			if (s[i] == 'P')
				countp++;
			if (s[i] == 'T')
				countt--;
			if (s[i] == 'A') {
				total = total + countp * countt;
				if (total > 1000000007)
					total = total % 1000000007;
			}
		}
		System.out.println(total);
	}
}


/*
 * public class Main {
 * 
 * public static void main(String[] args) throws Exception { BufferedReader br =
 * new BufferedReader(new InputStreamReader(System.in)); char[] pat =
 * br.readLine().toCharArray();
 * 
 * int p = 0, a = 0, t = 0, mod = 1000000007; long total = 0; for (; p <
 * pat.length; p++) { if(pat[p]!='P'){ continue; } for (a=p+1; a < pat.length;
 * a++) { if(pat[a]!='A'){ continue; } for (t = a+1; t < pat.length; t++) {
 * if(pat[t]=='T'){ total++; if(total > mod) total = total % mod; } } } }
 * System.out.println(total); } }
 */
