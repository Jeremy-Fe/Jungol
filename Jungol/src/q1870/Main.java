package q1870;

import java.util.Scanner;

public class Main {
	static int n, m, cnt, air;
	static int[][] ch;
	
	public static void print() {
		System.out.println("----------------------------------------");
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void melt() {
		air = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				if(ch[i][j] == 2) {
					ch[i][j] = 0;
				} else if (ch[i][j] == 1){
					if(ch[i+1][j] == 0) {air++;}
					if(ch[i-1][j] == 0) {air++;}
					if(ch[i][j+1] == 0) {air++;}
					if(ch[i][j-1] == 0) {air++;}
					if(air >= 2) {
						ch[i][j] = 2;
					}
				}
				air = 0;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				if(ch[i][j] == 2) {
					ch[i][j] = 0;
				}
			}
		}
	}
	public static boolean allMelt() {
		boolean result = false;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				if(ch[i][j] != 0) {
					result = true;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		ch = new int[n][m];
		cnt = 0;
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				ch[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		while(allMelt()) {
			melt();
			print();
			cnt++;
		}
		
		System.out.println("----------------------------------------");
		System.out.println(cnt);
	}
}
