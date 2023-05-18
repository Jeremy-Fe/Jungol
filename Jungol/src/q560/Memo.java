package q560;

import java.util.Scanner;

public class Memo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		int i = 0;
		int min = ar[0];
		while (i < ar.length) {
			min = (min <= ar[i++]) ? min : ar[i];
		}
		System.out.println(min);
	}
}
