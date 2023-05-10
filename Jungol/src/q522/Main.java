package q522;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.println(num1 == num2 ? 1 : 0);
		System.out.println(num1 != num2 ? 1 : 0);
		
		
//		    삼항 연산자      (    조건식    ?  참   : 거짓  );
//		System.out.println(num1 == num2 ? true : false);
//		System.out.println(num1 != num2 ? true : false);
	}
}
