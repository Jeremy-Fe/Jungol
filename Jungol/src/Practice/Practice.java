package Practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					int temp; 
					temp = arr[i];
					arr[i] = arr[j]; 
					arr[j] = temp;
				}
			}
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
