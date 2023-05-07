package q122;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		int yearDivide1 = year % 4;
		int yearDivide2 = year % 100;
		int yearDivide3 = year % 400;
		
		if(yearDivide1 == 0 && yearDivide2 != 0 || yearDivide3 == 0) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
	}
}
