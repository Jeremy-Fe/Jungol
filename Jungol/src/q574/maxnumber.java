package q574;

public class maxnumber {
	// 필드
	
	// 생성자
	
	// 메소드
	static int max(int n1, int n2, int n3) {
		int max = n1;
		if(max < n2) {
			max = n2;
		}
		if(max < n3) {
			max = n3;
		}
		return max;
	}
	
	
}
