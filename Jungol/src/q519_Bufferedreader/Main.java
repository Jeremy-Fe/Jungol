package q519_Bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		System.out.print(s1);
		System.out.print(s2);


//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		sc.close();
//		
//		num1 += 100;
//		num2 %= 10;
//		
//		System.out.print(num1 + " ");
//		System.out.print(num2);
	}

}
