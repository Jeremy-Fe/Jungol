package q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		School s1 = new School("Jejuelementary", 6);
		School s2 = new School(name, grade);
		
		System.out.println(s1.grade + " grade in " + s1.name + " School");
		System.out.println(s2.grade + " grade in " + s2.name + " School");
	}
}