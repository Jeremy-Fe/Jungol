package q572;

import java.util.Scanner;

public class Main {
	
	static void circle(int r) {
		double pie = 3.14;
		System.out.printf("%.2f",(double)(r * r * pie));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		circle(r);
	}
}
