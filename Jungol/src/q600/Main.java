package q600;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int count = 1;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
			count+=1;			
			}
		}
		System.out.println(count);
	}
}
