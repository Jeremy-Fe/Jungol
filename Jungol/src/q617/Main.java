package q617;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 재미 좃나 없네
		Scanner sc = new Scanner(System.in);
		Member M = new Member(sc.next(), sc.nextInt());

		M.small(sc.next(), sc.nextInt());
		M.small(sc.next(), sc.nextInt());
		M.small(sc.next(), sc.nextInt());
		M.small(sc.next(), sc.nextInt());
		sc.close();
		System.out.println(M.smallPerson + " " + M.smallHeight);
	}
}
class Member {
	String name;
	int height;
	String smallPerson;
	int smallHeight;

	Member(String name, int height) {
		this.name = name;
		this.height = height;
	}

	void small(String name, int height) {
		if (this.height > height) {
			smallHeight = height;
			smallPerson = name;
		}
	}

}