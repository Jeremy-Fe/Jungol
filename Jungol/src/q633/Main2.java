package q633;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		loop: while (true) {
			System.out.print("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? \n");
			int num = sc.nextInt();

			switch (num) {
			case 1: System.out.println("Seoul\n");
				break;
			case 2: System.out.println("Washington\n");
				break;
			case 3: System.out.println("Tokyo\n");
				break;
			case 4: System.out.println("Beijing\n");
				break;
			default: System.out.print("none");
				sc.close();
				break loop;
			}
		}
	}
}
