package practise;

import java.util.Scanner;

public class Temporary1_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
		Temperary1 tem = new Temperary1();
		
		tem.setName(sc.nextLine());
		tem.setTime(sc.nextInt());
		tem.setPay(sc.nextInt());
		
		tem.giveMoney();
		
		sc.close();
	}

}
