package q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();
		
		// 아스키 코드 F : 70 , M : 77 char 는 equals 가 안됨 String 만 가능
		if(gender == 'M' && age >= 18) {
			System.out.println("MAN");
		} else if (gender == 'M' && age < 18) {
			System.out.println("BOY");
		} else if (gender == 'F' && age >= 18) {
			System.out.println("WOMAN");
		} else if (gender == 'F' && age < 18) {
			System.out.println("GIRL");
		}
	}
}
