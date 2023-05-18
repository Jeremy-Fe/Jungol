package q596;

import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		int b = sc.nextInt();

		// korea 길이는 5

		for (int i = a.length() - 1; i >= 0; i--) {
			if (i >= b - 1) {
				System.out.print(a.charAt(i));
			} else if (a.length() < b) {
				for (int j = a.length() - 1; j >= 0; j--) {
					System.out.print(a.charAt(j));
				}
			}
		}
	}
}
