package Practice;

public class ArrayPrac {
	public static void main(String[] args) {
		int size[] = new int[10];
		
		for (int i = 0; i < size.length; i++) {
			size[i] = 250 + (i*5);
			System.out.println("사이즈 " + size[i] + " (재고 있음)");
		}
	}

}
