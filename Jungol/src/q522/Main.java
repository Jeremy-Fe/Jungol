package q522;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		
		System.out.println(num1 == num2 ? 1 : 0);
		System.out.println(num1 != num2 ? 1 : 0);
	}
}