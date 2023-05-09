package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int odd = 0, even = 0;
		
		while(true) {
			int a = sc.nextInt();
			if((a % 2) == 0 && a != 0) {
				even++;
			} else if((a % 2) != 0) {
				odd++;
			} else if(a == 0) {
				System.out.println("odd : " + odd);
				System.out.print("even : " + even);
				sc.close();
				break;
			}
		}
	}
}
