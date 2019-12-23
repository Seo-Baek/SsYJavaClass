package practise;

import java.util.Scanner;

public class Temporary_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
		Temporary tem = new Temporary(sc.next(),sc.nextInt(),sc.nextInt());
		tem.giveMoney();
		
		sc.close();
	}

}
