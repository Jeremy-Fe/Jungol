package q617;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Member M[] = new Member[5];
		for (int i = 0; i < M.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			M[i] = new Member(name, height);
		}
		sc.close();
		
		Member min = M[0];
		for (int i = 0; i < M.length; i++) {
			if(min.getHeight() > M[i].getHeight()) {
				min = M[i];
			}
		}
		
		min.print();
		

	}
}
class Member {
	private String name;
	private int height;

	// setter
	public Member(String name, int height) {
		this.name = name;
		this.height = height;
	}

	// getter
	public void print() {
		System.out.println(name + " " + height);
	}
	
	public int getHeight() {
		return height;
	}

}