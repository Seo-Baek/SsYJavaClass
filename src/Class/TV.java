package Class;

/*
 * 클래스(Class)와 객체(object)
 * 	- 클래스 : 객체를 정의해 놓은 것 (추상화).
 * 	- 객체 : 클래스에 의해 만들어진 결과물(실제화).
 * 	  예) 제품설계도(클래스) ==> 제품(객체)
 * 	- 인스턴스화 : 클래스를 이용하여 객체를 생성하는 과정.
 * 	  클래스(1) : 객체(n)
 */

public class TV {
	
	//멤버변수
	String color;		// TV 색상
	boolean power;		// TV 전원
	int channel;		// TV 채널
	
	// 멤버메소드
	void power() {		// 전원을 누르는 메소드
		power = !power;
	}
	
	void channelUp() {	// TV 채널을 올리는 메소드
		if(power) {
			channel++;	//채널 증가
		}
	}
	void channelDown() {// TV 채널을 내리는 메소드
		if(power) {
			channel--;	//채널 감소
		}
	}
	void display() {	// TV 상태를 확인하는 메소드
		String status = null;
		if(power) {
			status = "전원 on";
		} else {
			status = "전원 off";
		}
		System.out.println("TV 색상 ==> " + color);
		System.out.println("TV 전원 ==> " + status);
		System.out.println("TV 채널 ==> " + channel);
	}
	
	
}
