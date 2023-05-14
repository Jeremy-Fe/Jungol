package q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int index = sc.nextInt();
		sc.close();
		char arr[] = new char[100];
		
		for (int i = 0; i < word.length(); i++) {
			arr[i] = word.charAt(word.length()-1-i);
		}
		if (word.length() < index) {
			index = word.length();
		}
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
