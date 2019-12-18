package method;

/*
 * 메소드 호출 방식 2가지
 * 	1. Call by value
 * 		- 값을 전달하여 호출하는 방식
 * 		- 매개변수가 기본 자료형(int, float) 사용
 * 			> a 메소드 -> b메소드로 값을 전달해서 무슨 짓을 해고 a의 값은 변하지 않는다.
 * 		
 * 
 * 	2. Call by reference
 *		- 주소값을 전달하여 호출하는 방식.
 *		- 매개변수가 참조자료형(배열명, 클래스명) 사용 
 *			>>new를 이용하여 선언하는 애들은 전부 reference값을 준다
 *			> a메소드 -> b메소드로 주소값을 전달하여 같은 메모리값을 참조할 수 있으므로 영향을 줄 수 있다.
 */

public class Ex07 {
	public static void call(int num) {
		System.out.println("call() 메소드 호출");
		num = 100;	//변경
		
	}

	public static void main(String[] args) {
		
		//1. call by value
		int num = 200;
		System.out.println("메소드 호출 전");
		System.out.println("num == >" + num); //num ==> 200
		call(num);
		System.out.println("메소드 호출 후");
		System.out.println("num == >" + num); //num ==> 200
		
		/*
		 * 지역변수의 특징
		 * - 지역변수 : 메소드 내에서 선언된 모든 변수.
		 * - 해당 메소드를 실행 후에 종료되면 메모리에서 소멸된다. 
		 */
	}

}
