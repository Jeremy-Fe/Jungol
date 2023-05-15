package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int min = 1000;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(min > arr[i]) {
				min = arr[i];
			}
			if(arr[i] > 1000) {
				i--;
			}
		}
		sc.close();
		System.out.println(min);
	}
}
