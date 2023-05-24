package q9131;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친한 친구의 이름과 나이를 입력하세요. ");
		String name = sc.next();
		int age = sc.nextInt();
		sc.close();
		
		Friend fri = new Friend(); // 객체 생성
		fri.friend(name, age); // 메소드 호출
		
	}
}

class Friend {
	String name = "손예준";
	int age = 12;
	
//	Friend() {} 생략
	
	void friend(String name, int age) {
		System.out.println("당신의 이름 : " + this.name + ", 나이 : " + this.age);
		this.name = name;
		this.age = age;
		System.out.println("친구의 이름 : " + this.name + ", 나이 : " + this.age);
	}
}