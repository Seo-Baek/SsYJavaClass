package Class;

public class Car {
	
	//멤버변수
	int cc;				// 차량 배기량
	String model;		// 차량 모델명
	String color;		// 차량 색상
	String company;		// 제조사
	
	public Car() {  }	// 기본생성자
	
	public Car(int c, String m, String col, String com) {
		cc = c;
		model = m;
		color = col;
		company = com;
	}
	
	void prn() {
		System.out.println("차량 모델명 : " + model);
		System.out.println("차량 색  상 : " + color);
		System.out.println("차량 배기량 : " + cc);
		System.out.println("차량 제조사 : " + company);
	}

}
