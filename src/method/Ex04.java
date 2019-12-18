package method;

import java.util.Scanner;

public class Ex04 {
	public static void accul(int su1 , int su2, String op) {
		
		switch(op) {
		case "+" :
			System.out.println(su1 + " + " + su2 + " ==> " +(su1 + su2));
			break;
		case "-" :
			System.out.println(su1 + " - " + su2 + " ==> " + (su1 - su2));
			break;
		case "*" :
			System.out.println(su1 + " * " + su2 + " ==> " + (su1 * su2));
			break;
		case "/" :
			System.out.println(su1 + " / " + su2 + " ==> " + (su1 / su2));
			break;
		default :
			System.out.println(su1 + " % " + su2 + " ==> " + (su1 % su2));
		}
	
	}

	public static void main(String[] args) {
		
		// 1. 키보드로 두 개의 정수와 연산자를 입력을 받자.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쨰 정수 입력 : ");
		int su1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int su2 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String op = sc.next();
		
		// 2. 연산자에 입력된 부호를 가지고 해당 부호에 맞는
		//	  메소드를 호출하여 출력하도록 한다.
		accul(su1 , su2 , op);
	
	}

}
