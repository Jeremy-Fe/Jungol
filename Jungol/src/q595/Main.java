package q595;

public class Main {
	public static void main(String[] args) {
		String name = "Hong Gil Dong";
		
		for (int i = 3; i <= 6; i++) {
			System.out.print(name.charAt(i));
		}
//		↕ 같은 의미        ↓ substring 마지막 범위 지정 숫자는 (-1) 을 포함
//		System.out.print(name.substring(3,7));
		
		
		
	}
}