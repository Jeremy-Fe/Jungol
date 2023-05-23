package q574;

import java.util.Scanner;

public class Main {
//	static int max(int n1, int n2, int n3) {
//		int max = n1;
//		if(max < n2) {
//			max = n2;
//		}
//		if(max < n3) {
//			max = n3;
//		}
//		return max;
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		System.out.println(maxnumber.max(n1, n2, n3));
	}
}




