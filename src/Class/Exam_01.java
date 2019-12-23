package Class;

import java.util.Scanner;

public class Exam_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 성별(male/female), 나이를 입력하세요.");
//		String name = sc.next();
//		String gender = sc.next();
//		int age = sc.nextInt();
		
		PersonExam_01 per = new PersonExam_01(sc.next(), sc.next(), sc.nextInt());
//		PersonExam_01 per = new . PersonExam_01();
//		name = per.name;
//		gender = per.gender;
//		age = per.age;
		
		System.out.println("=====================================");
		per.output();
		
		sc.close();
	}
}
