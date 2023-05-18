package q616;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		sc.close();
		
		Triangle G = new Triangle(x1, y1, x2, y2, x3, y3);
		
		double triXG = (double) (G.x1+G.x2+G.x3)/3;
		double triYG = (double) (G.y1+G.y2+G.y3)/3;
		
		System.out.printf("(%.1f, %.1f)", triXG, triYG);
		
		
//		int triX = sc.nextInt();
//		int triY = sc.nextInt();		
//		Triangle x1 = new Triangle(triX, triY);
//		
//		triX = sc.nextInt();
//		triY = sc.nextInt();
//		Triangle x2 = new Triangle(triX, triY);
//		
//		triX = sc.nextInt();
//		triY = sc.nextInt();
//		Triangle x3 = new Triangle(triX, triY);
//		sc.close();
//		
//		double triXG = (double) (x1.x+x2.x+x3.x)/3;
//		double triYG = (double) (x1.y+x2.y+x3.y)/3;
//		
//		System.out.printf("(%.1f, %.1f)", triXG, triYG);
		
	}
}



