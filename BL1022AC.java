package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1022AC {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		Long a = Long.parseLong(in[0]);
		Long b = Long.parseLong(in[1]);
		Integer d = Integer.parseInt(in[2]);
		System.out.println(Long.toString(a + b, d));

	}
}



