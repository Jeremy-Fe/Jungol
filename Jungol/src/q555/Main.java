package q555;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chr = new char[10];
		
		for (int i = 0; i < chr.length; i++) {
			chr[i] = sc.next().charAt(0);
			System.out.printf("%c", chr[i]);
		}
		sc.close();
		
//		for (int i = 0; i < chr.length; i++) {
//			System.out.printf("%c", chr[i]);
//		}
		
		//정수      int a = sc.nextInt();
		//실수      double a = sc.nextDouble();
		//문자열     String a = sc.next(); , sc.nextLine();
		//문자      char a = sc.next().charAt(0);
		
	}
}
