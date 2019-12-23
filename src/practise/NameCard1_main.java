package practise;

import java.util.Scanner;

public class NameCard1_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NameCard1 nc = new NameCard1();
		System.out.println("이름, 전화번호, 주소, 직급을 입력하세요.");
		nc.setName(sc.nextLine());
		nc.setPhone(sc.nextLine());
		nc.setAddr(sc.nextLine());
		nc.setPos(sc.nextLine());
		
		System.out.println("====================================");
		System.out.println("이     름	: " + nc.getName());
		System.out.println("전화번호	: " + nc.getPhone());
		System.out.println("주     소	: " + nc.getAddr());
		System.out.println("직     급 	: " + nc.getPos());
		
		sc.close();
	}

}
