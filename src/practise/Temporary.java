package practise;

public class Temporary {
	
	String name;
	int time;
	int pay;
	
	public Temporary() {  }
	public Temporary(String name, int time, int pay) {
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	 public void giveMoney() {
		 int giving = time * pay;
		 int vat = (int)(giving * 0.03);
		 System.out.println("이름 : " + name);
		 System.out.printf("총급여 : %,3d원\n" ,giving);
		 System.out.printf("공제액 : %,3d원\n" , vat);
		 System.out.printf("실지급액 : %,3d원",  (giving - vat));
		 
	 }
	
	
}
