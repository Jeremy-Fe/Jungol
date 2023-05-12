package q613_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School schl = new School();

		schl.name = sc.next();
		schl.school = sc.next();
		schl.grade = sc.nextInt();

		School schl2 = new School();

		schl2.name = sc.next();
		schl2.school = sc.next();
		schl2.grade = sc.nextInt();

		System.out.println("== input");
		System.out.println(schl.name + " " + schl.school + " " + schl.grade);
		System.out.println(schl2.name + " " + schl2.school + " " + schl2.grade);

		System.out.println("\n== output");

		System.out.println("Name : " + schl.name);
		System.out.println("School : " + schl.school);
		System.out.println("Grede : " + schl.grade);
		System.out.println("\nName : " + schl2.name);
		System.out.println("School : " + schl2.school);
		System.out.println("Grede : " + schl2.grade);
	}
}
