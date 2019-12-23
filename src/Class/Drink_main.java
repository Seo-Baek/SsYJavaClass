package Class;

import java.util.Scanner;

/*
 * 음료자판기
 * 	음료 종류 - 3가지
 * 	음료를 저장할 배열을 만들자	- 객체배열
 */

public class Drink_main {

	public static void main(String[] args) {
		
		// 객체배열을 만들어보자.	- 객체 배열 생성 => 메모리할당.
		
		Drink[] drink = new Drink[3];
		Scanner	sc = new Scanner(System.in);
		
		for(int i = 0; i < drink.length; i++) {
			System.out.print("음료 이름 : ");
			String drinkName = sc.next();
			System.out.print("음료 가격 : ");
			int price = sc.nextInt();
			System.out.println("::::::::::::::::::::::::::::::::::");
			drink[i] = new Drink(drinkName, price);
		}
		
		System.out.println(drink[0]);
		System.out.println(drink[1]);		// 주소값출력
		System.out.println(drink[2]);
		
		System.out.print("돈을 입력해 주세요. : ");
		int coin = sc.nextInt();
		
		// 입력받은 coin과 객체배열에 저장된 Drink 클래스가 가진
		// price 가격을 비교해서 coin보다 작거나 같은 음료이름을 출력
		
		for(int i = 0; i < drink.length; i++) {
			if(coin >= drink[i].price) {
				System.out.print(drink[i].name + "\t");
			}
		}
		System.out.println();
		
		sc.close();
		
	}

}
