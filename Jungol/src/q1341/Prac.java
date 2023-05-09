package q1341;

import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		sc.close();
		
		if(s < e) {
			for (int i = 1; i <= 1; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d", s, j, (j*s));
					System.out.print("   ");
//					if(j == 3 || j == 6) {
//						System.out.println();
//					}
				}
//				System.out.println();
//				System.out.println();
			}
		} else {
			for (int i = 1; i >= 1; i--) {
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d", e, j ,(j*e));
					System.out.print("   ");
//					if(j == 3 || j == 6) {
//						System.out.println();
//					}
				}
//				System.out.println();
//				System.out.println();
			}
		}
	}
}
