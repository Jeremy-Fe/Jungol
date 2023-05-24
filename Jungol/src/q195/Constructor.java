package q195;

import java.util.Scanner;

public class Constructor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addr = sc.next();
		sc.close();
		
		Capsule cap = new Capsule(name, tel, addr);
		cap.print();
		
//		System.out.println("name : " + cap.nameM());
//		System.out.println("tel : " + cap.telM());
//		System.out.println("addr : " + cap.addrM());
	}
}

class Capsule {
	private String name;
	private String tel;
	private String addr;
	
	public Capsule (String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	
	public String nameM() {
		return name;
	}

	public String telM() {
		return tel;
	}
	
	public String addrM() {
		return addr;
	}	
	
	
	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}
}