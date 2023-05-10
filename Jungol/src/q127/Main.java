package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		
		while(true) {
			int inp = sc.nextInt();
			if (inp > 100 || inp < 0) {
				sc.close();
				break;
			}
			cnt++;
			sum += inp;
		}
		System.out.println("sum : " + sum);
		avg = (double)sum / cnt;
		System.out.printf("avg : %.1f", avg);
	}
}
