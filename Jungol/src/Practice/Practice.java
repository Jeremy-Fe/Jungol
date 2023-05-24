package Practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Prac2 f = new Prac2();
        Prac2 s = new Prac2();
        System.out.print("친한 친구의 이름과 나이를 입력하세요. ");

        f.setName("손예준");
        f.setAge(13);
        
        s.setName(sc.next());
        s.setAge(sc.nextInt());
        sc.close();
     
        

        System.out.println("당신의 이름 : " + f.getName() + ", 나이 : " + f.getAge());
        System.out.println("친구의 이름 : " + s.getName() + ", 나이 : " + s.getAge());

	}
}


