package q111;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = new int[4];
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		

		int avg = sum / score.length;
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
		
//		int lng = sc.nextInt();
//		int eng = sc.nextInt();
//		int mat = sc.nextInt();
//		int cmp = sc.nextInt();
//		sc.close();
//		
//		int sum = lng + eng + mat + cmp;
//		int cnt = 4; 
//		int avg = sum / cnt;
//		
//		System.out.println("sum " + sum);
//		System.out.println("avg " + avg);
//		
//		
	}
}
