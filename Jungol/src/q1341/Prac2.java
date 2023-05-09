package q1341;

import java.util.Scanner;

public class Prac2 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        sc.close();

        for (int i = s; i <= e; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf(i + " * " + j + " = %2d", (i * j));
                System.out.print("   ");
                if (j % 3 == 0) {
                	System.out.println();
                }
            }
            System.out.println();
        }
    }
}