package cn.jasonjing.BasicLevel;

import java.util.Scanner;

public class BL1003AC {

	 public static void main(String[] args){    
	      Scanner sc = new Scanner(System.in);    
	      int n = sc.nextInt();  
	      sc.nextLine();  
	      for(int i = 0 ;i < n ;i++){  
	          String s = sc.nextLine();  
	          String news = s;  
	          if(news.contains("P")&&news.contains("A")&&news.contains("T")){  
	              news = news.replace("A", "");  
	              news = news.replace("P", "");  
	              news = news.replace("T", "");  
	              news = news.replace("\\s+", "");  
	              if(news.isEmpty()){  
	                  int p = s.indexOf("P");  
	                  int t = s.indexOf("T");  
	                  int len = s.length();  
	                  int b = t - p - 1;  
	                  int c = len - t - 1;  
	                  if(p*b == c){  
	                      System.out.println("YES");  
	                  }else{  
	                      System.out.println("NO");  
	                  }  
	              }else{  
	                  System.out.println("NO");  
	              }  
	          }else{  
	              System.out.println("NO");  
	          }  
	      }  
	  }  
}
