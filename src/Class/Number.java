package Class;

/*
 * 캡슐화(Encapsulation) ?
 *  - 객체지향 프로그램의 4대 특징 중 하나
 *  - 정보 은닉 	: 클래스의 멤버 접근 제어 기법.
 *  - private 	: 외부에서 직접 접근 차단.
 *  - public	: 모든 클래스에서 접근 가능.
 *  - setter()	/ getter() 메소드로 접근 가능.
 *  	=> setter() : 지정자 메소드
 *  	=> getter() : 획득자 메소드
 */

public class Number {
	
	// 멤버변수
	private int num1;
	private int num2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	/*
	 * this : 멤버 자기자신을 의미 <- this는 인스턴스의 자기자신(Number Class)을 의미하는 것!
	 * 	- 주로 멤버변수와 메소드 또는 생성자의 매개변수 이름이 동일할 때
	 * 	  인스턴스 멤버임을 명확히 하기 위해 사용.
	 * 	- 매개변수(지역변수)와 멤버변수(전역변수)의 이름이 같을 때
	 * 	   멤버변수(전역변수) 앞에 this라는 키워드를 붙여서 구분한다.
	 * 	- 지역변수와 전역변수의 이름이 같으면 우선순위는 지역변수가 높다.
	 */
	
	/*
	 * setter() 메소드로 초기값 할당.
	 * 	- private 멤버 변수에 값을 지정(초기값 할당)하는 역할.
	 * 	  형식)
	 * 		public void set멤버변수명(자료형 메개변수) {
	 * 			 멤버변수 = 매개변수;
	 * 		}
	 */
//	public void setNum1(int n1) {
//		num1 = n1;
//	}
//	public void setNum2(int n2) {
//		this.num2 = n2;
//	}
//	public void setNumber(int n1, int n2) {
//		num1 = n1;
//		num2 = n2;
//	}
//	
//	
//	/*  getter() 메소드로 할당된 값 가져오기.
//	  	- private 멤버변수에 할당된 값을 가져오는 역할
//	  	  형식)
//	  		public 반환형 get멤버변수명() {
//	  			 멤버변수 = 매개변수;
//	  		}*/
//	 
//	
//	public int getNum1() {
//		return num1;
//	}
//	public int getNum2() {
//		return num2;
//	}
	
	
	
	
}
