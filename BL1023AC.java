package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1023AC {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		boolean b = true;
		for(int i = 1; i < in.length;i++){
			if(Integer.parseInt(in[i]) > 0 && b == true){
				b = false;
				System.out.print(i);
				if(Integer.parseInt(in[0]) > 0){
					for(int j = 0; j < Integer.parseInt(in[0]);j++)
						System.out.print("0");
					
				}
				for(int k = 1;k<Integer.parseInt(in[i]);k++)
					System.out.print(i);
					
			}else if(Integer.parseInt(in[i]) > 0){
				for(int k = 0;k<Integer.parseInt(in[i]);k++)
					System.out.print(i);
			}
		}
	}
	
}



