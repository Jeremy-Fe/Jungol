package q530;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		
		
		if(age >= 20) {
			System.out.println("adult");
		} else if (age >= 0){
			int later = 20 - age;
			System.out.println(later + " years later");
		} else {
			System.out.println("were you born?");
		}
		
	}
}
