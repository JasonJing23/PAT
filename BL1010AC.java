package cn.jasonjing.BasicLevel;
//Java´úÂëÊµÏÖ
import java.util.ArrayList;
import java.util.Scanner;
public class BL1010AC {
public void polynomeDerivative(String str) {
  ArrayList<Integer>alist = new ArrayList<Integer>();
  String[] polyS = str.split("\\s+");
  int[] poly = new int[polyS.length];
  for (int i = 0; i < polyS.length; i++) {
    poly[i] = Integer.parseInt(polyS[i]);
  }
  for (int i = 0; i < poly.length; i = i + 2) {
    if (poly[i] == 0) {
      alist.add(0);
      alist.add(0);
    } else if (poly[i + 1] == 0 && poly[i] != 0) {
    } else if(poly[i + 1] != 0 && poly[i] != 0){
      alist.add(poly[i] * poly[i + 1]);
      alist.add(poly[i + 1]-1);
    }
  }
  if(alist.isEmpty()){            
          System.out.println("0 0");  
      }else{  
          for(int i=0 ;i<alist.size() ;i++){  
              System.out.print(alist.get(i));  
              if(i!=alist.size()-1){    
                  System.out.print(" ");  
              }  
          }  
          System.out.println();  
      }
}
public static void BL1010(String[] args) {
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  BL1010AC M = new BL1010AC();
  M.polynomeDerivative(str);
  sc.close();
}
}
