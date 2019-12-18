package method;

/*
 * [문제] 1~100까지의 합을 구하는 프로그램을
 * 		 메소드로 만들고 main() 메소드에서
 * 		 해당 메소드를 호출하여 실행되도록 해보세요.
 */

public class Ex02 {
	public static void sum() {
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합은 " + sum + "입니다.");
	}
	public static void main(String[] args) {
		sum();
	}

}
