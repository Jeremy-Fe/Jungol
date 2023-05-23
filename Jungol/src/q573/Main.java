package q573;

import java.util.Scanner;

public class Main {
	
	static void square(int n) {
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(x + " ");
//				System.out.printf("%-2s ",x); // 이게 더 적절하지만 정올에서는 0점
				x++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			n = sc.nextInt();
			if(n < 100) {
				sc.close();
				break;
			}
		}
		square(n);
	}
}
