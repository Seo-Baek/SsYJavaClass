package Class;

public class Number_main {

	public static void main(String[] args) {
		
		Number num = new Number();
		//num.num1 = 200;	// private 접근 지정자의 멤버 접근 불가능.
		//num.num2 = 100;	// private 접근 지정자의 멤버 접근 불가능.
		num.setNum1(200);
		System.out.println("num1 ==> " + num.getNum1());
		num.setNum2(100);
		System.out.println("num2 ==> " + num.getNum2());
		
		
	}

}
