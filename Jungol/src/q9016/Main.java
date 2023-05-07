package q9016;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요. ");
		int height = sc.nextInt();
		
		System.out.print("몸무게를 입력하세요. ");
		double weight = sc.nextDouble();
		
		System.out.print("이름을 입력하세요. ");
		char name = sc.next().charAt(0);
		sc.close();
		
		System.out.println("키 = " + height);
		System.out.printf("%s%.1f\n", "몸무게 = ", weight);
		System.out.println("이름 = " + name);
	}
}
