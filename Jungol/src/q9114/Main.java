package q9114;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			char chr = sc.next().charAt(0);
			
			if(chr >= 97 && chr <= 122) {
				System.out.println("소문자입니다.");
			} else if (chr >= 65 && chr <= 90) {
				System.out.println("대문자입니다.");
			} else if (chr >= 48 && chr <= 57) {
				System.out.println("숫자문자입니다.");
			} else {
				System.out.println("영문, 숫자 이외의 문자입니다.");
				sc.close();
				break;
			}
		}
	}
}
