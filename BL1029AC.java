package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BL1029AC {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] suppose = br.readLine().toCharArray();
		char[] fact = br.readLine().toCharArray();
		List<String> list = new ArrayList<String>();
		for(int i = 0;i < suppose.length;i++){
			boolean falg = true;
			for(int j = 0;j<fact.length;j++){
				if(suppose[i] == fact[j]){
					falg = false;
					break;
				}
			}
			if(falg == true){
				if(!list.contains((suppose[i]+"").toUpperCase()))
					list.add((suppose[i]+"").toUpperCase());
			}
		}
		for(int i =0;i<list.size();i++)
			System.out.print(list.get(i));
	}
}
