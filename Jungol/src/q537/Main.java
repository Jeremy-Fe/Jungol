package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
//		=========================================================================
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		
//		int sum = 0;
//		int i = 1;
//		
//		while (i <= num) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
//		=========================================================================
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		
//		int sum = 0;
//		int i = 1;
//		
//		do {
//			sum = sum + i;
//			i++;
//		} while (i <= num);
//		
//		System.out.println(sum);
	}
}
