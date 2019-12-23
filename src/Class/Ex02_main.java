package Class;

public class Ex02_main {

	public static void main(String[] args) {
		
		System.out.println(Ex02.num);
		System.out.println("adder() 메소드 호출 결과 ==> " + Ex02.adder(200,100));
		System.out.println();
		
		//System.out.println(Ex02.su1); 오류!
		Ex02 ex02 = new Ex02();
		System.out.println(ex02.su1);
		System.out.println(ex02.su2);
		ex02.sum();
		
	}

}
