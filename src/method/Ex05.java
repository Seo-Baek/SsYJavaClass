package method;

import java.util.Scanner;

public class Ex05 {
	public static void copy(int[] s) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < s.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			s[i] = sc.nextInt();
		}
		
		sc.close();
	}
	

	public static void main(String[] args) {
		
		// 배열의 크기를 키보드로 입력받아서
		// 배열의 각 인덱스에 성적을 입력받아 저장해보자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int[] arr = new int[sc.nextInt()];
		
		// 키보드로 각 과목의 정수를 입력받아서 배열에 저장을 하자.
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		System.out.println();
		
		//총점 메소드를 호출해보자.
		copy(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		sc.close();
		
	}

}
