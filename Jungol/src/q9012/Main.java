package q9012;

public class Main {
	public static void main(String[] args) {
		int circumMulti1 = 5;
		int circumMulti2 = 2;
		int areaMulti1 = 5;
		int areaMulti2 = 5;
		
		double pie = 3.14;
		
		double circumResult = circumMulti1 * circumMulti2 * pie;
		double areaResult = areaMulti1 * areaMulti2 * pie;
		
		System.out.printf("%s%d%s%d%s%f%s%f\n", "원주 = ", circumMulti1, " * ", circumMulti2, " * ", pie, " = ", circumResult);
		System.out.printf("%s%d%s%d%s%f%s%f", "넓이 = ", areaMulti1, " * ", areaMulti2, " * ", pie, " = ", areaResult);
	}
}
