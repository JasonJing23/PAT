package cn.jasonjing.BasicLevel;
//Java´úÂëÊµÏÖ
import java.util.Scanner;

public class BL1011AC {

public boolean isBigger(String str) {
  if (str.equalsIgnoreCase("")) {

  } else {
    String[] arr = str.split("\\s+");
    if (Long.parseLong(arr[0]) + Long.parseLong(arr[1]) > Long.parseLong(arr[2])) {
      return true;
    } else {
      return false;
    }
  }
  return false;
}

public static void BL1011(String[] args) {
  BL1011AC m = new BL1011AC();
  Scanner sc = new Scanner(System.in);
  int n = Integer.parseInt(sc.nextLine());
  for (int i = 1; i <= n; i++) {
    String str = sc.nextLine();
    System.out.println("Case #" + i + ": " + m.isBigger(str));
  }
  sc.close();
}
}