package method;

import java.util.Scanner;

/*
 * 매개변수가 있는 메소드 정의
 * 형식)
 * 		[접근제한] 반환형 메소드이름 (type 변수1, type 변수2) {
 * 						메소드실행문;
 * 				}
 * 
 * 	- 실인수와 가인수
 * 		1) 실인수 : 매개변수에 전달할 실제 값 ==> 메소드를 호출할 떄 사용함.
 * 		2) 가인수 : 매개변수 ==> 메소드에 정의
 * 			- 실인수와 가인수는 반드시 type, 순서, 갯수가 일치해야한다.(중요!!!!)
 */

public class Ex03 {
	public static void prn() {
		System.out.println("prn() 메소드가 실행되었습니다.");
	}
	public static void total(int startNum, int endNum) {
		int sum = 0;
		for(int i = startNum; i <= endNum; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지의 합은 %d입니다.\n", startNum, endNum, sum);
	}

	public static void main(String[] args) {
		
		prn();
		total(20 , 80);
		total(200 , 500);
		total(1000 , 2500);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 정수 입력 : ");
		int start = sc.nextInt();
		System.out.print("종료 정수 입력 : ");
		int end = sc.nextInt();
		
		total(start, end);
		
		sc.close();
		
	}

}
