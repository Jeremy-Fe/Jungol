package q9013;

public class Main {
	public static void main(String[] args) {
		double x1 = 1.234;
		double y1 = 10.3459;
		
		double x2 = 1.23;
		double y2 = 10.35;
		
		System.out.printf("%s%7.4f\n%s%7.4f\n", "전체 7자리로 맞추고 소수 4자리까지 출력\nx = ", x1, "y = ", y1);
		System.out.printf("\n%s%.2f\n%s%.2f", "소수 2자리까지 출력(반올림)\nx = ", x2, "y = ", y2);
	}
}
