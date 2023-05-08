package q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		double avg = 0;
		
		while (true) {
			int num = sc.nextInt();
			count++;
			sum += num;
			
			if(num >= 100)
				break;
		}
		sc.close();
		
		avg = (double)sum/count;
		System.out.println(sum);
		System.out.printf("%.1f", avg);
	}
}
