package q515;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int S = sc.nextInt();
		sc.close();
		
		if (L < 0 || S < 0 || L > 500 || S > 500) {
			System.out.println("숫자를 다시 입력하세요.\n입력되는 두 정수는 1 이상 500 이하여야 합니다.");
		} else if (L < S) {
			System.out.println("숫자를 다시 입력하세요.\n먼저 입력받는 수가 항상 커야합니다.");
		} else {
			System.out.println(L + " * " + S + " = " + L * S);
			System.out.println(L + " / " + S + " = " + L / S);
		}
	}
}
