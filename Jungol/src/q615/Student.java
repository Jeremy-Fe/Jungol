package q615;

public class Student {
	String name;
	int lang;
	int eng;
	int sum;
	double avg;
	
	
	public Student (String n, int l, int e) {
		name = n;
		lang = l;
		eng = e;
	}
	
	public void sum () {
		sum = lang + eng;
	}
	
	
	
}
