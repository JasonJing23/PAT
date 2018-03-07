package cn.jasonjing.BasicLevel;

import java.util.Scanner;
public class BL1007AC {
	public boolean isPrime(int n) {
	    if (n <= 3) {
	      return n > 1;
	    }
	    for (int i = 2; i <= Math.sqrt(n); i++) {
	      if (n % i == 0)
	        return false;
	    }
	    return true;
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    sc.nextLine();
	    sc.close();
	    BL1007AC m = new BL1007AC();
	    int total = 0;
	    for (int i = 3; i <= n; i++) {
	      if (m.isPrime(i) && m.isPrime(i - 2)) {
	        total++;
	      }
	    }
	    System.out.println(total);
	  }
}
