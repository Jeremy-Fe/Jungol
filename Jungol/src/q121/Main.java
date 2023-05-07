package q121;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
		if (number == 0) {
			System.out.println("zero");
		} else if (number > 0) {
			System.out.println("plus");
		} else if (number < 0) {
			System.out.println("minus");
		}
	}

}
