package q9066;

public class Test {
	public static void main(String[] args) {
		char chr[] = new char[26];

		for (int i = 0; i < chr.length; i++) {
			chr[i] = (char)(i+ 65);
		}
		for (int i = chr.length-1; i >= 0; i--) {
			System.out.print(chr[i] + " ");
		}
	}
}
