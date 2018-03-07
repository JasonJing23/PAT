package cn.jasonjing.BasicLevel;

import java.util.Scanner;

public class BL1009AC {

	 public void reverseTalk(String words){
		    String[] word = words.split(" ");
		    for(int i = word.length-1;i>0;i--){
		      System.out.print(word[i]+ " ");
		    }
		    System.out.println(word[0]);
		  }
		  public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
		    String words = sc.nextLine();
		    sc.close();
		    BL1009AC M = new BL1009AC();
		    M.reverseTalk(words);
		  }
}
