package q524;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		boolean c = a != 0 && b != 0;
		boolean d = a != 0 || b != 0;
		
		System.out.println(c + " " + d);
		
	}
}