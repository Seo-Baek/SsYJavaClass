package method;

import java.util.Scanner;

public class Exam {
	// 학생의 정보를 저장하는 메소드
	public static void input(String[] n, int[] h, String[] m, String[] p, Scanner sc) {
		for(int i = 0; i < n.length; i++) {
			System.out.print("학생 이름 입력 : ");
			n[i] = sc.next();
			System.out.print("학생 학번 입력 : ");
			h[i] = sc.nextInt();
			System.out.print("학생 학과 입력 : ");
			m[i] = sc.next();
			System.out.print("학생 연락처 입력 : ");
			p[i] = sc.next();
		}
		
	}
	// 학생의 정보를 출력하는 메소드
	public static void output(String[] n, int[] h, String[] m, String[] p) {
		for(int i = 0; i < n.length; i++) {
			System.out.println((i+1) + ". " + 
		                        "이름 " + n[i] + "\t" + 
					            "학번 " + h[i] + "\t" + 
		                        "학과 " + m[i] + "\t" +
					            "연락처 " + p[i] + "\n"
					            +"::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
	}
	// 학생의 정보를 조회하는 메소드
	public static void search(String[] n, int[] h, String[] m, String[] p, Scanner sc) {
		System.out.print("조회할 학생의 학번을 입력하세요. : ");
		int hakbun = sc.nextInt();
		for(int i = 0; i < h.length; i++) {
			if(hakbun == h[i]) {
				System.out.println("이  름 : " + n[i]);
				System.out.println("학  번 : " + h[i]);
				System.out.println("학  과 : " + m[i]);
				System.out.println("연락처 : " + h[i]);
			}
		}
	}
	// 학생의 정보를 수정하는 메소드
	public static void update(String[] n, int[] h, String[] m, String[] p, Scanner sc) {
		System.out.print("수정할 학생의 학번을 입력하세요. : ");
		int hakbun = sc.nextInt();
		for(int i = 0; i < h.length; i++) {
			if(hakbun == h[i]) {
				boolean b = true;
				while(b) {	// 여기서도 선택이 가능하게 수정을 해보았다.
					System.out.println("수정할 정보를 입력하세요.");
					System.out.println("1. 이름");
					System.out.println("2. 학과");
					System.out.println("3. 연락처");
					System.out.print(" : ");
					switch(sc.nextInt()) {
						case 1 : 
							System.out.print("수정할 이름을 입력하세요. : ");
							n[i] = sc.next();
							break;
						case 2 : 
							System.out.print("수정할 학과를 입력하세요. : ");
							m[i] = sc.next();
							break;
						case 3 : 
							System.out.print("수정할 연락처 입력하세요. : ");
							p[i] = sc.next();
							break;
						default :
							System.out.println("다시 입력해주세요.");
							continue;
					}
					b = false;
				}
			}
		}
	}
	// 프로그램을 종료하는 메소드
	public static void end(Scanner sc) {
		System.out.print("프로그램을 종료 하시겠습니까?[Y/N] : ");
		//String end = sc.next();
		if(sc.next().equalsIgnoreCase("Y")) {
			System.out.println("수고하셨습니다.");
			sc.close();
			// 시스템을 종료시키는 메소드
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {

		// 1. 키보드로 학생 수를 입력을 받자.
		
		// 2. 학생 이름 배열, 학번 배열, 학과 배열, 연락처 배열 만들어보자.
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요. : ");
		String[] name = new String[sc.nextInt()];	// 학생 이름 배열
		int[] hakbun = new int [name.length];		// 학생 학번 배열
		String[] major = new String[name.length];	// 학생 학과 배열
		String[] phone = new String[name.length];	// 학생 연락처 배열
		
		// 3. 무한 반복을 통하여 메뉴를 만들고 메소드를 호출
		while(true) {	// 무한반복
			System.out.println("*** 학생 관리 프로그램 ***");
			System.out.println("1. 학생 등록");
			System.out.println("2. 전체 출력");
			System.out.println("3. 학생 조회");
			System.out.println("4. 정보 수정");
			System.out.println("5. 프로그램 종료");
			System.out.print("학생관리 메뉴 중 하나를 선택하세요. : ");
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1 : // 학생 등록 메소드 호출
					input(name, hakbun, major, phone, sc);
					System.out.println();
					break;
				case 2 : // 학생 정보를 출력하는 메소드 호출
					output(name, hakbun, major, phone);
					System.out.println();
					break;
				case 3 : // 학생의 정보를 조회하는 메소드 호출
					search(name, hakbun, major, phone, sc);
					System.out.println();
					break;
				case 4 : // 학생의 정보를 수정하는 메소드 호출
					update(name, hakbun, major, phone, sc);
					System.out.println();
					break;
				case 5 : // 프로그램 종료 여부를 확인하는 메소드
					end(sc);
					break;
				default :// 잘못 입력했을 시 돌아가도록 수정해보았다.
					System.out.println("선택한 메뉴는 없는 메뉴입니다.");
					System.out.println("입력을 다시 해주세요. : ");
					continue;
			}
			
			
		
		
		}
	}
}
