package Class;

public class Student_main {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.hakbun = 20190001;
		st.name = "홍길동";
		st.major = "경제학과";
		st.addr = "서울시 마포구";
		st.display();
		System.out.println();
		
		Student st1 = new Student(20190002, "이순신", "해양학과", "전남 신안군");
		st1.display();
	}

}
