package q196;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person = new Person();
		String[] temp = new String[3];
		
		for (int i = 0; i < 3; i++) {
			person.name[i] = sc.next();
			person.tel[i] = sc.next();
			person.addr[i] = sc.next();
		}
		sc.close();
		
		temp[0] = person.name[0];
		temp[1] = person.tel[0];
		temp[2] = person.addr[0];
		
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < i; j++) {
				if(person.name[i].charAt(0) < person.name[j].charAt(0)) {
						temp[0] = person.name[i];
						temp[1] = person.tel[i];
						temp[2] = person.addr[i];
				}
			}
			
		}
		System.out.println("name : " + temp[0]);
		System.out.println("tel : " + temp[1]);
		System.out.println("addr : " + temp[2]);
		
	}
}

class Person {
	String[] name = new String[3];
	String[] tel = new String[3];
	String[] addr = new String[3];
	
}
