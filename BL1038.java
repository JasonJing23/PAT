package cn.jasonjing.BasicLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BL1038 {

	public static void main(String[] args) throws Exception {

		int[] score = new int[101];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] input = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			score[Integer.parseInt(input[i])]++;
		}
		String[] s = br.readLine().split(" ");
		int k = Integer.parseInt(s[0]);
		for (int i = 0; i < k - 1; i++) {
			System.out.print(score[Integer.parseInt(s[i + 1])] + " ");
		}
		System.out.print(score[Integer.parseInt(s[s.length - 1])]);
		
	}

}
/*
 * 
//scanf 效率很高，而用cin可能会有超时的危险
//C/C++实现
#include <iostream>

using namespace std;

int grade[101];

int main(){
    int n;
    scanf("%d", &n);
    int tmp;
    for(int i = 0; i < n; ++i){
        scanf("%d", &tmp);
        ++grade[tmp];
    }
    int k;
    scanf("%d", &k);
    scanf("%d", &tmp);
    printf("%d", grade[tmp]);
    for(int i = 1; i < k; ++i){
        scanf("%d", &tmp);
        printf(" %d", grade[tmp]);
    }
    printf("\n");
    return 0;
}


 
 
 * 
 * */



