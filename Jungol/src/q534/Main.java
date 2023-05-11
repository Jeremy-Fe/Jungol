package q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char word = sc.next().charAt(0);
		sc.close();
		
		// 아스키코드 A : 65 , B : 66 ... F : 70 (성적엔 E가 없어서 69는 없음)
		if(word == 65) { // 65 == 'A'
			System.out.println("Excellent");
		} else if (word == 'B') {
			System.out.println("Good");
		} else if (word == 'C') {
			System.out.println("Usually");
		} else if (word == 'D') {
			System.out.println("Effort");
		} else if (word == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
		
		
//		switch(word) {
//		case 'A': System.out.println("Excellent");
//			break;
//		case 'B': System.out.println("Good");
//			break;
//		case 'C': System.out.println("Usually");
//			break;
//		case 'D': System.out.println("Effort");
//			break;
//		case 'F': System.out.println("Failure");
//			break;
//		default : System.out.println("error");
//		}
	}
}
