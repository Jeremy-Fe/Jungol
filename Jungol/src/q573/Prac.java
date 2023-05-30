package q573;

import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			n = sc.nextInt();
			if(n < 100) {
				sc.close();
				break;
			}
		}
		gugudan.gugu(n);
	}
}
class gugudan {
	static void gugu(int num) {
		int x = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(x++ + " ");
//				System.out.printf("%2s ", x++);
			}
			System.out.println();
		}
	}
}
