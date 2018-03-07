package cn.jasonjing.BasicLevel;

import java.util.Scanner;

public class BL1006AC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int h = n / 100;
		for (int i = 0; i < h; i++) {
			System.out.print("B");
		}
		int t = n / 10 % 10;
		for (int i = 0; i < t; i++) {
			System.out.print("S");
		}
		int g = n % 10;
		for (int i = 0; i < g; i++) {
			System.out.print(i + 1);
		}
		System.out.println();
	}
}
