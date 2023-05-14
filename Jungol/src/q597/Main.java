package q597;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		String str2;
		
		while (true) {
			str1 = sc.next();
			str2 = sc.next();

			if (str1.length() >= 20 || str2.length() >= 20) {
				continue;
			} else {
				sc.close();
				break;
			}
		}
		System.out.println(str1.length() + str2.length());
	}
}
