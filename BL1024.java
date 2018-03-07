package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BL1024 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		char[] s = data.toCharArray();
	    int len = s.length;
	    if (s[0] == '-')
	        System.out.print( "-");
	    int pose = 0;
	    for (int i = 1; i < len; i++) {
	        if (s[i] == 'E')
	            pose = i;
	    }
	    int after = 0;
	    for (int i = pose + 2; i < len; i++) 
	        after = (s[i] - '0') + 10 * after;
	    if (s[pose + 1] == '-') {
            System.out.print( "0.");
            for (int i = 1; i < after; i++) 
                System.out.print( 0);
            for (int i = 1; i < pose; i++) {
                if (s[i] >= '0' && s[i] <= '9') 
                    System.out.print( s[i]);
            }
	    }
	    else {
	        if (pose - 3 < after) {
	            if (s[1] != '0')
	                System.out.print( s[1]);
	            for (int i = 3; i < pose; i++) {
	                if (s[i] >= '0' && s[i] <= '9') 
	                    System.out.print( s[i]);
	            }
	            for (int i = 0; i < after - (pose - 3); i++) 
	                System.out.print( 0);
	        }
	        else {
	            if (s[1] != '0')
	                System.out.print( s[1]);
	            for (int i = 3; i < pose; i++) {
	                if (i == 3 + after) 
	                    System.out.print( ".");
	                if (s[i] >= '0' && s[i] <= '9') 
	                    System.out.print( s[i]);
	            }
	        }
	    }
	}
}
