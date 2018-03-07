package cn.jasonjing.BasicLevel;

import java.util.Scanner;

public class BL1001AC {

	public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int N = scanner.nextInt();  
        int steps = 0;  
        while (N != 1) {  
            if (N % 2 == 0) {  
                N = N / 2;  
            } else {  
                N = (3 * N + 1) / 2;  
            }  
            steps++;  
        }  
        System.out.println(steps);  
    }  
}
