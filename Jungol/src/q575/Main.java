package q575;

import java.util.Scanner;

public class Main {
	
	static int x(int a, int b) {
		int result = a;
		for (int i = 1; i < b; i++) {
			result *= a;
		}
		
		if(b == 0) {
			result = 1;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(x(a, b));
		
	}
}
