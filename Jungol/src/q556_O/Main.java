package q556_O;

public class Main {
	public static void main(String[] args) {
		int num[] = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] += i + 1;
			System.out.print(num[i]);
			
			if(i < num.length-1) {
			System.out.print(" ");
			} 
		}
	}
}