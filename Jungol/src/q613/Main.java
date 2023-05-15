package q613;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		String inpName = sc.next();
		String inpSchool = sc.next();
		int inpGrade = sc.nextInt();
		sc.close();
		
		School s = new School(inpName, inpSchool, inpGrade);
		
		System.out.println("Name : " + s.name);
		System.out.println("School : " + s.school);
		System.out.println("Grade : " + s.grade);
		
	}
}
