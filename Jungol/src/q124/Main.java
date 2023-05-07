package q124;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		sc.close();
		
//		switch(month) { 정올에서 swtich-case 문을 쓸 때 case 에 여러개의 숫자가 들어가면 컴파일 에러
//		case 1, 3, 5, 7, 8, 10, 12: System.out.println(31);
//			break;
//		case 2: System.out.println(28);
//			break;
//		case 4, 6, 9, 11: System.out.println(30);
//		}
		
		switch(month) {
		case 1: System.out.println(31);
			break;
		case 2: System.out.println(28);
			break;
		case 3: System.out.println(31);
			break;
		case 4: System.out.println(30);
			break;
		case 5: System.out.println(31);
			break;
		case 6: System.out.println(30);
			break;
		case 7: System.out.println(31);
			break;
		case 8: System.out.println(31);
			break;
		case 9: System.out.println(30);
			break;
		case 10: System.out.println(31);
			break;
		case 11: System.out.println(30);
			break;
		case 12: System.out.println(31);
		}
	}
}
