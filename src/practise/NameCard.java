package practise;

public class NameCard {
	
	String name;
	String phone;
	String addr;
	String pos;
	
	public NameCard() {    }
	public NameCard(String name, String phone, String addr, String pos) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.pos = pos;
	}
	
	public void output() {
		System.out.println("====================================");
		System.out.println("이     름	: " + name);
		System.out.println("전화번호	: " + phone);
		System.out.println("주     소	: " + addr);
		System.out.println("직     급 	: " + pos);
	}
}
