package Class;

public class PigSave {
	
	private int balance;		// 돼지저금통 잔액
	
	public PigSave() {  }		// 기본생성자
	
	public PigSave(int balance) {//인자생성자
		this.balance = balance;
	}

/*	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}*/
	
	public void deposit(int money) {	//입금 메소드
		System.out.println("돼지저금통에 입금을 합니다.");
		balance += money;
		System.out.println("현재 잔액 : " + balance + "원");
	}
	
	public void withdraw(int money) {	//출금 메소드
		System.out.println("돼지저금통 배따기");
		balance -= money;
		System.out.println("현재 잔액 : " + balance + "원");
	}
	
}
