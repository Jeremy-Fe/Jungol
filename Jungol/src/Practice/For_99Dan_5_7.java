package Practice;

public class For_99Dan_5_7 {
	public static void main(String[] args) {
		for (int i = 3; i <= 4; i++) {
			System.out.println("*** " + i + "단 ***");
			for (int j = 5; j <= 7; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
		for (int i = 5; i <= 7; i++) {
			System.out.println("*** " + i + "단 ***");
			for (int j = 2; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
	}
}
