package q9067;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		sc.close();
		System.out.print(arr[2] + " " + arr[4] + " " + arr[arr.length-1]);
		
	}
}
