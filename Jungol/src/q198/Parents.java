package q198;

public class Parents {
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
