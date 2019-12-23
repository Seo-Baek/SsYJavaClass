package Class;

/*
 * 생성자 다중정의(constructor overloading)
 * 	- 동일한 클래스에서 동일한 이름의 생성자를
 * 	  여러 개 정의하는 문법.
 * 	- 조건 : 매개변수의 자료형 또는 매개변수의 개수가 달라야 함.
 * 	- 다중 정의를 하는 이유 : 객체를 다양하게 초기화하기 위함.
 * 	
 * 생성자의 역할
 * 	1. 객체를 생성하는 역할.
 * 	2. 멤버변수의 초기값을 설정하는 역할.
 * 	3. 객체를 생성하는 시점에 자동으로
 * 		처리해야 할 내용을 설정하는 역할.
 */

public class Member {
	
	String name; 	//이름 변수
	int age;		//나이 변수
	
	// public Member() {  }	 
	// 생성자의 특징 7, 인자 생성자가 있을 시 기본생성자가 없으면
	//			   메인에서 기본생성자로 객체를 생성할 떄에 만들라고 지시함.
	public Member(String n, int a) {
		name = n;
		age = a;
	}
	
	public Member() {   }

	void prn() {
		System.out.println("이  름 ==> " + name);
		System.out.println("나  이 ==> " +age);
	}
	
}
