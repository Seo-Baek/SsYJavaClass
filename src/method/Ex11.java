package method;

import java.util.Scanner;

public class Ex11 {
	
	public static int sum2(int kor, int eng) {
		return kor + eng;
	}
	public static int sum3(int kor, int eng, int mat) {
		return kor + eng + mat;
	}
	public static int sum4(int kor, int eng, int mat, int his) {
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
		System.out.println("2과목 총점 ==> " + sum2(kor, eng) + "점");
		
		// 3과목 총점 메소드 호출
		System.out.println("3과목 총점 ==> " + sum3(kor, eng, mat) + "점");
		
		// 4과목 총점 메소드 호출
		System.out.println("2과목 총점 ==> " + sum4(kor, eng, mat, his) + "점");
		
		sc.close();
	}

}
