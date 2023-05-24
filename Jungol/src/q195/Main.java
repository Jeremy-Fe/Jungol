package q195;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Cap capsule = new Cap();
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String tel = sc.next();
		String address = sc.next();
		sc.close();
		
		capsule.setName(name);
		System.out.println("name : " + capsule.getName());
		
		capsule.setTel(tel);
		System.out.println("tel : " + capsule.getTel());
		
		capsule.setAddress(address);
		System.out.println("addr : " + capsule.getAddress());
		
	}
}

class Cap{
	private String name;
	private String tel;
	private String address;
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
