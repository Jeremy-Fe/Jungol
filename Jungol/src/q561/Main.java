package q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		int max = 0;
		int min = 9999;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] >= 1 && arr[i] <= 99) {
				if(arr[i] > max) {
					max = arr[i];
				}
			} else if (arr[i] >= 100 && arr[i] <= 9999) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			
		}
		if (max == 1) {
			max = 100;
		}
		if (min == 9999) {
			min = 100;
		}
		sc.close();
		System.out.print(max + " " + min);
	}
}
