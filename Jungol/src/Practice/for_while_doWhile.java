package Practice;

import java.util.Scanner;

public class for_while_doWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
