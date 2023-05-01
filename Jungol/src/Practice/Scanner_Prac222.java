package Practice;

import java.util.Scanner;

public class Scanner_Prac222 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		sc.close();
		
		System.out.println("height = Your height is " + height + "cm.");
	}
}
