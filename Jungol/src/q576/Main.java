package q576;

import java.util.Scanner;

public class Main {
	
	static void Operator(int n1, char oper, int n2) {
		int result = 0;
		
		if(oper == '+') {
			result = n1 + n2;
		} else if (oper == '-') {
			result = n1 - n2;
		} else if (oper == '*') {
			result = n1 * n2;
		} else if (oper == '/') {
			result = n1 / n2;
		} else {
			result = 0;
		}
		
		System.out.printf("%s %c %s = %s",n1,oper,n2,result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		char oper = sc.next().charAt(0);
		int n2 = sc.nextInt();
		sc.close();
		
		Operator(n1,oper,n2);
	}
}
