package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ctrl + Shift + 'O' "import java.util.Scanner;" 클래스 자동으로 만들어줌
		
		int inp = sc.nextInt();
		sc.close();
		
		if(inp > 0) {
			System.out.println(inp);
		} else {
			System.out.println(inp + "\nminus");
		}
		
	}

}
