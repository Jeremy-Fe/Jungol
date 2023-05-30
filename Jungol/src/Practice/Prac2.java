package Practice;

import java.util.Scanner;

public class Prac2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		for (int i = 1; i <= (a * a); i++) {
			System.out.print(i + " ");
			if (i % a*i == 0) {
				System.out.println();
			}
		}
	}
}
