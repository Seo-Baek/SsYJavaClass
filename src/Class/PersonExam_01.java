package Class;

public class PersonExam_01 {

	//멤버변수
	String name;
	String gender;
	int age;
	
	public PersonExam_01() {
		
	}	//기본생성자
	
	public PersonExam_01(String n, String g, int a) {//인자생성자
		name = n;
		gender = g;
		age = a;
	}
	
	
	//멤버메소드
	void output() {
		System.out.println("이  름 ==> " + name);
		if(gender.equalsIgnoreCase("male")) {
			System.out.println("성  별 ==> 남자");
		} else if (gender.equalsIgnoreCase("female")){
			System.out.println("성  별 ==> 여자");
		}
		System.out.println("나  이 ==> " + age + "세");
	}
}
