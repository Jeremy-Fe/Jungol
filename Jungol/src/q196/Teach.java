//package q196;
//
//import java.util.Scanner;
//
//public class Teach {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String name = sc.next();
//		String tel = sc.next();
//		String addr = sc.next();
//		Person p1 = new Person(name, tel, addr);
//		
//		name = sc.next();
//		tel = sc.next();
//		addr = sc.next();
//		Person p2 = new Person(name, tel, addr);
//		
//		name = sc.next();
//		tel = sc.next();
//		addr = sc.next();
//		Person p3 = new Person(name, tel, addr);
//		sc.close();
//		
//		
//		p1.print();
//		p2.print();
//		p3.print();
//		
//		// 집가서 공부하자 우철아 정신차려
//		
//	}
//}
//class Person {
//	private String name;
//	private String tel;
//	private String addr;
//	
//	public Person(String name, String tel, String addr){
//		this.name = name;
//		this.tel = tel;
//		this.addr = addr;
//	}
//	
//	public void print() {
//		System.out.println(name + " " + tel + " " + addr);
//	}
//	
//	public char getFirstName() {
//		return name.charAt(0);
//	}
//	
//}