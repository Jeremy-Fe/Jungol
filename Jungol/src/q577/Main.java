package q577;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		Method method = new Method(n1, n2);
		method.big /= 2;
		method.small *= 2;
		if(n1 > n2) {
			System.out.println(method.big + " " + method.small);
		} else if (n2 > n1) {
			System.out.println(method.small + " " + method.big);
		}
	}
}

class Method{
	int big;
	int small;
	
	Method(){}
	
	Method(int b, int s){
		if(b > s) {
			big = b;
			small = s;
		} else if(s > b) {
			big = s;
			small = b;
		}
	}
}

