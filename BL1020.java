package cn.jasonjing.BasicLevel;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BL1020 {
	public static class Mooncake implements Comparable<Mooncake> {
		public int mount;
		public double price;
		public double unit;
		public Mooncake() {
		}
		public Mooncake(Integer mount, Double price) {
			this.mount = mount;
			this.price = price;
			this.unit = price / mount;
		}
		public int compareTo(Mooncake m) {
			if (this.unit < m.unit)
				return 1;
			else if (this.unit >= m.unit)
				return -1;
			else
				return 0;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] data = input.split(" ");
		int n = Integer.parseInt(data[0]);
		int need = Integer.parseInt(data[1]);
		if (n <= 0 || n > 1000 || need <= 0 || need > 500)
			return;
		String[] w = br.readLine().split(" "), p = br.readLine().split(" ");
		br.close();
		List<Mooncake> mooncakes = new ArrayList();
		for (int i = 0; i < n; i++) {
			Mooncake m = new Mooncake(Integer.parseInt(w[i]),Double.parseDouble(p[i]));
			mooncakes.add(m);
		}
		Collections.sort(mooncakes);
		double total = 0.0;
		int cur = 0;
		for (int i = 0; i < mooncakes.size(); i++) {
			if (cur + mooncakes.get(i).mount < need) {
				cur = cur + mooncakes.get(i).mount;
				total = total + mooncakes.get(i).price;
			} else if (cur < need) {
				total = total + mooncakes.get(i).unit * (need - cur);
				cur = need;
			}
		}
		System.out.println(String.format("%.2f", total));
	}
}


