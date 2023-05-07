package q110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("yard? ");
		double yard = sc.nextDouble();
		double yardCm = yard * 91.44;
		sc.close();
		
		System.out.printf("%.1f%s%.1f%s", yard, "yard = ", yardCm, "cm");
	}

}
