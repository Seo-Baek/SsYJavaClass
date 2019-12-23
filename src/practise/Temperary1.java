package practise;

public class Temperary1 {
	private String name;
	private int time;
	private	int pay;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public void giveMoney() {
		int giving = time * pay;
		double vat = giving * 0.03;
		prn(giving, vat);
	 }
	 void prn(int giving, double vat) {
		 System.out.printf("이 름\t: %8s\n" ,name);
		 System.out.printf("총급여\t: %,8d원\n" ,giving);
		 System.out.printf("공제액\t: %,8d원\n" , (int)vat);
		 System.out.printf("실지급액\t: %,8d원",  (int)(giving - vat));
	 }
	
	
}
