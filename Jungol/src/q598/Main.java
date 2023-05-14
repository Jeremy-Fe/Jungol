package q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			char chr = sc.next().charAt(0);
			
			if(chr >= 65 && chr <= 90 || chr >= 97 && chr <= 122) {
				System.out.println(chr);
			} else if (chr >= 48 && chr <= 57) {
				System.out.printf("%d\n", (int)chr);
			} else {
				sc.close();
				break;
			}
		}
	}
}
