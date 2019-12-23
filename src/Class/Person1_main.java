package Class;

public class Person1_main {

	public static void main(String[] args) {
		
		Person1 person1 = new Person1();
		
		person1.name = "홍길동";
		person1.age = 28;
		person1.marrige = false;
		
		String marrige;
		if(person1.marrige) {
			marrige = "기혼";
		} else {
			marrige = "미혼";
		}
		
		System.out.println("이     름 ==> " + person1.name);
		System.out.println("나     이 ==> " + person1.age);
		System.out.println("결혼 여부 ==> " + marrige);
		System.out.println("자녀의 수 ==> " + person1.numberOfChild);
	}

}
