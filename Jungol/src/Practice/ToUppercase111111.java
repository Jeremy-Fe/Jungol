package Practice;

import java.util.Scanner;

public class ToUppercase111111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char tmp;
		String result = "";
		
		for (int i = 0; i < a.length(); i++) {
			tmp = a.charAt(i);
			
			if(tmp >= 65 && tmp <= 90) { // Character.isUpperCase(tmp) 
				tmp += 32; // C 언어 스타일
				result += tmp;           // 메소드에 is 가 붙으면 true , fales 가 기본
			} else if (tmp >= 97 && tmp <= 122) { // Character.isLowerCase(tmp) 
				result += a.valueOf(tmp).toUpperCase(); // value of = String 타입으로 바꾼다
			} else {
				result += tmp;
			}
		}
		sc.close();
		System.out.println(result);
	}
}
