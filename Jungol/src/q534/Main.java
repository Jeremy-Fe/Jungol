package q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char word = sc.next().charAt(0);
		sc.close();
		
		// 아스키코드 A : 65 , B : 66 ... F : 70 (성적엔 E가 없어서 69는 없음)
		if(word == 65) {
			System.out.println("Excellent");
		} else if (word == 66) {
			System.out.println("Good");
		} else if (word == 67) {
			System.out.println("Usually");
		} else if (word == 68) {
			System.out.println("Effort");
		} else if (word == 70) {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
	}
}
