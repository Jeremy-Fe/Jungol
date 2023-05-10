package q129;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			double triangleWidth = (double)base * height / 2;
			System.out.printf("Triangle width = %.1f\n", triangleWidth);

			System.out.print("Continue? ");
			char conti = sc.next().charAt(0);
			if (conti == 'Y' || conti == 'y') {
				continue;
			} else {
				sc.close();
				break;
			}
			
		}
	}
}
