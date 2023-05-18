package q562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		
		int sum = 0, count = 0, avgsum = 0; 
		double avg;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(i % 2 != 0) {
				sum += arr[i];
			} else if (i % 2 == 0) {
				count++;
				avgsum += arr[i];
			}
		}
		
		sc.close();
		System.out.println("sum : " + sum);
		avg = (double)avgsum / count;
		System.out.printf("avg : %.1f",avg);
	}
}
