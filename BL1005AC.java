package cn.jasonjing.BasicLevel;
//Java´úÂëÊµÏÖ
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BL1005AC {
private String n = "";
private String[] arr = new String[] {};

public void calKeyNum() {
  String[] temp = arr;
  for (int i = Integer.parseInt(n)-1; i >=0; i--) {
    int m = Integer.parseInt(temp[i]);
    while (m > 1) {
      if (m % 2 == 0) {
        m = m / 2;
        for (int j = 0; j < Integer.parseInt(n); j++) {
          int arrJ = Integer.parseInt(arr[j]);
          if (arrJ != -1 && arrJ == m) {
            arr[j] = "-1";
          }
        }
      } else if (m % 2 == 1) {
        m = (3 * m + 1) / 2;
        for (int j = 0; j < Integer.parseInt(n); j++) {
          int arrJ = Integer.parseInt(arr[j]);
          if (arrJ != -1 && arrJ == m) {
            arr[j] = "-1";
          }
        }
      }
    }
  }
  ArrayList<Integer>alist = new ArrayList<Integer>();
  for(int i = 0;i<Integer.parseInt(n);i++){
    if(arr[i]!="-1"){
      alist.add(Integer.parseInt(arr[i]));
    }
  }
  Collections.sort(alist);
  if(alist.size()==1){  
          System.out.println(alist.get(0));  
      }else{  
          for(int i=alist.size()-1 ;i>=0 ;i--){  
              System.out.print(alist.get(i));  
              if(i!=0){  
                  System.out.print(" ");  
              }  
          }  
          System.out.println();  
      }  
}

public static void BL1005(String[] args) {
  Scanner sc = new Scanner(System.in);
  BL1005AC m = new BL1005AC();
  int n = 0;
  n = sc.nextInt();
  m.n = String.valueOf(n);
  sc.nextLine();
  String[] givenNum = new String[n];
  String str = "";
  str = sc.nextLine();
  sc.close();
  givenNum = str.split(" ");
  m.arr = givenNum;
  m.calKeyNum();
}
}