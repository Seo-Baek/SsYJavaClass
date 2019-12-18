package method;

import java.util.Scanner;

/*
 * 메소드(method)?
 * 1. C언어에서의 함수(function)과 같음.
 * 2. 기능을 정의하는 단위(예 : 덧셈기능, 뺄셈기능)
 * 3. 하나의 기능만을 정의하는 것이 좋음.
 * 4. 자주 반복되는 내용을 정의해 놓고, 필요 시 호출하여 사용한다.
 * 		형식)
 * 			[접근제한] 반환형 메소드이름(매개변수 혹은 인자) {
 * 					실행문;
 * 			}
 * 		- 접근제한 : public > protected > default > private
 * 				  (클래스, 변수, 메서드 앞에 기재된다.)
 * 				  	1) public	 : 누구나 다, 아무나 누구든지 접근 가능
 * 					2) protected : 같은 패키지, 다른 패키지는 상속관계에서는 접근 가능
 * 					3) default	 : 같은 패키지에서만 접근 가능. 상속관계도 접근 안 됨.
 * 					4) private	 : 외부에서 접근 불가.
 * 		- 반환형 	: - 메소드에서 실행된 결과값을 돌려주는 자료형으로 생략이 불가능함.
 * 				  - 해당 메소드가 어떤 동작이나 기능을 실행한 후 결과를 알려주는 자료형.
 * 				  - 메소드를 호출한 곳으로 결과를 되돌려줄 때 사용하는 자료형.
 * 				  - 만약 결과를 되돌려 줄 필요가 없는 경우에는 void라는 키워드를 작성함.
 * 				  - 반환형이 void인 경우를 제외하고 결과를 되돌려주어야 할 떄는
 * 					메소드 명령문 맨 끝에 return;이라는 키워드를 사용 후, 반환형과 같은 자료형으로
 * 					결과를 되돌려준다.
 * 		- 메소드이름 : 식별자, 소문자로 시작, 두 개의 단어가 결합된 경우에는 
 * 					두번쨰 글자의 첫 글자를 대문자로 작성하는 것이 관례임.
 * 		- 매개변수 : 	외부에서 값을 넘겨받는 변수, 생략가능.
 * 		- 실행문	: 	해당 메소드가 호출된 경우에만 실행됨.
 */

public class Ex01 {
//	메소드는 class 안, main 바깥에 만들어준다!
	
	public static void add() {
		System.out.println("10 + 20 ==> 30");
	}
	// 키보드로 배열의 크기를 입력받고 
	// 해당 배열의 크기만큼 정수를 입력을 받아서 출력해보자.
	public static void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력 : ");
		int[] arr = new int [sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int k : arr) {
			System.out.println("arr 배열 요소 ==> " + k);
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		add();	//메소드 호출
		input();	//input() 메소드 호출
		System.out.println("프로그램 종료");
	}

}
