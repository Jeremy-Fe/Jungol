package q571;

import java.util.Scanner;

public class Main {
	static void r (int n) {
		for (int i = 0; i < n; i++) {
			String str = "~!@#$^&*()_+|";
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		r(n);
	}
}
