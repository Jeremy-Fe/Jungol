package q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String strAlpha = "";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
				strAlpha += ch;
			}
		}
		System.out.println(strAlpha.toUpperCase());
	}
}
