package method;

import java.util.Scanner;

/*
 * 1.3과목의 점수를 키보드로 입력을 받아서
 * 	 총점을 리턴(반환)하는 메소드를 작성하세요.
 * 	(3과목의 점수는 배열로 받아서 처리할 것)
 * 2. 반환받은 총점을 대상으로 평균을 구하세요.
 * 	(평균은 소수점 2자리까지만 출력할 것)
 */

public class Ex10 {
	
	public static int total() {
		
		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[3];
		int sum = 0;	//총점변수
		
		for(int i = 0; i < jumsu.length; i++) {
			System.out.print((i+1) + "번째 과목의 점수를 입력하세요. : ");
			jumsu[i] = sc.nextInt();
			sum += jumsu[i];
		}
		sc.close();	// return이 되면 반환되고 더 이상 진행이 되지 않기 때문에 
					// return;전에 해야 할 것은 다 끝내야한다.
		return sum;	// return문 하단에는 다른 문장이 와서는 안된다. error 발생 - Unreachable code
	}
	
	public static float average(int sum) {
		float avg = sum / 3.0f;
		System.out.printf("평 균  ==> %.2f점\n" , avg);	//출력을 하고  return;
		
		return avg;
	}
	
	public static String grade(double avg) {
		if(avg >= 90) {
			return "A학점";
		} else if(avg >= 80) {
			return "B학점";
		} else if(avg >= 70) {
			return "C학점";
		} else if(avg >= 60) {
			return "D학점";
		} else {
			return "F학점";
		}
	}
	public static void main(String[] args) {
		
		int tot = total();
		System.out.println("총 점  ==> " + tot + "점");
		
		//float avg = tot / 3.0f;
		//float avg = total() / 3.0f 도 가능하다.
		
		float avg = average(tot);
		
		System.out.println("학 점 ==> " + grade(avg));
		
	}

}
