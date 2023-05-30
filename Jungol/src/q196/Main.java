package q196;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addr = sc.next();
		Member m1 = new Member(name, tel, addr);
		name = sc.next();
		tel = sc.next();
		addr = sc.next();
		Member m2 = new Member(name, tel, addr);
		name = sc.next();
		tel = sc.next();
		addr = sc.next();
		Member m3 = new Member(name, tel, addr);

		sc.close();
		
		if(Member.past(m1.name.charAt(0), m2.name.charAt(0), m3.name.charAt(0)) == 1) {
			System.out.println("name : " + m1.name);
			System.out.println("tel : " + m1.tel);
			System.out.println("addr : " + m1.addr);
		} else if (Member.past(m1.name.charAt(0), m2.name.charAt(0), m3.name.charAt(0)) == 2) {
			System.out.println("name : " + m2.name);
			System.out.println("tel : " + m2.tel);
			System.out.println("addr : " + m2.addr);
		} else if(Member.past(m1.name.charAt(0), m2.name.charAt(0), m3.name.charAt(0)) == 3) {
			System.out.println("name : " + m2.name);
			System.out.println("tel : " + m2.tel);
			System.out.println("addr : " + m2.addr);
		}
		
		
	}
}

class Member {
	String name;
	String tel;
	String addr;

	Member(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	static int past(char c1, char c2, char c3) {
		if (c1 <= c2 && c1 <= c3) {
			return 1;
		} else if (c2 <= c1 && c2 <= c3) {
			return 2;
		} else {
			return 3;
		}
	}
}