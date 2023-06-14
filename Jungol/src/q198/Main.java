package q198;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dadHeight = sc.nextInt();
		double dadWeight = sc.nextDouble();
		int momHeight = sc.nextInt();
		double momWeight = sc.nextDouble();
		sc.close();
		
		int parentsAvgHeight = (dadHeight + momHeight) / 2;
		double parentsAvgWeight = (dadWeight + momWeight) / 2;
		
		Parents pa = new Parents(parentsAvgHeight, parentsAvgWeight);
		
		System.out.printf("height : %dcm\n", pa.getHeight());
		System.out.printf("weight : %.1fkg", pa.getWeight());
		
		
		
	}
}
class Parents {
	private int height;
	private double weight;
	
	public Parents() {
		
	}
	
	public Parents(int height, double weight) {
		this.height = height + 5;
		this.weight = weight - 4.5;
	}
	
	public int getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
}
