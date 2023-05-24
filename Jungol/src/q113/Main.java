package q113;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt() + 5;
		int length = sc.nextInt() * 2;
		sc.close();
		int area = width * length;
		
		System.out.println("width = " + width);
		System.out.println("length = " + length);
		System.out.println("area = " + area);
	}
}
