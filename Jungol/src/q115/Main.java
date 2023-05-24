package q115;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minsuHeight = sc.nextInt();
		int minsuWeight = sc.nextInt();
		int kiyoungHeight = sc.nextInt();
		int kiyoungWeight = sc.nextInt();
		sc.close();
		
		// boolean 사용
		boolean comparison = minsuHeight > kiyoungHeight && minsuWeight > kiyoungWeight;
		
		System.out.println(comparison);
		
		// 삼항연산자
//		System.out.println(minsuHeight > kiyoungHeight && minsuWeight > kiyoungWeight ? true : false);
		
		
		// if 문
//		if(minsuHeight > kiyoungHeight && minsuWeight > kiyoungWeight) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
	}
}
