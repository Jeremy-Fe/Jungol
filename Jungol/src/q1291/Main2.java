package q1291;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int s = sc.nextInt();
			int e = sc.nextInt();

			if (s < 2 || s > 9 || e < 2 || e > 9) {
				System.out.println("INPUT ERROR!");
				continue;
			} else {

				System.out.println("-------------------");
				if (s < e) {
					for (int i = s; i <= e; i++) {
						for (int j = 1; j <= 9; j++) {
							System.out.println(i + " x " + j + " = " + (i * j));
						}
						System.out.println("-------------------");
					}
					break;
				} else {
					for (int i = s; i >= e; i--) {
						for (int j = 1; j <= 9; j++) {
							System.out.println(i + " x " + j + " = " + (i * j));
						}
						System.out.println("-------------------");
					}
					break;
				}
			}
		}
		sc.close();
	}
}
