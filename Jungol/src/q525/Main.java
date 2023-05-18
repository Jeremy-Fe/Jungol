package q525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		
		boolean a = n1 > n2 && n1 > n3;
		boolean b = n1 == n2 && n2 == n3;
		
		System.out.print(a + " " + b);
	}
}
