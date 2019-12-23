package method;

/*
 *  메소드 다중정의(method overloading)
 *  	 1. 동일한 클래스에서 동일한 이름의 메소드가
 *  		여러 개 정의되는 자바 문법.
 *  	 2. 일관된 메소드 이름을 정의할 수 있어서 개발자(사용자)에게
 *  		코드의 직관성을 제공해 줌.
 *  
 *  [메소드 다중 정의 규칙]
 *  	 1. 메소드 이름이 동일함.
 *  	 2. 반드시 매개변수는 자료형 또는 매개변수의 개수가 달라야 함. - 중요!
 *  	 3. 리턴타입(반환형)은 무관함.
 */

import java.util.Scanner;

public class Ex12 {

		public static int sum(int kor, int eng) {
			return kor + eng;
		}
		public static int sum(int kor, int eng, int mat) {
			return kor + eng + mat;
		}
		public static int sum(int kor, int eng, int mat, int his) {
			return kor + eng + mat + his;
		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 점수 입력 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 입력 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 입력 : ");
			int mat = sc.nextInt();
			System.out.print("역사 점수 입력 : ");
			int his = sc.nextInt();
			
			// 2과목 총점 매소드 호출
			System.out.println("2과목 총점 ==> " + sum(kor, eng) + "점");
			
			// 3과목 총점 메소드 호출
			System.out.println("3과목 총점 ==> " + sum(kor, eng, mat) + "점");
			
			// 4과목 총점 메소드 호출
			System.out.println("2과목 총점 ==> " + sum(kor, eng, mat, his) + "점");
			
			sc.close();
		}

}
