package q513;

public class Main {

	public static void main(String[] args) {
		double yd = 91.44;
		double in = 2.54;
		double ydn = 2.1;
		double inn = 10.5;
		//                 %4.1f
		//		 		%글자수.소수점자리수f
		System.out.printf("%4.1fyd = %5.1fcm\n", ydn, ydn * yd);
		System.out.printf("%4.1fin = %5.1fcm", inn, inn * in);
	}

}
