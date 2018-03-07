package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1021AC {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		char[] charArray = n.toCharArray();
		int[] ten =  {0,0,0,0,0,0,0,0,0,0};
		for(char c : charArray){
			if(c == '0')
				ten[0]++;
			if(c == '1')
				ten[1]++;
			if(c == '2')
				ten[2]++;
			if(c == '3')
				ten[3]++;
			if(c == '4')
				ten[4]++;
			if(c == '5')
				ten[5]++;
			if(c == '6')
				ten[6]++;
			if(c == '7')
				ten[7]++;
			if(c == '8')
				ten[8]++;
			if(c == '9')
				ten[9]++;
		}
		for(int i = 0;i<ten.length;i++)
			if(ten[i]!=0)
				System.out.println(i+":"+ten[i]);
	}
	
}
