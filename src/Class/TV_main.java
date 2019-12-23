package Class;

public class TV_main {

	public static void main(String[] args) {
		
		TV tv = new TV();
		
		tv.display();
		System.out.println();
		
		tv.color = "검정색";
		tv.channel = 7;
		tv.channelUp();
		tv.display();
		System.out.println();
		
		// TV 작동
		tv.power();		// 전원 on
		tv.channelUp();	// TV 채널 하나 증가
		tv.display();
		System.out.println();
		
		/*
		 * [문제1] TV 객체를 생성하되 tv1이라는 참조변수를 이용하여
		 * 		  아래와 같이 정보를 변경하세요.
		 * 		 조건1) 색상 흰색, 전원 off, 채널 15
		 * 		 조건2) tv1 정보를 출력 - display() 메소드 호출
		 * 		 조건3) tv1 정보를 다음과 같이 변경하여 출력해보세요.
		 * 			   색상 흰색, 전원 on, 채널 28
		 */
		
		TV tv1 = new TV();
		tv1.color = "흰색";
		tv1.channel = 15;
		tv1.display();
		System.out.println();
		tv1.power();
		for(int i = 15; i <= 27; i++) {
			tv1.channelUp();
		}
		tv1.display();
		System.out.println();
		
		
		/*
		 * [문제2] TV 객체를 생성하되 tv2라는 참조변수를 이용하여
		 * 		  아래와 같이 정보를 변경하세요.
		 * 		 조건1) 색상 흰색, 전원 off, 채널 32
		 * 		 조건2) tv2 정보를 출력 - display() 메소드 호출
		 * 		 조건3) tv2 정보를 다음과 같이 변경하여 출력해보세요.
		 * 			   색상 검정색, 전원 on, 채널 11
		 */
		
		TV tv2 = new TV();
		tv2.color = "흰색";
		tv2.channel = 32;
		tv2.display();
		System.out.println();
		tv2.color = "검정색";
		tv2.power();
		for(int i = 32; i >= 12; i--) {
			tv2.channelDown();
		}
		tv2.display();
		
		
	}

}
