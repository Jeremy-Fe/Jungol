package q9015;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하시오. ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}
}
