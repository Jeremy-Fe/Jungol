package q1341;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		sc.close();
		// 오늘도 정말 고생 많으셨고 내일도 화이팅 합시다 행님덜
		if(s < e) {
			for (int i = s; i <= e; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d", i, j, (j*i));
					System.out.print("   ");
					if(j % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}
		} else {
			for (int i = s; i >= e; i--) {
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d", i, j ,(j*i));
					System.out.print("   ");
					if(j % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}
		}
	}
}
