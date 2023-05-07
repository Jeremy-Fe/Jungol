package q518;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i]; // 합계를 구하는
		}
		
		int avg = sum / num.length;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
