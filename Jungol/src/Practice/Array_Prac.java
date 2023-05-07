package Practice;

import java.util.Scanner;

public class Array_Prac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j] + " ");
		}
		
	}
}
