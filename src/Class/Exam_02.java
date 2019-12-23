package Class;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("사각형의 가로, 세로를 입력해주세요. ");
		RectangleExam_02 rec = new RectangleExam_02(sc.nextInt(), sc.nextInt());
		
		System.out.println("=========================================");
		rec.prn2();
		rec.prn1();
		
		sc.close();
	}

}
