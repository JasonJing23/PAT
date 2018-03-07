package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BL1039AC {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] sample = br.readLine().toCharArray();
		char[] need = br.readLine().toCharArray();
		Arrays.sort(sample);
		Arrays.sort(need);
		int i = 0, j = 0;
		int n = 0;
		for (; i < need.length; i++) {
			for (; j < sample.length && sample[j] <= need[i]; j++) {
				if(sample[j] == need[i]){
					n++;
					j++;
					break;
				}
			}
		}
		if(n<need.length){
			System.out.println("No " + (need.length - n));
		}else{
			System.out.println("Yes " + (sample.length-need.length));
		}
	}

}
