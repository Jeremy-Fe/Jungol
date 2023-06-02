package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String str2;
		
		for (int i = 0; i < str.length(); i++) {
			str2 = str.substring(str.length()-1, str.length());
			str2 += str.substring(0, str.length()-1);
			System.out.println(str2);
			str = str2;
		}

	}
}
