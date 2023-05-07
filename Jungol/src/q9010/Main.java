package q9010;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		
		// 1. swap
		int c = a;
		a = b;
		b = c;
		
		//2. 
		List<?> ar = Arrays.asList(4, 5);
		System.out.println(ar);
		Collections.swap(ar, 0, 1);
		System.out.println(ar);
		
		
		System.out.print(a + " " + b);
	}

}
