package q615;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int lang = sc.nextInt();
		int eng = sc.nextInt();
		Student s1 = new Student(name, lang, eng);
		
		name = sc.next();
		lang = sc.nextInt();
		eng = sc.nextInt();
		Student s2 = new Student(name, lang, eng);
		sc.close();
		
		
		int langAvg = (s1.lang + s2.lang) / 2;
		int engAvg  = (s1.eng + s2.eng) / 2;
		
		
		System.out.println(s1.name + " " + s1.lang + " " + s1.eng);
		System.out.println(s2.name + " " + s2.lang + " " + s2.eng);
		System.out.println("avg " + langAvg + " " + engAvg);
		
	}
}

