package q633;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("\nSeoul\n");
			} else if (num == 2) {
				System.out.println("\nWashington\n");
			} else if (num == 3) {
				System.out.println("\nTokyo\n");
			} else if (num == 4) {
				System.out.println("\nBeijing\n");
			} else {
				System.out.print("\nnone");
				break;
			}
		}
		sc.close();
	}
}