package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BL1027AC {
	public static void printStars(int n,String s){
		for(int i = 0;i<n;i++)
			System.out.print(s);
	}
	public static void printBlank(int n,String s){
		for(int i = 0;i<n;i++){
			for(int j = 0;j<s.length();j++)
				System.out.print(" ");
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split("\\s+");
		String star = in[1];
		int n = Integer.parseInt(in[0]);

		int m = 3,sum = 0;
		while(sum <= n){
			sum = (3 + m) * ((m-3)/2 + 1) + 1;
			m = m + 2;
		}
		m = m - 4;
		for(int i = 0;i <= m/2;i++){
			printBlank(i,star);
			printStars(m - i*2,star);
			System.out.println();
		}
		for(int i = 3;i <= m;i = i +2){
			printBlank((m-i)/2,star);
			printStars(i,star);
			System.out.println();
		}
		System.out.println(n - ((3 + m) * ((m-3)/2 + 1) + 1));
	}
}
