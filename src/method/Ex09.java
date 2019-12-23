package method;

public class Ex09 {
	
	// 반환되는 값이 리터럴 상수가 반환되는 경우
	public static int method1() {
		return 50;
	}
	// 반환되는 값이 변수가 될 수 있다
	public static int method2(int su1, int su2) {
		int sum = (su1 * 2) + (su2 * 2) ;
		return sum;
	}
	// 반환되는 값이 수식인 경우;
	public static int method3(int su1, int su2) {
		return su1 + su2;
	}
	// 반환되는 값이 문자열인 경우
	public static String method4() {
		return "홍길동";
	}
	// 반환되는 값이 문자열 변수인 경우
	public static String method5(String s1, String s2) {
		String str = s1 + s2;
		return str;
	}
	// 반환되는 값이 문자열 결합(+) 연산인 경우
	public static String method6(String str1, String str2) {
		return str1 + str2;
	}
	public static double divide(double a1, double a2) {
		return a1 / a2;	//인트 타입 파라미터일 경우 인트가 계산되어서 0만 나온다!
	}

	
	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
		// 해당 넘어온 데이터(값)을 다른 곳에 사용하기 위해서 작성하는 문장.
		int su = method1();	//method1() 메소드호출
		
		System.out.println("method1() 메소드 호출 결과 ==> " + method1());
		System.out.println("method2() 메소드 호출 결과 ==> " + method2(200 , 175));
		System.out.println("method3() 메소드 호출 결과 ==> " + method3(132 , 55));
		System.out.println("method4() 메소드 호출 결과 ==> " + method4());
		System.out.println("method5() 메소드 호출 결과 ==> " + method5("대한" , "민국"));
		System.out.println("method6() 메소드 호출 결과 ==> " + method6("유", "관순"));
		System.out.println("프로그램 종료");
		
		byte b1 = 10;
		byte b2 = 20;
		
		System.out.println(divide(b1,b2));	//파라미터에 double대신 byte가 들어왔지만
											//byte의 크기가 더 작기 때문에 전달될 수 있다!
	}

}
