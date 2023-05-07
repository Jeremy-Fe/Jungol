package q532;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score1 = sc.nextDouble();
		double score2 = sc.nextDouble();
		sc.close();
		
		if(score1 >= 4 && score2 >= 4) {
			System.out.println("A");
		} else if (score1 >= 3 && score2 >= 3) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}
