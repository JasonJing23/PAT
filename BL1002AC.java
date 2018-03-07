package cn.jasonjing.BasicLevel;

import java.util.Scanner;

public class BL1002AC {
	public int calculate(String str) {
	    int value = 0;
	    while(str.length()>0){
	      value=value+(int)(str.charAt(0))-48;
	      str=str.substring(1,str.length());
	    }
	    return value;
	  }
	  public String convert(int n){
	    switch (n) {
	    case 0:
	      return "ling";
	    case 1:
	      return "yi";
	    case 2:
	      return "er";
	    case 3:
	      return "san";
	    case 4:
	      return "si";
	    case 5:
	      return "wu";
	    case 6:
	      return "liu";
	    case 7:
	      return "qi";
	    case 8:
	      return "ba";
	    case 9:
	      return "jiu";
	    default:
	      break;
	    }
	    return null;
	  }
	  public String result(int value){
	    String result="";
	    while(value>0){
	      int temp = value % 10;
	      value = value/10;
	      if(result==""){
	        result = convert(temp) + "" + result;
	      } else {
	        result = convert(temp) + " " + result;
	      }      
	    }
	    return result;
	  }
	  public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String str = in.nextLine();
	    BL1002AC m = new BL1002AC();
	    System.out.println(m.result(m.calculate(str)));
	  }
}

