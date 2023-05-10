package Practice;

public class ParkingPrac {

	public static void main(String[] args) {
		int hour = 15;
		int price = hour * 4000;
		boolean handi = false;
		boolean smallCar = true;
		
		if (price > 30000) {
			price = 30000;
		}
		if (handi || smallCar) {
			price /= 2;
		}
		
		System.out.println("주차 요금은 " + price + " 원입니다.");
		
	}

}
