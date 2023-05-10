package Practice;

public class If_OperatorExample {
	public static void main(String[] args) {
		int score = 93;
		
		String judge = score >= 90 ? "점수가 90보다 큽니다.\n등급은 A입니다." : "점수가 90보다 작습니다.\n등급은 B입니다.";
		System.out.println(judge);
	}
}	
