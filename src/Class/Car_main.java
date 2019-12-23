package Class;

public class Car_main {

	public static void main(String[] args) {

		//Car 클래스의 기본생성자로 객체 생성
		Car car = new Car();
		car.model = "아반떼";
		car.color = "흰색";
		car.cc 	  = 1600;
		car.company = "현대자동차";
		car.prn();
		
		System.out.println();
		
		//Car 클래스의 인자생성자로 객체생성
		Car car1 = new Car(3300, "카니발", "검정", "기아자동차");
		car.prn();
		
	}

}
