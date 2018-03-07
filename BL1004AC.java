package cn.jasonjing.BasicLevel;

//java ¥˙¬Î µœ÷
import java.util.Scanner;
public class BL1004AC {

	private String name;
	  private String sID;
	  private int score;
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public String getsID() {
	    return sID;
	  }
	  public void setsID(String sID) {
	    this.sID = sID;
	  }
	  public int getScore() {
	    return score;
	  }
	  public void setScore(int score) {
	    this.score = score;
	  }
	  public void sortByScore(BL1004AC []stu,int n){
		BL1004AC min,max;
	    min = stu[0];
	    max = stu[0];
	    for(int i = 1; i < n;i++){
	      if(min.score>stu[i].score){
	        min = stu[i];
	      }
	      if(max.score<stu[i].score){
	        max = stu[i];
	      }
	    }
	    System.out.println(max.name+" "+max.sID);
	    System.out.println(min.name+" "+min.sID);
	  }
	  public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    sc.nextLine();
	    BL1004AC[] stu = new BL1004AC[n];
	    String temp = "";    
	    for(int i = 0;i < n;i++){
	      temp = sc.nextLine();
	      String [] student = temp.split(" ");
	      stu[i] = new BL1004AC();
	      stu[i].name = student[0];
	      stu[i].sID = student[1];
	      stu[i].score = Integer.parseInt(student[2]);      
	    }
	    sc.close();
	    stu[0].sortByScore(stu, n);
	  }
}
