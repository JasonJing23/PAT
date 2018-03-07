package cn.jasonjing.BasicLevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1018 {
	static int jiawin = 0, yiwin = 0;
	static int[] jia = { 0, 0, 0 }, yi = { 0, 0, 0 };
	public static void battle(char s, char t) {
		if (s == 'B' && t == 'C') {
			jiawin++;
			jia[0]++;
		} else if (s == 'B' && t == 'J') {
			yiwin++;
			yi[2]++;
		} else if (s == 'C' && t == 'B') {
			yiwin++;
			yi[0]++;
		} else if (s == 'C' && t == 'J') {
			jiawin++;
			jia[1]++;
		} else if (s == 'J' && t == 'B') {
			jiawin++;
			jia[2]++;
		} else if (s == 'J' && t == 'C') {
			yiwin++;
			yi[1]++;
		}
	}
	public static char getMax(int B, int C, int J) {
		if (C >= J && C > B) {
			return 'C';
		} else if (J > C && J > B) {
			return 'J';
		} else {
			return 'B';
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			String[] data = input.split(" ");
			char s = (data[0]).charAt(0);
			char t = (data[1]).charAt(0);
			battle(s,t);
		}
		System.out.println(jiawin + " " + (n - jiawin - yiwin) + " " + yiwin);
		System.out.println(yiwin + " " + (n - jiawin - yiwin) + " " + jiawin);
	    System.out.print(getMax(jia[0], jia[1], jia[2]));
	    System.out.println(" " + getMax(yi[0], yi[1], yi[2]));
	}
}
