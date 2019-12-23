package Class;

public class Member_main {

	public static void main(String[] args) {
		
		// Member 클래스를 기본 생성자로 객체 생성
		Member mem = new Member();
		mem.name = "유관순";
		mem.age = 19;
		mem.prn();
		System.out.println();
		
		
		// Member 클래스를 인자 생성자로 객체 생성
		Member mem1 = new Member("김유신", 23);
		mem1.prn();
	}

}
