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
				System.out.println("입력한 정수가 1,000을 넘었습니다. 다시 입력하세요.");
			}
		}
		sc.close();
		System.out.println(min);
	}
}
