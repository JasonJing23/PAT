package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class BL1041AC {
	static class Stu {
		String id;
		int test;
		int seat;
		public Stu(String id, int test, int seat) {
			this.id = id;
			this.test = test;
			this.seat = seat;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Stu> list = new ArrayList();
		for (int i = 0; i < n; i++) {
			String[] in = br.readLine().split(" ");
			Stu s = new Stu(in[0], Integer.parseInt(in[1]),
					Integer.parseInt(in[2]));
			list.add(s);
		}
		int tn = Integer.parseInt(br.readLine());
		String[] search = br.readLine().split(" ");
		for (int i = 0; i < search.length; i++) {
			for(Stu s : list){
				if(s.test ==  Integer.parseInt(search[i]))
					System.out.println(s.id+" " +s.seat);
			}
		}
	}
}














