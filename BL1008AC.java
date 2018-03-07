package cn.jasonjing.BasicLevel;

//Java´úÂëÊµÏÖ
import java.util.Scanner;
public class BL1008AC {
public void rightShift(int[] arr, int n) {
  for (int i = 0; i < n; i++) {
    int last = arr[arr.length-1];
    for(int j = arr.length-1;j>0;j--){
      arr[j]=arr[j-1];
    }
    arr[0]=last;
  }
  for(int i = 0;i<arr.length-1;i++){
    System.out.print(arr[i]+" ");
  }
  System.out.println(arr[arr.length-1]);
}
public static void BL1008(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();
  sc.nextLine();
  String str = sc.nextLine();
  String[] a = str.split(" ");
  int arr[] = new int[n];
  for(int i = 0;i<n;i++){
    arr[i]=Integer.parseInt(a[i]);
  }
  
  sc.close();
  BL1008AC M = new BL1008AC();
  M.rightShift(arr, m);
}
}
