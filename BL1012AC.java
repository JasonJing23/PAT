package cn.jasonjing.BasicLevel;

//Java¥˙¬Î µœ÷
import java.util.Scanner;
public class BL1012AC {
public static void BL1012(String[] args) {
  boolean f1 = false, f2 = false, f3 = false, f4 = false, f5 = false;
  int k = 0, factor = 1, A1 = 0, A2 = 0, A3 = 0, A5 = 0;
  double A4 = 0;
  Scanner sc = new Scanner(System.in);
  String data = sc.nextLine();
  String[] arr = data.split(" ");
  int[] d = new int[arr.length];
  for(int i = 0; i < arr.length; i++)
  	d[i] = Integer.parseInt(arr[i]);
  int N = d[0];
  int i = 1;
  if (N <= 1000) {
    while (N > 0) {
      N--;
      int t = d[i++];
      if (t <= 1000 && t>0) {
        int mod = t % 5;
        switch (mod) {
        case 0:
          if (t % 2 == 0) {
            A1 += t;
            f1 = true;
          }
          break;
        case 1:
          A2 += factor * t;
          factor = -factor;
          f2 = true;
          break;
        case 2:
          A3++;
          f3 = true;
          break;
        case 3:
          A4 += t;
          k++;
          f4 = true;
          break;
        case 4:
          if (A5 < t)
            A5 = t;
          f5 = true;
          break;
        }
      }
    }
    if (f1)
      System.out.printf(A1 + " ");
    else
      System.out.printf("N ");
    if (f2)
      System.out.printf(A2 + " ");
    else
      System.out.printf("N ");
    if (f3)
      System.out.printf(A3 + " ");
    else
      System.out.printf("N ");
    if (f4)
      System.out.printf("%.1f ", A4 / k);
    else
      System.out.printf("N ");
    if (f5)
      System.out.println(A5);
    else
      System.out.println("N");
  }
}
}
