package q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];
		
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		sc.close();
		System.out.println(str[0] + " " + str[3] + " " + str[6]);
	}
}
