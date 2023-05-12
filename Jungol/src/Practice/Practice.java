package Practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input[] = new int[10];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			System.out.println(input[i]);
		}
		
	}
}
