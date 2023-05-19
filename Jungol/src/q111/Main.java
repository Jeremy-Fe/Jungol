package q111;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lng = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int cmp = sc.nextInt();
		sc.close();
		
		int sum = lng + eng + mat + cmp;
		int cnt = 4; 
		int avg = sum / cnt;
		
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
		
		
	}
}
